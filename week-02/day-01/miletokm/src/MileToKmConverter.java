import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please give me the distance in kilometer: ");
        int userKilometer = input.nextInt();

        float userMile = userKilometer * 0.62137f;

        System.out.println("Your distance in miles is: " + userMile);



    }
}
