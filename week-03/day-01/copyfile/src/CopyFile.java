import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {

  public static void main(String[] args) {

    createFile();
  }

  public static void createFile() {
    List<String> mytext = new ArrayList<>();
    mytext.add("This is the content that I should copy.");

    Path path1 = Paths.get("myfile1.txt");
    try {
      Files.write(path1, mytext );
    } catch (IOException e1) {
      System.out.println("File is not readable");
    }
  }


  public static void copyMachine() {
    Path path2 = Paths.get("myfile2.txt");


  }

}




// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful