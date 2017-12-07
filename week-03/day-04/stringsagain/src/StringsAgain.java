import java.util.Scanner;

public class StringsAgain {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please write me some text which is contains \"x\" characters: ");
    String removeTheX = input.next();
    System.out.println(removeX(removeTheX));
  }

  public static String removeX(String remove) {
    if (!remove.contains("x")) {
      return remove;
    } else {
      return removeX(remove.replace("x",""));
    }
  }
}



// Given a string, compute recursively a new string where all the 'x' chars have been removed.