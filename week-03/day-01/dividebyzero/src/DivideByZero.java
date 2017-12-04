import java.util.Scanner;

public class DivideByZero {
  public static void main(String[] args) {

    System.out.println("Please give me a number: ");

    Scanner input = new Scanner(System.in);
    int userInput = input.nextInt();

    System.out.println(divideTenWithIt(userInput));
  }

  private static int divideTenWithIt(int divideNumber) {
    int result = 10;
    try {
      result = 10 / divideNumber;
    } catch(ArithmeticException e1) {
    System.out.println("fail");
    } return result;
  }
}


// create a function that takes a number
// divides ten with it,
// and prints the result.
// it should print "fail" if the parameter is 0