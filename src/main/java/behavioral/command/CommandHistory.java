package behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class CommandHistory {
    private final List<Command> commands = new ArrayList<>();
    private int index = -1;

    public void push(Command command) {
        this.commands.add(command);
        index = this.commands.size() - 1;
    }

    public Command undo() {
        if (index < 1)
            if (!commands.isEmpty())
                return this.commands.get(0);
            else
                return null;
        return this.commands.get(index--);
    }

    public Command redo() {
        if (index >= commands.size() - 1) {
            if (commands.isEmpty())
                return null;
            else {
                return commands.get(commands.size() - 1);
            }
        }
        return this.commands.get(index++);
    }

    public boolean isEmpty() {
        return this.commands.isEmpty();
    }
}
