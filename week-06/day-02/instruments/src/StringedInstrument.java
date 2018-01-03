public abstract class StringedInstrument extends Instrument {
  int numberOfStrings;

  public StringedInstrument(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }

  public abstract String sound();

  @Override
  public void play() {
    System.out.println("");
  }
}
