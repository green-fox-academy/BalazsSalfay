import java.util.Scanner;

public class Strings {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please write me some text which is contains \"x\" characters: ");
    String xToY = input.next();
    System.out.println(charChanger(xToY));
  }

  public static String charChanger(String change) {
    if (!change.contains("x")) {
      return change;
      } else {
      return charChanger(change.replace("x", "y"));
    }
  }
}



// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.
