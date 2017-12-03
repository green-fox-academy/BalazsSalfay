import java.util.*;
import java.util.stream.Collectors;

public class SortThatList {

  public static void main(String[] args) {

    System.out.println("Please give a few number of your choice, and than type \"Go!\": ");

    Scanner input = new Scanner(System.in);
    int userInput = input.nextInt();

    sortThatList(userInput);

  }
  public static void sortThatList (int sortTheNumber) {

    Scanner input = new Scanner(System.in);
    int userInput = input.nextInt();

    ArrayList<Integer> sortedNumbers = new ArrayList<>();

    while (input.hasNextInt()) {
      sortedNumbers.add(input.nextInt());
    }
    Collections.sort(sortedNumbers);
    System.out.println(sortedNumbers);

    Collections.reverse(sortedNumbers);
    System.out.println(sortedNumbers);
  }
}


//Should fix later, it's skip the first two userinput!
