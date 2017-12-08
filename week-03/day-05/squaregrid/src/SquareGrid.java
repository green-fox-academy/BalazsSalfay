import javax.swing.*;
import java.awt.*;

public class SquareGrid {

  public static void mainDraw(Graphics2D graphics){
    graphics.setColor(Color.BLACK);
    int x = WIDTH/2 - 100;
    int y = HEIGHT/2 - 120;
    int size = 200;
    int width = 20;
    drawSquare(graphics, x, y, size);
  }

  public static void drawSquare(Graphics2D square, int x,int y,int size) {
    square.setStroke(new java.awt.BasicStroke(size/10));
    square.drawRect(x, y, size, size);
    if (size > 25) {
      drawSquare(square,x - size/2 + size/4, y - size/2 + size/4, size/2);
      drawSquare(square,x + size/2 + size/4, y - size/2 + size/4, size/2);
      drawSquare(square,x + size/2 + size/4, y + size/2 + size/4, size/2);
      drawSquare(square,x - size/2 + size/4, y + size/2 + size/4, size/2);
    }
  }

  //    Don't touch the code below
  static int WIDTH = 800;
  static int HEIGHT = 600;

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
      mainDraw((Graphics2D) graphics);

    }
  }

}
