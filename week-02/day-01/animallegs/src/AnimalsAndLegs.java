import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);

        System.out.println("Hi Farmer! Please give the number of chickens you have: ");
        int farmerChickens = input1.nextInt();

        int chickenLegs = farmerChickens * 2;


        Scanner input2 = new Scanner(System.in);

        System.out.println("And now, how many pigs you have: ");
        int farmerPigs = input2.nextInt();

        int pigLegs = farmerPigs * 4;

        int animalLegs = chickenLegs + pigLegs;


        System.out.println("Your animals has " + animalLegs + " legs all together!");
    }
}
