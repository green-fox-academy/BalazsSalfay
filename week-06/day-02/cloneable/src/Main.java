public class Main {

  public static void main(String[] args) {
    try {
      Student john = new Student();
      Student johnTheClone = john.clone();
      john.introduce();
      johnTheClone.introduce();
    } catch (CloneNotSupportedException e) {
    }
  }
}
