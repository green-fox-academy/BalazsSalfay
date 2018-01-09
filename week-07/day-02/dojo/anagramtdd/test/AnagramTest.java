import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

  @Test
  public void should_returnTrue_ifIsAnagram() {
    String text1 = "listen";
    String text2 = "silent";
    boolean expectedResult = true;

    boolean checkedText = Anagram.isAnagram(text1,text2);

    assertEquals(expectedResult,checkedText);
  }

  @Test
  public void should_returnFalse_ifDifferentLength() {
    String text1 = "listen";
    String text2 = "slen";
    boolean expectedResult = false;

    boolean checkedText = Anagram.isAnagram(text1,text2);

    assertEquals(expectedResult,checkedText);
  }

  @Test
  public void should_returnFalse_insteadOfNullPointer() {
    String text1 = "listen";
    String text2 = null;
    boolean expectedResult = false;

    boolean checkedText = Anagram.isAnagram(text1,text2);

    assertEquals(expectedResult,checkedText);
  }
}