import java.util.ArrayList;
import java.util.List;

public class Garden {

  public static void main(String[] args) {
    int wateringWith = 40;
    int wateringWith2 = 70;
    List<Plant> garden = new ArrayList<Plant>();

    Plant yellow = new Flower("yellow",0 );
    garden.add(yellow);
    System.out.println(yellow.toString());
    Plant blue = new Flower("blue", 0);
    garden.add(blue);
    System.out.println(blue.toString());
    Plant purple = new Tree("purple", 0);
    garden.add(purple);
    System.out.println(purple.toString());
    Plant orange = new Tree("orange", 0);
    garden.add(orange);
    System.out.println(orange.toString());
    System.out.println("");

    watering(40, garden);

    System.out.println("Watering with " + wateringWith);
    System.out.println(yellow.toString());
    System.out.println(blue.toString());
    System.out.println(purple.toString());
    System.out.println(orange.toString());
    System.out.println("");

    watering(70, garden);

    System.out.println("Watering with " + wateringWith2);
    System.out.println(yellow.toString());
    System.out.println(blue.toString());
    System.out.println(purple.toString());
    System.out.println(orange.toString());
  }

  public static int howManyPlatsAreThirsty( List<Plant> plants) {
    int thirstyPlants = 0;
    for (Plant currentPlant: plants) {
      if (currentPlant.checkTheState()) {
        thirstyPlants++;
      }
    } return thirstyPlants;
  }

  public static void watering(int addWater, List<Plant> plants) {
    double newWaterAmount = addWater / howManyPlatsAreThirsty(plants);
    for (Plant currentPlant: plants) {
      if (currentPlant.checkTheState()) {
        if (currentPlant.name.equals("Flower")) {
          currentPlant.waterAmount = currentPlant.waterAmount + (int) (newWaterAmount * 0.75);
        } else if (currentPlant.name.equals("Tree")) {
          currentPlant.waterAmount = currentPlant.waterAmount + (int) (newWaterAmount * 0.4);
        }
      }
    }
  }
}
