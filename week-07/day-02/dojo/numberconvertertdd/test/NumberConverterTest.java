import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberConverterTest {

  @Test
  public void first() {
    int amountInNumbers = 5;
    String expectedAmountInWords = "five";

    String result = NumberConverter.converter(amountInNumbers);

    assertEquals(expectedAmountInWords + " dollars", result);
  }

  @Test
  public void second() {
    int amountInNumbers = 1;
    String expectedAmountInWords = "one";

    String result = NumberConverter.converter(amountInNumbers);

    assertEquals(expectedAmountInWords + " dollar", result);
  }

  @Test
  public void third() {
    int amountInNumbers = 12;
    String expectedAmountInWords = "twelve";

    String result = NumberConverter.converter(amountInNumbers);

    assertEquals(expectedAmountInWords + " dollars", result);
  }

  @Test
  public void fourth() {
    int amountInNumbers = 10;
    String expectedAmountInWords = "ten";

    String result = NumberConverter.converter(amountInNumbers);

    assertEquals(expectedAmountInWords + " dollars", result);
  }

  @Test
  public void fifth() {
    int amountInNumbers = 800;
    String expectedAmountInWords = "eight hundred";

    String result = NumberConverter.converter(amountInNumbers);

    assertEquals(expectedAmountInWords + " dollars", result);
  }

  @Test
  public void sixth() {
    int amountInNumbers = 69;
    String expectedAmountInWords = "sixty nine";

    String result = NumberConverter.converter(amountInNumbers);

    assertEquals(expectedAmountInWords + " dollars", result);
  }

  @Test
  public void seven() {
    int amountInNumbers = 570;
    String expectedAmountInWords = "five hundred and seventy";

    String result = NumberConverter.converter(amountInNumbers);

    assertEquals(expectedAmountInWords + " dollars", result);
  }

  @Test
  public void eigth() {
    int amountInNumbers = 426;
    String expectedAmountInWords = "four hundred and twenty six";

    String result = NumberConverter.converter(amountInNumbers);

    assertEquals(expectedAmountInWords + " dollars", result);
  }
}