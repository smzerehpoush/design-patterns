package behavioral.command;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class CopyCommand extends Command {
    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    protected boolean execute() {
        this.editor.setClipboard(this.editor.getTextField().getText());
        return false;
    }
}
