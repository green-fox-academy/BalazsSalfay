import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        int secretNumber = 169;

        System.out.println("Guess the number: ");

        for (int i=0; i<1000; i++) {
            Scanner input = new Scanner(System.in);
            int userGuess = input.nextInt();


            if (userGuess > secretNumber){
                System.out.println("The stored number is smaller.");
            } else if (userGuess < secretNumber) {
                System.out.println("The stored number is higher.");
            } else if (userGuess == secretNumber) {
                System.out.println("You found the number: " + secretNumber);
            }
        }

    }
}
