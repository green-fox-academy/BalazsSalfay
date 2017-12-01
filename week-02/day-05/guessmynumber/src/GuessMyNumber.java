import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
  public static void main(String[] args) {

    Random random = new Random();
    int randomNumber = random.nextInt(100) + 1;



    System.out.println("Hello! Guess my number between 0-100. You have 5 lives. ");

    for (int i = 0; i < 5; i++) {
      for (int j = 5; j > 0; j--) {
        Scanner input = new Scanner(System.in);
        int userGuess = input.nextInt();
        int countDown = j - 1;
        if (userGuess > randomNumber) {
          System.out.println("Your guess is too high. You have " + countDown + " left.");
        } else if (userGuess < randomNumber) {
          System.out.println("Your guess is too low.You have "  + countDown + " left.");
        } else if (userGuess == randomNumber) {
          System.out.println("Congratulation!You won!");
       }
      }
    }
  }
}
