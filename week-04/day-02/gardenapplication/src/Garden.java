import java.util.ArrayList;
import java.util.List;

public class Garden {

  public static void main(String[] args) {
    List<Plant> garden = new ArrayList<Plant>();

    Plant yellow = new Flower("yellow",4 );
    garden.add(yellow);
    System.out.println(yellow.toString());
    Plant blue = new Flower("blue", 2);
    garden.add(blue);
    System.out.println(blue.toString());
    Plant purple = new Tree("purple", 8);
    garden.add(purple);
    System.out.println(purple.toString());
    Plant orange = new Tree("orange", 12);
    garden.add(orange);
    System.out.println(orange.toString());

    watering(40,garden);
    System.out.println(yellow.waterAmount);
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
    int newWaterAmount = addWater / howManyPlatsAreThirsty(plants);
    for (Plant currentPlant: plants) {
      if (currentPlant.checkTheState()) {
        currentPlant.waterAmount = currentPlant.waterAmount + newWaterAmount;
      }
    }
  }
}
