package radek.flappy.ui;

import radek.flappy.config.GameConfig;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class GamePanel extends JPanel {
    private final Image background;

    public GamePanel() throws IOException {
        setPreferredSize(new Dimension(GameConfig.BOARD_WIDTH, GameConfig.BOARD_HEIGHT));
        setFocusable(true);
        String path = "/assets/graphics/flappybirdbg.png";
        URL url = getClass().getResource(path);
        background = ImageIO.read(url);
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        var g2 = Gfx.g2(g);
        Gfx.enableQuality(g2);

        Gfx.drawImageScaled(g2, background, 0, 0, getWidth(), getHeight());
        Gfx.drawCenteredString(g2, "Hello Flappy!", getWidth()/2, 40);
        g.drawString("Hello Flappy", 20, 30);
    }
}
