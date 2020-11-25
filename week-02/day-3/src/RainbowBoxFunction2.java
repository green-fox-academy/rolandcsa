import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction2 {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).
        ArrayList<Color> colors = new ArrayList<>();
        colors.add(Color.RED);
        colors.add(Color.ORANGE);
        colors.add(Color.YELLOW);
        colors.add(Color.GREEN);
        colors.add(Color.BLUE);
        colors.add(new Color(63, 0, 255));
        colors.add(new Color(127, 0, 255));
        int size = 150;
        System.out.println(colors);

        for (int i = 0; i < colors.size(); i++) {
            size -= 15;
            graphics.setColor(colors.get(i));
            graphics.fillRect(WIDTH / 2 - size / 2, HEIGHT / 2 - size / 2, size, size);
        }
    }

//        for (int i = 0; i < 7; i++) {
//            size -= 15;
//            if (colors.get(i).equals("red")){
//                graphics.setColor(Color.RED);
//            }
//            if (colors.get(i).equals("orange")){
//                graphics.setColor(Color.ORANGE);
//            }
//            if (colors.get(i).equals("yellow")){
//                graphics.setColor(Color.YELLOW);
//            }
//            if (colors.get(i).equals("green")){
//                graphics.setColor(Color.GREEN);
//            }
//            if (colors.get(i).equals("blue")){
//                graphics.setColor(Color.BLUE);
//            }
//            if (colors.get(i).equals("indigo")){
//                graphics.setColor(new Color(63,0,255));
//            }
//            if (colors.get(i).equals("violet")){
//                graphics.setColor(new Color(127,0,255));
//            }
//        graphics.fillRect(WIDTH / 2 - size / 2, HEIGHT / 2 - size / 2, size, size);
//    }


    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

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
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
