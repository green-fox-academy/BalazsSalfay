import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);

        System.out.println("How many girls is on your party?");
        int girlsNumber = input1.nextInt();

        Scanner input2 = new Scanner(System.in);

        System.out.println("How many boys is on your party?");
        int boysNumber = input2.nextInt();

        boolean girlsAndBoysEqual = girlsNumber == boysNumber;
        int girlsAndBoysTogether = girlsNumber + boysNumber;


        if (girlsAndBoysEqual == true && girlsAndBoysTogether > 20 ) {
            System.out.println("The party is excellent!");
        } else if (girlsAndBoysTogether > 20 && girlsAndBoysEqual == false) {
            System.out.println("Quiet cool party!");
        } else if (girlsAndBoysTogether < 20) {
            System.out.println("Avarage party... ");
        } else if ( girlsNumber <= 0) {
            System.out.println("Sausage party");
        }
    }
}
