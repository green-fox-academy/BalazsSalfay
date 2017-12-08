import javax.swing.*;
import java.awt.*;

public class SierPinskyCarpet {

  public static void mainDraw(Graphics graphics){
    // draw a green 10x10 square to the canvas' center.

    int x = WIDTH/2 - 75;
    int y = HEIGHT/2 - 90;
    int size = 150;
    carpetDrawer(graphics, x, y, size);
  }

  public static void carpetDrawer (Graphics carpet, int x, int y, int size) {
    carpet.setColor(Color.BLACK);
    carpet.fillRect(x, y, size, size);
    int reSizer = size * 2;
    if (size > 5) {
      carpetDrawer(carpet, x - reSizer/3, y - reSizer/3, size/3);
      carpetDrawer(carpet, x + reSizer/3 - reSizer/6, y - reSizer/3, size/3);
      carpetDrawer(carpet, x - reSizer/3, y + reSizer/3 - reSizer/6, size/3);
      carpetDrawer(carpet, x - reSizer/3, y - reSizer/3, size/3);
      carpetDrawer(carpet, x - reSizer/3, y + reSizer/3 + reSizer/3, size/3);
      carpetDrawer(carpet, x - reSizer/3 + reSizer/2, y + reSizer/3 + reSizer/3, size/3);
      carpetDrawer(carpet, x - reSizer/3 + reSizer/2 + reSizer/2, y + reSizer/3 + reSizer/3, size/3);
      carpetDrawer(carpet, x - reSizer/3 + reSizer/2 + reSizer/2, y + reSizer/3 + reSizer/3 - reSizer/2, size/3);
      carpetDrawer(carpet, x - reSizer/3 + reSizer/2 + reSizer/2, y + reSizer/3 + reSizer/3 - reSizer/2 - reSizer/2, size/3);
    }
  }

 //must be fixed, it's ugly!!

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
      mainDraw(graphics);

    }
  }
}
