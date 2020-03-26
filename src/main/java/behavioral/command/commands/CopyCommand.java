package behavioral.command.commands;

import behavioral.command.Command;
import behavioral.command.Editor;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class CopyCommand extends Command {
    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    protected boolean execute() {
        if (this.editor.getTextField().getSelectedText() != null &&
                !this.editor.getTextField().getSelectedText().isEmpty())
            this.editor.setClipboard(this.editor.getTextField().getSelectedText());
        return false;
    }
}
