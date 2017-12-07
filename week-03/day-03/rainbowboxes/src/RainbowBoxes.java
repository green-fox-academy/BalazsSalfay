import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RainbowBoxes {

  public static void mainDraw(Graphics graphics){
    // create a square drawing function that takes 2 parameters:
    // the square size, and the fill color,
    // and draws a square of that size and color to the center of the canvas.
    // create a loop that fills the canvas with rainbow colored squares.
    int size = 50;
    int[] color = {120, 50, 65};
    for (int i = 0; i < 600; i++) {
      boxDrawing(graphics,randomSize(),randomColor());
    }
  }

  public static void boxDrawing(Graphics draw, int size, int[] color) {
    Random position = new Random();
    draw.setColor(new Color(color[0],color[1],color[2]));
    draw.fillRect(position.nextInt(270), position.nextInt(293), size, size);
  }

  public static int[] randomColor() {
    Random color = new Random();
    int[] myColor = {color.nextInt(255), color.nextInt(255),color.nextInt(255)};
    return myColor;
  }

  public static int randomSize() {
    Random size = new Random();
    int randomSize = size.nextInt(70);
    return randomSize;
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
