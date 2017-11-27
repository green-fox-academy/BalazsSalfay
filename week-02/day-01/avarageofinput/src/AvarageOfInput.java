import java.util.Scanner;

public class AvarageOfInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please give me five integer number! ");

        int firstnumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();
        int fourthnumber = input.nextInt();
        int fifthnumber = input.nextInt();

        int sumNumber = firstnumber + secondNumber + thirdNumber + fourthnumber + fifthnumber;

        float avarageNumber = sumNumber / 5f;

        System.out.println("Sum: " + sumNumber);
        System.out.println("Avarage: " + avarageNumber);

    }
}
