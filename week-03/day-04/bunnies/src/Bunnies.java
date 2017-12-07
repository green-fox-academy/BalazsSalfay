import java.util.Random;

public class Bunnies {

  public static void main(String[] args) {
    Random rand = new Random();
    int numberOfBunnies = rand.nextInt(500);
    int numberOfEars = 2;
    System.out.println(bunniesEarsCounter(numberOfBunnies,numberOfEars));
  }

  public static int bunniesEarsCounter(int b, int e) {
    if (e == 0 || b == 0) {
      return 0;
    } else {
      return  + bunniesEarsCounter(b, e - 1);
    }
  }
}


// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).