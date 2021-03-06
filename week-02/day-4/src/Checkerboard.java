import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {

    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.

//        The ready function:

        Checkmate(graphics);
    }


//    Here I make the function "Checkmate".

    public static void Checkmate(Graphics graphics) {

//      Here I declare some useful variables.

        int xAxis = 0;
        int yAxis = 0;
        int width = 30;
        int height = 30;
        int boardSize = 8;
        boolean isWhite = true;

//        Here I made a nested for loop.
//        Variable "rows" defines what happens in every row.
//        Variable "columns" defines what happens in every column.

        for (int rows = 0; rows < boardSize; rows++) {
            for (int columns = 0; columns < boardSize; columns++) {

//                Here I increase the  zero-point of the rectangle by 30,
//                every time variable "columns" is smaller than variable "boardSize"
//                This will give me 8 rectangles closely after each other in the top of the screen

                xAxis += 30;

//              Here I simply ask whether the "isWhite" boolean is true or not.
//              If true, I color the rectangles white.
//              If false, I color the rectangles black.

                if (isWhite) {
                    graphics.setColor(Color.WHITE);
                } else {
                    graphics.setColor(Color.BLACK);
                }

//              Here I make the rectangle with the necessary arguments(?)
//              "xAxis" and "yAxis" defines the position,
//              "width" and "height" defines the size of the rectangle.

                graphics.fillRect(xAxis, yAxis, width, height);

//              Every time the second loop is about to end,
//              I change the color to its opposite value.
//              It returns the checkerboard pattern.
//              white-black-white-black

                isWhite = !isWhite;

            }
//          After the "columns" loop finished I start to make alterations in the "rows" loop.

//          I set the xAxis zero-point value to 0, in other words,
//          to the top left corner.
//          With the increase of the yAxis I start to make the next row.

//          I also change the starting color of every single row, thanks to the for loop.

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
