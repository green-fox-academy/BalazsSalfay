import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class UniqueCharsTest {

  UniqueChars test = new UniqueChars();

  @Test
  public void uniqueCharacters() throws Exception {
    String word = "anagram";
    assertEquals(test.uniqueCharacters(word), new ArrayList(Arrays.asList('n', 'g', 'r','m')));
  }

  @Test
  public void uniqueCharacters2() throws Exception {
    String word = "barack";
    assertEquals(test.uniqueCharacters(word), new ArrayList(Arrays.asList('b', 'r', 'c','k')));
  }

  @Test
  public void uniqueCharacters3() throws Exception {
    String word = "elephant";
    assertEquals(test.uniqueCharacters(word), new ArrayList(Arrays.asList('l', 'p', 'h','a', 'n', 't')));
  }
}
