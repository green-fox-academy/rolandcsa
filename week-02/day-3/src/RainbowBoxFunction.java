import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).

        for (int i = 0; i < 7; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the size of the square!");
            int size = scanner.nextInt();
            System.out.println("Enter the color of the square!");
            String color = scanner.next();
            if (color.equals("red")) {
                graphics.setColor(Color.RED);
            }
            if (color.equals("orange")) {
                graphics.setColor(Color.ORANGE);
            }
            if (color.equals("yellow")) {
                graphics.setColor(Color.YELLOW);
            }
            if (color.equals("green")) {
                graphics.setColor(Color.GREEN);
            }
            if (color.equals("blue")) {
                graphics.setColor(Color.BLUE);
            }
            if (color.equals("indigo")) {
                graphics.setColor(new Color(63, 0, 255));
            }
            if (color.equals("violet")) {
                graphics.setColor(new Color(127, 0, 255));
            }
            graphics.fillRect(WIDTH / 2 - size / 2, HEIGHT / 2 - size / 2, size, size);
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
