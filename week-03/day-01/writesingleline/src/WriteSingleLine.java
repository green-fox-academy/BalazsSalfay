import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {

  public static void main(String[] args) {

    try {
      Path path = Paths.get("my-file.txt");
      List<String> myName = new ArrayList<>();
      myName.add("Balazs Salfay");
      Files.write(path, myName);
    } catch (IOException e) {
      System.out.println("Unable to write fil: my-file.txt");
    }
  }
}



// Open a file called "my-file.txt"
// Write your name in it as a single line
// If the program is unable to write the file,
// then it should print an error message like: "Unable to write file: my-file.txt"

