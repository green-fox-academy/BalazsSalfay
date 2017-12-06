import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SquarePositioning {

  public static void mainDraw(Graphics graphics){
    // create a square drawing function that takes 2 parameters:
    // the x and y coordinates of the square's top left corner
    // and draws a 50x50 square from that point.
    // draw 3 squares with that function.

    int[] startPosition = {50, 70};
    drawSquares(graphics,startPosition);
  }

  public static void drawSquares(Graphics draw, int[] start) {
    Random rand = new Random();
    draw.setColor(Color.ORANGE);
    for (int i = 0; i <= 2; i++) {
      draw.fillRect(start[0], start[1], 50, 50);
      start[0] += rand.nextInt(100);
      start[1] += rand.nextInt(100);
    }
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
