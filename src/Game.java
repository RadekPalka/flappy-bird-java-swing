import ui.GamePanel;

import javax.swing.*;

public class Game {
    private JFrame frame;

    public void start(){
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
