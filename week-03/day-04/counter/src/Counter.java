public class Counter {

  public static void main(String[] args) {

    int countWithThis = 6;
    countDown(countWithThis);
  }

  public static int countDown (int n) {
    if (n == 0) {
      System.out.println("Let's start!");;
    } else {
      System.out.println(n);
      countDown(n-1);
    } return n;
  }
}


// Write a recursive function that takes one parameter: n and counts down from n.