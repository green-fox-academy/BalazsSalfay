import java.util.Scanner;

public class DrawTriangle {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Please give me a number: ");
    int userInput = input.nextInt();

    for (int i = 0; i < userInput; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}



// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was