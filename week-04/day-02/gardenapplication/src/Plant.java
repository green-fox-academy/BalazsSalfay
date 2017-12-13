public class Plant {
  protected String color;
  protected String name;
  protected int waterAmount;
  protected boolean needWater;

  public void setColor(String color) {
    this.color = color;
  }

  public void setWaterAmount(int waterAmount) {
    this.waterAmount = waterAmount;
  }

  public String getColor() {
    return color;
  }

  public int getWaterAmount() {
    return waterAmount;
  }

  public Plant(String color, int waterAmount) {
    this.color = color;
    this.waterAmount = waterAmount;
  }

  public boolean checkTheState() {
    return needWater;
  }
}
