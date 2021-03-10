package Lesson8;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {

    private static final ImageIcon def = new ImageIcon("def2.png");
    private static final ImageIcon o = new ImageIcon("O2.png");
    private static final ImageIcon x = new ImageIcon("X2.png");

    private JButton [][] map;
//    private char [][] charMap;


    public GameWindow() throws HeadlessException {
        setSize(360,360);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        GridLayout layout = new GridLayout(3,3);
        JPanel panel = new JPanel(layout);


        map = new JButton[3][3];

//        if (map[i][j].getIcon().equals(def));


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JButton button = new JButton();
                button.setIcon(def);


//                final int posI = i;
//                final int posJ = j;

                button.addActionListener(a -> {
                    button.setIcon(x);
                    showWinnerDialog("Вы победили!");
                    // Проверить победу

                    movePc();
                    // Проверить победу и ничью

//                    charMap [posI][posJ] = 'x';
                });
                panel.add(new JButton());
                map[i][j] = button;
            }
        }
        add(panel);
        setResizable(false);
        setVisible(true);
    }


    private void showWinnerDialog(String result){
        new WinnerDialog(this, result);

    }


    private void movePc(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (map[i][j].getIcon().equals(def)){
                    map[i][j].setIcon(o);
                    return;
                }
            }
        }
    }


    public static void main(String[] args) {
        new GameWindow();
    }
}
