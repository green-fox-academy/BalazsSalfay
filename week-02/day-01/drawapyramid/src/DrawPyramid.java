import java.util.Scanner;

public class DrawPyramid {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Plese give me a number, and I'll draw you a pyramid: " );
    int userInput = input.nextInt();

    int pyr = 0;

    while (pyr < userInput){
      for (int i = pyr; i < userInput; i++) {
        System.out.print(" ");
      }
      for (int j = 0; j <(pyr * 2) ; j++) {
        System.out.print("*");
      }
      System.out.println("*");
      pyr++;
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
