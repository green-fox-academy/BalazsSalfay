public class Tree extends Plant {
  public Tree(String color, int waterAmount) {
    super(color, waterAmount);
    name = "Tree";
  }

  public boolean checkTheState() {
    if (waterAmount < 10) {
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

