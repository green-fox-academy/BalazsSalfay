import java.util.Random;

public class Power {

  public static void main(String[] args) {

    Random rand = new Random();
    int base = rand.nextInt(20);
    int n = rand.nextInt(10);
    System.out.println(powerOfBase(base,n));
  }

  public static int powerOfBase(int base, int n) {
    if (n == 0) {
      return 1;
    } else {
      return base * powerOfBase(base,n - 1);
    }
  }
}



// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).