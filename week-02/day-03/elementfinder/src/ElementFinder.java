import java.util.ArrayList;
import java.util.Arrays;

public class ElementFinder {
  public static void main(String[] args) {

    ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));

    if (arrayList.contains("7")) {
      System.out.println("Hoorray");
    } else System.out.println("Noooooo");
  }
}

// Check if the arrayList contains "7" if it contains print "Hoorray" otherwise print "Noooooo"
// Do this again with a different solution using different list functions!