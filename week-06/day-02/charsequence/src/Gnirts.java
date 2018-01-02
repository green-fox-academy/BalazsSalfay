
public class Gnirts implements CharSequence {
  private String input;

  public Gnirts(String input) {
    this.input = input;
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    String reversed = "";
    for (int i = 0; i < input.length(); i++) {
      reversed = reversed + input.charAt(input.length() - 1 - i);
    }
    return reversed.charAt(index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
