public class BunniesAgain {

  public static void main(String[] args) {
    int bunniesInLine = 6;
    System.out.println(bunniesEarsInLine(bunniesInLine));
  }

  public static int bunniesEarsInLine(int inline) {
    if (inline > 0) {
      if (inline % 2 == 0) {
        return 2 + bunniesEarsInLine(inline - 1);
      } else {
        return 3 + bunniesEarsInLine(inline - 1);
      }
    } return inline;
  }
}



// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).