public class BassGuitar extends StringedInstrument {

  public BassGuitar(int numberOfStrings) {
    super(numberOfStrings);
    name = "Bass Guitar";
  }

  public BassGuitar() {
    this(4);
  }

  @Override
  public String sound() {
    return "Duum-duum-duum";
  }

  @Override
  public void play() {
    System.out.println(name + ", " + numberOfStrings + "-stringed instrument that goes " + sound());
  }
}
