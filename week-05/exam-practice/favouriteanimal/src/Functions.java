import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Functions {
  private Path filePath = Paths.get("favourites.txt");
  private List<String> animalList = new ArrayList<>();

  public void readFile() {
    try {
      animalList = Files.readAllLines(filePath);
    } catch(Exception e) {
      System.out.println("Unable to read file: favourites.txt");
    }
  }

  public void addAnimalsToList(String[] args) {
    for (int i = 0; i < args.length; i++) {
      if (!animalList.contains(args[i])) {
        animalList.add(String.valueOf(args[i]));
      } else {
        System.out.println("Your animal: " + args[i] + " is already on the list!");
      }
      try {
        Files.write(filePath, animalList);
      } catch (Exception e) {
        System.out.println("Unable to write file: todo.txt");
      }
    }
  }
}




