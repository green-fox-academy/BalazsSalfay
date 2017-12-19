public class Hero extends GameCharacter {

  public Hero() {
    super("hero-down.png");
  }

  public void heroturnRight() {
    setImagePath("hero-right.png");
  }

  public void heroturnLeft() {
    setImagePath("hero-left.png");
  }

  public void heroturnUp() {
    setImagePath("hero-up.png");
  }
}