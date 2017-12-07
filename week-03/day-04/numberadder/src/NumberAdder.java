public class NumberAdder {

  public static void main(String[] args) {

    int countUntilThis = 8;
    System.out.println(numberAdder(countUntilThis));
  }

  public static int numberAdder(int n) {
    if (n == 0) {
      return 1;
    } else {
      return (n + numberAdder(n-1));
    }
  }
}

// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.