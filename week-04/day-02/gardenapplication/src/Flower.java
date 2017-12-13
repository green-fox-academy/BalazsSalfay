public class Flower extends Plant {

  public Flower(String color, int waterAmount) {
    super(color, waterAmount);
    name = "Flower";
  }

  public boolean checkTheState() {
    if (waterAmount < 5) {
     return needWater = true;
    } else {
      return needWater = false;
    }
  }

  @Override
  public String toString() {
    String need = checkTheState() ? "" : "doesnt ";
    return "The " + color +  " " + name + " " + need + "need water";
  }
}
