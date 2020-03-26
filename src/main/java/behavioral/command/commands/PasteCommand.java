package behavioral.command.commands;

import behavioral.command.Command;
import behavioral.command.Editor;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class PasteCommand extends Command {
    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    protected boolean execute() {
        if (this.editor.getClipboard() == null || this.editor.getClipboard().isEmpty())
            return false;
        backUp();
        this.editor.getTextField().insert(this.editor.getClipboard(), this.editor.getTextField().getCaretPosition());
        backUpAfter();
        return true;
    }
}
