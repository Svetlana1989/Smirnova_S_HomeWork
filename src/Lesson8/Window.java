package Lesson8;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public Window() throws HeadlessException {
        setSize(500,500);
        setLocation(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
        BorderLayout borderLayout = new BorderLayout();
        GridLayout gridLayout = new GridLayout(3, 3);

        JPanel panel = new JPanel(borderLayout);

        JButton ok = new JButton("OK");

        JLabel label = new JLabel();

        JTextField textField = new JTextField();
        textField.setText("Добро пожаловать!");

        JButton cancel = new JButton("Cancel");

        panel.add (ok, BorderLayout.CENTER);
        panel.add (cancel, BorderLayout.NORTH);
        panel.add(label, BorderLayout.EAST);
        panel.add(textField, BorderLayout.WEST);

        ok.addActionListener(a -> {
            String text = textField.getText();
            label.setText(text);
        });

        add(panel);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Window();

    }
}
