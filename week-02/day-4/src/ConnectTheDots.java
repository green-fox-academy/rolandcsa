import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 2 parameters:
        // An array of {x, y} points and graphics
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}

        polygon(graphics);
        fox(graphics);
    }

    public static void polygon(Graphics graphics) {
        int[] x = {10, 290, 290, 10};
        int[] y = {10, 10, 290, 290};
        graphics.setColor(Color.GREEN);
        graphics.drawPolygon(x, y, 4);
    }

    public static void fox(Graphics graphics) {
        int[] x = {50, 70, 80, 90, 100, 120, 85, 50};
        int[] y = {100, 70, 90, 90, 70, 100, 130, 100};
        graphics.setColor(Color.GREEN);
        graphics.drawPolygon(x, y, 8);
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
