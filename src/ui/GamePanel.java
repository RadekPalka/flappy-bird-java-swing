package ui;

import config.GameConfig;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    public GamePanel(){
        setPreferredSize(new Dimension(GameConfig.BOARD_WIDTH, GameConfig.BOARD_HEIGHT));
        setFocusable(true);
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("Hello Flappy", 20, 30);
    }
}
