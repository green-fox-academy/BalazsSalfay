public class SumDigit {

  public static void main(String[] args) {

    int summingNum = 49;
    System.out.println(sumTheDigits(summingNum));
  }

  public static int sumTheDigits(int n) {
    int sum = n % 10;
    if (n/10 < 10) {
      return sum + n/10;
    } else {
      return sum + sumTheDigits(n/10);
    }
  }
}


// Given a non-negative int n, return the sum of its digits recursively (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).