import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics) {
        // draw four different size and color rectangles.
        // avoid code duplication.

        makeRectangles(graphics);

    }

    public static void makeRectangles(Graphics graphics) {

        for (int i = 0; i < 4; i++) {
            int x = (int) (Math.random() * 720);
            int y = (int) (Math.random() * 720);
            int width = (int) (Math.random() * 100);
            int height = (int) (Math.random() * 100);
            int R = (int) (Math.random() * 256);
            int B = (int) (Math.random() * 256);
            int G = (int) (Math.random() * 256);
            graphics.setColor(new Color(R, B, G));
            graphics.fillRect(x, y, width, height);
        }
    }


    // Don't touch the code below
    static int WIDTH = 720;
    static int HEIGHT = 720;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            this.setBackground(Color.WHITE);
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
