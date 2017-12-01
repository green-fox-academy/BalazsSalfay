import java.util.Arrays;
import java.util.Scanner;

public class PalindromeBuilder {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Please give me a word: ");
    String userInput = input.next();

    createPalindrome(userInput);



  }
  public static void createPalindrome (String palinWord) {

    char[] palindromChar = new char[palinWord.length()];

    for (int i = 0; i < palinWord.length(); i++) {
      palindromChar[i] = palinWord.charAt(palinWord.length() - i - 1);
    }
    System.out.println(palinWord + String.valueOf(palindromChar));
  }
}




//Create a function named create palindrome following your current language's style guide.
// It should take a string, create a palindrome from it and then return it.