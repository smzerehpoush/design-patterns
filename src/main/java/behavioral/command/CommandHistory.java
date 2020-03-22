package behavioral.command;

import java.util.Stack;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class CommandHistory {
    private Stack<Command> commands = new Stack<>();

    public void push(Command command) {
        this.commands.push(command);
    }

    public Command pop() {
        return this.commands.pop();
    }

    public boolean isEmpty() {
        return this.commands.isEmpty();
    }
}
