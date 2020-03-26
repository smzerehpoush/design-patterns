package behavioral.command;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public abstract class Command {
    protected Editor editor;
    private String before;
    private String after;

    public Command(Editor editor) {
        this.editor = editor;
    }

    protected void backUp() {
        this.before = editor.getTextField().getText();
    }

    protected void backUpAfter() {
        this.after = editor.getTextField().getText();
    }

    protected void undo() {
        editor.getTextField().setText(this.before);
    }

    protected void redo() {
        editor.getTextField().setText(this.after);
    }

    protected abstract boolean execute();
}
