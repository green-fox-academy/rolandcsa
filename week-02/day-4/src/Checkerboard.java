import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {


    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        Checkmate(graphics);
    }


    public static void Checkmate(Graphics graphics) {
        int x = 0;
        int y = 0;
        int width = 30;
        int height = 30;
        int boardSize = 8;
        boolean isRed = true;

        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                x += 30;
                if (isRed == true) {
                    graphics.setColor(Color.RED);
                } else {
                    graphics.setColor(Color.BLACK);
                }
                graphics.fillRect(x, y, width, height);
                isRed = !isRed;
            }
            isRed = !isRed;
            x = 0;
            y += 30;
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
