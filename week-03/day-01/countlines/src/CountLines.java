import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountLines {

  public static void main(String[] args) {

    System.out.println(countTheLines());
  }

  public static List<String> countTheLines () {
   try {
      List<String> sumOffLines = Files.readAllLines(Paths.get("mytext.txt"));
      System.out.println(sumOffLines.size());
      return sumOffLines;
    } catch (IOException e) {
      System.out.println("0");
     return new ArrayList<String>();
    }
  }
}


// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.