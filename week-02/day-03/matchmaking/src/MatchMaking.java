import java.util.ArrayList;
import java.util.Arrays;

public class MatchMaking {
  public static void main(String[] args) {

    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Bözsi", "Kat", "Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Béla", "Todd", "Neef", "Jeff"));
    ArrayList<String> order = new ArrayList<String>();

    int size = Math.max(girls.size(), boys.size());

    for (int i = 0; i < size; i++) {
      if (i < girls.size()) {
        order.add(girls.get(i));
      }
      if (i < boys.size()) {
        order.add(boys.get(i));
      }
    }
    System.out.println(order);
  }
}


// Join the two lists by matching one girl with one boy in the order list
// Exepected output: "Eve", "Joe", "Ashley", "Fred"...