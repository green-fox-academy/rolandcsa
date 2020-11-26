import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CheckerboardCodeOnly {

    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.

        Checkmate(graphics);
    }

    public static void Checkmate(Graphics graphics) {

        int xAxis = 0;
        int yAxis = 0;
        int width = 30;
        int height = 30;
        int boardSize = 8;
        boolean isWhite = true;

        for (int rows = 0; rows < boardSize; rows++) {
            for (int columns = 0; columns < boardSize; columns++) {

                xAxis += 30;
                if (isWhite) {
                    graphics.setColor(Color.WHITE);
                } else {
                    graphics.setColor(Color.BLACK);
                }
                graphics.fillRect(xAxis, yAxis, width, height);
                isWhite = !isWhite;

            }

            isWhite = !isWhite;
            xAxis = 0;
            yAxis += 30;
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
            this.setBackground(Color.GRAY);
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}

