public class Cuboid {
  public static void main(String[] args) {

    int a = 10;
    int b = 10;
    int c = 10;

    int volume = a * b * c;
    int surface = 2 * (a * b + b * c + c * a);

    System.out.println(volume);
    System.out.println(surface);
  }
}
