import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WriteMultipleLines {

  public static void main(String[] args) {

    userInputsWriteInFile();

  }

  public static void userInputsWriteInFile() {
    Path path = Paths.get("userfile.txt");

    Scanner input = new Scanner(System.in);

    System.out.println("Please give me a word: ");
    String word = input.next();
    System.out.println("Please give me a number: ");
    int number = input.nextInt();

    List<String> userInputs = new ArrayList<>();

    try {
      for (int i = 0; i < number; i++) {
        userInputs.add(word);
        Files.write(path, userInputs);
      }
      System.out.println(userInputs);
    } catch (Exception e1) {

    }
  }
}



// Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number paramter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"
// The function should not raise any error if it could not write the file.