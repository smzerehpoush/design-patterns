package behavioral.command;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class CutCommand extends Command {
    public CutCommand(Editor editor) {
        super(editor);
    }

    @Override
    protected boolean execute() {
        if (this.editor.getTextField().getSelectedText() == null ||
                this.editor.getTextField().getSelectedText().isEmpty())
            return false;
        backUp();
        this.editor.setClipboard(this.editor.getTextField().getSelectedText());
        this.editor.getTextField().setText(
                this.editor.getTextField().getText().substring(0, this.editor.getTextField().getSelectionStart()) +
                        this.editor.getTextField().getText().substring(this.editor.getTextField().getSelectionEnd())
        );
        return true;
    }
}
