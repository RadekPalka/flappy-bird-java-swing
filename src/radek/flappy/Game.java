package radek.flappy;

import radek.flappy.ui.GamePanel;

import javax.swing.*;
import java.io.IOException;

public class Game {
    private JFrame frame;

    public void start() throws IOException {
        frame = new JFrame("Flappy bird");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GamePanel panel = new GamePanel();
        frame.add(panel);
        frame.pack();
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        panel.requestFocusInWindow();
    }


}
