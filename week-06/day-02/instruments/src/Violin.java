public class Violin extends StringedInstrument {

  public Violin(int numberOfStrings) {
    super(numberOfStrings);
    name = "Violin";
  }

  public Violin() {
    this(4);
  }

  @Override
  public String sound() {
    return "Screech";
  }

  @Override
  public void play() {
    System.out.println(name + ", " + numberOfStrings + "-stringed instrument that goes " + sound());
  }
}
