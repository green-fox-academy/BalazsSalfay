import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please give me a number: ");
        int myNumber = input.nextInt();

        if (myNumber % 2 == 0) {
            System.out.println("Even");
        } else System.out.println("Odd");
    }
}
