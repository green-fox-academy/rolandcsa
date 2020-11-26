import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.
        lines(graphics);
    }

    public static void lines(Graphics graphics) {
        int x = 0;
        int y = 0;
        int horizontalCenter = WIDTH / 2;
        int verticalCenter = HEIGHT / 2;
        int z = 360 / 20;

        for (int i = 0; i <= z; i++) {
            graphics.setColor(Color.BLACK);
            graphics.drawLine(x, y, horizontalCenter, verticalCenter);
            x += 20;
        }
        x = 0;
        for (int i = 0; i <= z; i++) {
            graphics.setColor(Color.BLACK);
            graphics.drawLine(x, y, horizontalCenter, verticalCenter);
            y += 20;
        }
        x = 360;
        for (int i = 0; i <= z; i++) {
            graphics.setColor(Color.BLACK);
            graphics.drawLine(x, y, horizontalCenter, verticalCenter);
            y -= 20;
        }
        y = 360;
        for (int i = 0; i <= z; i++) {
            graphics.setColor(Color.BLACK);
            graphics.drawLine(x, y, horizontalCenter, verticalCenter);
            x -= 20;
        }
    }


    // Don't touch the code below
    static int WIDTH = 360;
    static int HEIGHT = 360;

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
