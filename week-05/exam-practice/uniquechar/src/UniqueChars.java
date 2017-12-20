import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueChars {

  public static void main(String[] args) {
    String example = "anagram";
    System.out.println(uniqueCharacters(example));
  }

  public static List uniqueCharacters(String input) {
    Map<Character, Integer> uniqueCharMap = new HashMap<>();
    List<Character> uniqueCharList = new ArrayList<>();
    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);
      uniqueCharList.add(c);
      Integer value = uniqueCharMap.get(c);
      if (value != null ) {
        uniqueCharMap.put(c, new Integer(value + 1));
      } else {
        uniqueCharMap.put(c, 1);
      }
    }
    for (int i = 0; i < uniqueCharList.size(); i++) {
      if (uniqueCharMap.get(uniqueCharList.get(i)) != 1) {
        uniqueCharList.remove(i);
      }
    }
    return uniqueCharList;
  }
}



// Create a function called `uniqueCharacters` that takes a string as parameter
// and returns a list with the unique letters of the given string
// Create basic unit tests for it with at least 3 different test cases
// Should print out:
// ["n", "g", "r", "m"]