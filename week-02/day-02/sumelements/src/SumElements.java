import java.util.Scanner;

public class SumElements {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please give a number: ");
        int userNumber = input.nextInt();

        int result = sumelement(userNumber);
        System.out.println("The sum of the number untill the number you gave: " + result);


    }
    public static int sumelement (int sumelem) {

        int number = 0;
        for (int i=0; i<sumelem; i++){
        number += i;
        }
        return number;
    }
}



//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter