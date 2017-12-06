import javax.swing.*;
import java.awt.*;

public class Diagonals {

  public static void mainDraw(Graphics graphics){
    // draw the canvas' diagonals in green.

    graphics.setColor(Color.GREEN);
    graphics.drawLine(0, 0, 343, 343);

    graphics.setColor(Color.GREEN);
    graphics.drawLine(305, 0, 0, 305);
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
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }
}
