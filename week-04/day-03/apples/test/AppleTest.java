import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {

  @Test
  public void returnText() throws Exception {
    Apple apple = new Apple("apple");
    assertEquals("apple",apple.returnText());
  }
}
