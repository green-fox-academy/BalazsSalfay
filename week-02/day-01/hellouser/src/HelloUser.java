import java.io.Console;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;

public class HelloUser {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        String userName = input.next();

        System.out.println("Hello " + userName);

    }
}