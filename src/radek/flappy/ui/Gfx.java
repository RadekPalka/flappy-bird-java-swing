package radek.flappy.ui;

import java.awt.*;
import java.awt.image.BufferedImage;

public final class Gfx {
    private Gfx() {}

    public static Graphics2D g2(Graphics g) {
        return (Graphics2D) g;
    }

    public static void enableQuality(Graphics2D g2) {
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
    }

    public static void drawCenteredString(Graphics2D g2, String text, int cx, int cy) {
        FontMetrics fm = g2.getFontMetrics();
        int x = cx - fm.stringWidth(text) / 2;
        int y = cy - (fm.getAscent() - fm.getDescent()) / 2;
        g2.drawString(text, x, y);
    }

    public static void drawImageScaled(Graphics2D g2, Image img, int x, int y, int w, int h) {
        g2.drawImage(img, x, y, w, h, null);
    }
}
