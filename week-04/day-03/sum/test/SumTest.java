import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {
  Sum sum = new Sum();
  ArrayList<Integer> elements = new ArrayList<>(Arrays.asList(2, 3, 4));

  @Test
  public void summingElement() throws Exception {
    assertEquals(sum.summingElement(elements),9);
  }
}