import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class ToTheCenter {

  public static void mainDraw(Graphics graphics){
    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // draw 3 lines with that function.
    int[] startPoint = userInput();
    drawingLines(graphics, startPoint);
  }

  public static int[] userInput () {
    System.out.println("Please give me a number between 0-320: ");
    Scanner input1 = new Scanner(System.in);

    int[] userInputs = new int[2];
    userInputs[0] = input1.nextInt();

    System.out.println("Plese give me an other number between 0-343: ");
    Scanner input2 = new Scanner(System.in);
    userInputs[1] = input2.nextInt();

    return userInputs;
  }

  public static void drawingLines (Graphics draw,int[] start) {
    draw.setColor(Color.RED);
    for (int i = 0; i <= 2; i ++) {
        draw.drawLine(start[0],start[1],160,165);
        start[0] += 20;
        start[1] += 50;
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
