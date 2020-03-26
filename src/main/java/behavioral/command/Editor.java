package behavioral.command;

import behavioral.command.commands.CopyCommand;
import behavioral.command.commands.CutCommand;
import behavioral.command.commands.PasteCommand;

import javax.swing.*;
import java.awt.*;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class Editor {
    private JTextArea textField;
    private String clipboard;
    private CommandHistory commandHistory = new CommandHistory();
    private Command lastExecutedCommand;

    public void init() {
        JFrame frame = new JFrame("Simple Text Editor");
        JPanel panel = new JPanel();

        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        textField = new JTextArea();
        textField.setLineWrap(true);
        panel.add(textField);

        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton copyButton = new JButton("Copy");
        JButton pasteButton = new JButton("Paste");
        JButton cutButton = new JButton("Cut");
        JButton undoButton = new JButton("Undo");
        JButton redoButton = new JButton("Redo");

        Editor editor = this;
        copyButton.addActionListener(e -> executeCommand(new CopyCommand(editor)));
        pasteButton.addActionListener(e -> executeCommand(new PasteCommand(editor)));
        cutButton.addActionListener(e -> executeCommand(new CutCommand(editor)));
        undoButton.addActionListener(e -> undo());
        redoButton.addActionListener(e -> redo());

        buttons.add(copyButton);
        buttons.add(pasteButton);
        buttons.add(cutButton);
        buttons.add(undoButton);
        buttons.add(redoButton);
        panel.add(buttons);

        frame.setSize(500, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void executeCommand(Command command) {
        if (command.execute()) {
            commandHistory.push(command);
            lastExecutedCommand = command;
        }
    }

    private void undo() {
        if (commandHistory.isEmpty()) {
            this.textField.setText(null);
            return;
        }
        Command command = commandHistory.undo();
        if (command != null) {
            command.undo();
        }
    }

    private void redo() {
        if (commandHistory.isEmpty()) {
            this.textField.setText(null);
            return;
        }
        Command command = commandHistory.redo();
        if (command != null && command != lastExecutedCommand) {
            command.redo();
            lastExecutedCommand = command;
        }
    }

    public JTextArea getTextField() {
        return textField;
    }

    public String getClipboard() {
        return clipboard;
    }

    public void setClipboard(String clipboard) {
        this.clipboard = clipboard;
    }
}
