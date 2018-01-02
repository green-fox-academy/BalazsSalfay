public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar(int numberOfStrings) {
    super(numberOfStrings);
  }

  @Override
  public void sound() {
    System.out.println("Twang");
  }
}
