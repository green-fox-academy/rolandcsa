import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)
        
//        ArrayList<Color> gray = new ArrayList<>();
//        gray.add(new Color(255, 255, 255));
//        gray.add(new Color(211, 211, 211));
//        gray.add(new Color(192, 192, 192));
//        gray.add(new Color(169, 169, 169));
//        gray.add(new Color(128, 128, 128));
//        gray.add(new Color(105, 105, 105));

        int stars = 50 + (int) (Math.random() * 50);

        for (int i = 0; i < stars; i++) {
            int x = (int) (Math.random() * 360);
            int y = (int) (Math.random() * 360);
            int shade = (int) (Math.random() * 256);
//            graphics.setColor(gray.get((int) (Math.random() * gray.size())));
            graphics.setColor(new Color(shade, shade, shade));
            graphics.fillRect(x, y, 5, 5);
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
            this.setBackground(Color.BLACK);
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
