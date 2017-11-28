import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);

        System.out.println("Please give two integer number: ");
        int firstNumber = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        int secondNumber = input2.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("The bigger number is: " + firstNumber);
        } else if (secondNumber > firstNumber) {
            System.out.println("The bigger number is: " + secondNumber);
        }






    }
}
