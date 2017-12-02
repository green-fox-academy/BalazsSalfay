import java.util.Scanner;

public class DrawPyramid {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Plese give me a number, and I'll draw you a pyramid: " );
    int userInput = input.nextInt();

    for (int i = 0; i < userInput; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println("*");
    }
  }
}



// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was
