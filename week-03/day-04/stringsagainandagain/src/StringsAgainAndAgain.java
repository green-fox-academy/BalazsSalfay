
import java.util.Scanner;

public class StringsAgainAndAgain {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please write me a word of your choice: ");
    String addAStar = input.next();
    System.out.println(separWithStar(addAStar));
  }

  public static String separWithStar(String theStar) {
    if (theStar.length() == 1) {
      return theStar;
    } else {
      return theStar.substring(0,1) + "*" + separWithStar(theStar.substring(1));
    }
  }
}



// Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".