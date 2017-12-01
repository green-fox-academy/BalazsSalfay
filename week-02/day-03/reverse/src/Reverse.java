import java.util.Arrays;

public class Reverse {
  public static void main(String[] args) {

    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
    reverse(reversed);


  }

  public static void reverse(String text) {


    char[] reversedChar = new char[text.length()];
    String reversedText = String.valueOf(reversedChar);

    for (int i = text.length() - 1; i >= 0; i--) {
      reversedChar[i] = text.charAt(text.length() - i - 1);
    }
    System.out.println(reversedChar);
  }
}


// Create a function that can reverse a String, which is passed as the parameter
// Use it on this reversed string to check it!
// Try to solve this using charAt() first, and optionally anything else after.