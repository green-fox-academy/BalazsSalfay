import java.util.*;

public class SortThatList {

  public static void main(String[] args) {

    List<Integer> userInput = readUserInput();

    System.out.println(sortThatList(userInput, "asc"));
    System.out.println(sortThatList(userInput, "dsc"));
  }

  public static List<Integer> readUserInput() {
    System.out.println("Please give a few number of your choice, and than type \"Go!\": ");
    Scanner input = new Scanner(System.in);
    ArrayList<Integer> userNumbers = new ArrayList<>();

    while (input.hasNextInt()) {
      userNumbers.add(input.nextInt());
    }
    return userNumbers;
  }

  public static List<Integer> sortThatList (List<Integer> userInput, String order) {

    if (order.equals("asc")) {
      Collections.sort(userInput);
    } else if (order.equals("dsc")) {
      Collections.reverse(userInput);
    }
    return userInput;
  }
}


