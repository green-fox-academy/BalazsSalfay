import java.util.Scanner;

public class CountFromTo {
  public static void main(String[] args) {

    Scanner input1 = new Scanner(System.in);
    System.out.println("Please give me a whole number: ");
    int userInput1 = input1.nextInt();

    Scanner input2 = new Scanner(System.in);
    System.out.println("Please give me an other whole number: ");
    int userInput2 = input2.nextInt();

    if (userInput2 <= userInput1) {
      System.out.println("The second number should be bigger!");
    } else if (userInput2 > userInput1) {
        for (int i = userInput1; i < userInput2; i++) {
          System.out.println(i);
        }
    }
  }
}






// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5