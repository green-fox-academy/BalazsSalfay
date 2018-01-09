import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

  public static void main(String[] args) {
    String text1 = "listen";
    String text2 = "silent";
    System.out.println(isAnagram(text1, text2));
  }

//  public static boolean isAnagram(String text1, String text2) {
//    for (int i = 0; i < text1.length(); i++){
//      for (int j = i; j < text2.length(); j++) {
//        if (text1.charAt(j) == text2.charAt(i)){
//          return true;
//        }
//      }
//    }
//    return false;
//  }

//  public static boolean isAnagram(String text1, String text2) {
//    String[] splitString1 = text1.split("");
//    String[] splitString2 = text2.split("");
//    ArrayList<Boolean> anagramChecker = new ArrayList<>();
//    for (int i = 0; i < splitString1.length; i++) {
//      for (int j = 0; j < splitString2.length; j++) {
//        if (splitString1[i] == splitString2[j]){
//          anagramChecker.add(true);
//        } else {
//          anagramChecker.add(false);
//        }
//      }
//    }
//    if (anagramChecker.contains(false)){
//      return false;
//    } else {
//      return true;
//    }
//  }

  public static boolean isAnagram(String input1, String input2) {
    try {
    List<String> var1 = Arrays.asList(input1.split(""));
    List<String> var2 = Arrays.asList(input2.split(""));
    boolean anagram = var1.containsAll(var2);

      if (anagram && var1.size() == var2.size()) {
        System.out.println("This is an anagram");
        return true;
      } else {
        System.out.println("This is not an anagram");
        return false;
      }
    } catch (NullPointerException e) {
      return false;
    }
  }
}
