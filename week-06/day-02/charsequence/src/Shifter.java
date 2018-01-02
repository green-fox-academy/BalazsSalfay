public class Shifter implements CharSequence {
  private String input;
  private int shifter;

  public Shifter(String input, int shifter) {
    this.input = input;
    this.shifter = shifter;
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    return input.charAt(index + shifter);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
