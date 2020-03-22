package behavioral.command;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public abstract class Command {
    protected Editor editor;
    private String backup;

    public Command(Editor editor) {
        this.editor = editor;
    }

    protected void backUp() {
        this.backup = editor.getTextField().getText();
    }

    protected void undo() {
        editor.getTextField().setText(this.backup);
    }

    protected abstract boolean execute();
}
