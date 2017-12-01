import java.util.Arrays;
import java.util.Scanner;

public class PalindromeSearch {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Please give me random words: ");
    String userInput = input.next();

    searchPalindrome(userInput);
  }
  public static void searchPalindrome (String palinWord) {

    char[] palindromeGenerator = new char[palinWord.length()];

      for (int j = 0; j <= 2; j++) {
        if (palindromeGenerator[j] == palindromeGenerator[j+2]) {
          System.out.print(palindromeGenerator[j]);
        } else {
          System.out.println("No match");
        }
      }
  }
}
