package behavioral.command;

import javax.swing.*;
import java.awt.*;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class Editor {
    private JTextArea textField;
    private String clipboard;
    private CommandHistory commandHistory = new CommandHistory();

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

        Editor editor = this;
        copyButton.addActionListener(e -> executeCommand(new CopyCommand(editor)));
        pasteButton.addActionListener(e -> executeCommand(new PasteCommand(editor)));
        cutButton.addActionListener(e -> executeCommand(new CutCommand(editor)));
        undoButton.addActionListener(e -> undo());

        buttons.add(copyButton);
        buttons.add(pasteButton);
        buttons.add(cutButton);
        buttons.add(undoButton);
        panel.add(buttons);

        frame.setSize(500, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void executeCommand(Command command) {
        if (command.execute())
            commandHistory.push(command);
    }

    private void undo() {
        if (commandHistory.isEmpty()) {
            this.textField.setText(null);
            return;
        }
        Command command = commandHistory.pop();
        if (command != null)
            command.undo();
    }

    public JTextArea getTextField() {
        return textField;
    }

    public void setTextField(JTextArea textField) {
        this.textField = textField;
    }

    public String getClipboard() {
        return clipboard;
    }

    public void setClipboard(String clipboard) {
        this.clipboard = clipboard;
    }
}
