import javax.swing.*;
import java.awt.*;

public class SquareInTheCenter {


    public static void mainDraw(Graphics graphics) {
      // draw a green 10x10 square to the canvas' center.

      graphics.setColor(Color.GREEN);
      graphics.drawRect((WIDTH/2) - 5,(HEIGHT/2) - 5, 10, 10);
    }

    //    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
      JFrame jFrame = new JFrame("Drawing");
      jFrame.setSize(new Dimension(WIDTH, HEIGHT));
      jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      jFrame.add(new ImagePanel());
      jFrame.setLocationRelativeTo(null);
      jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
      @Override
      protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        mainDraw(graphics);

      }
    }
}
