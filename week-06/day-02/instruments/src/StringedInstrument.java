public abstract class StringedInstrument extends Instrument {

  int numberOfStrings;

  public StringedInstrument(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }

  public abstract void sound();

  @Override
  public void play() {

  }
}
