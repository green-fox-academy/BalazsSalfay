public class BassGuitar extends StringedInstrument {

  public BassGuitar(int numberOfStrings) {
    super(numberOfStrings);
  }

  @Override
  public void sound() {
    System.out.println("Duum-duum-duum");
  }
}
