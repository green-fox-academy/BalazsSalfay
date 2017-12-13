import java.util.ArrayList;
import java.util.List;

public class Garden {

  public static void main(String[] args) {
    List<Plant> garden = new ArrayList<>();

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
  }
}
