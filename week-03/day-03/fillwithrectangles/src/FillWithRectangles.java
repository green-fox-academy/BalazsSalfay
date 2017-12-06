import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class FillWithRectangles {

  public static void mainDraw(Graphics graphics){
    // draw four different size and color rectangles.
    int rectX = 30;
    int rectY = 30;
    int width = 50;
    int height = 80;
    Random rand = new Random();
    Color myColor;

    for (int i = 0; i <= 3; i++) {
      myColor = new Color(195, rand.nextInt(255), 50);
      graphics.setColor(myColor);
      graphics.fillRect(rectX, rectY, width, height);
      rectX += 20;
      rectY += 20;
      width += 20;
      height += 20;
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
