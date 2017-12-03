import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Unique {
  public static void main(String[] args) {

    System.out.println("Please give a few number of your choice, and than type \"Go!\": ");

    Scanner input = new Scanner(System.in);
    int userInput = input.nextInt();

    unique(userInput);


  }
  public static void unique (int uniqueNumber) {

    Scanner input = new Scanner(System.in);
    int userInput = input.nextInt();


    ArrayList <Integer> userInputs = new ArrayList<>();

    while (input.hasNextInt()){
      userInputs.add(input.nextInt());
    }
    List<Integer> unique = userInputs.stream().distinct().collect(Collectors.toList());
    System.out.println(unique);
  }
}
