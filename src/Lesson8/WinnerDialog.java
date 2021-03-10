package Lesson8;

import javax.swing.*;
import java.awt.*;

public class WinnerDialog extends JFrame {

    private JFrame game;

    public WinnerDialog(JFrame game, String res) throws HeadlessException {
        this.game = game;
        game.dispose();
        setSize(150,150);
        JPanel panel = new JPanel();
        JButton newGame = new JButton("NEW GAME");
        JButton exit = new JButton("EXIT");
        JLabel result = new JLabel();
        result.setText(res);
        panel.add (result, CENTER_ALIGNMENT);
        panel.add(newGame);
        panel.add(exit);
        newGame.addActionListener(a -> {
            new GameWindow();
            dispose();
        });
        exit.addActionListener(a -> {
            dispose();
            System.exit(0);
        });
        add(panel);
        setVisible(true);

    }
}
