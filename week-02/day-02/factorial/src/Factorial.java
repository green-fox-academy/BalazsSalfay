import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Please give a number: ");
    int userInput = input.nextInt();

    int result = factorio(userInput);
    System.out.println("The number you give has the factorial: " + result);

  }

  public static int factorio(int factor) {

    int number = 1;
    for (int i = 1; i <= factor; i++) {
      number *= i;
    }
    return number;
  }
}


//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial