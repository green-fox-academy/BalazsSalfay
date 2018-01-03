public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar(int numberOfStrings) {
    super(numberOfStrings);
    name = "Electric Guitar";
  }

  public ElectricGuitar() {
    this(6);
  }

  @Override
  public String sound() {
    return "Twang";
  }

  @Override
  public void play() {
    System.out.println(name + ", " + numberOfStrings + "-stringed instrument that goes " + sound());
  }
}
