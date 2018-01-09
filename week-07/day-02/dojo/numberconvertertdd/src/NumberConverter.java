import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberConverter {

  public static void main(String[] args) {
    System.out.println(converter(745));
  }

  public static String converter(int input) {
    List<String> from0to9 = new ArrayList<>(Arrays.asList("zero", "one", "two", "three", "four", "five", "six",
            "seven", "eight", "nine"));
    List<String> from11to19 = new ArrayList<>(Arrays.asList("eleven", "twelve", "thirteen", "fourteen", "fifteen",
            "sixteen", "seventeen", "eighteen", "nineteen"));
    List<String> from10to90 = new ArrayList<>(Arrays.asList("","ten", "twenty", "thirty", "fourty", "fifty", "sixty",
            "seventy", "eighty", "ninety"));
    String hundred = " hundred";
    String dollars = " dollars";
    if (input == 0 || input == 1) {
      return from0to9.get(input) + " dollar";
    } else if (input < 10) {
      return from0to9.get(input) + dollars;
    } else if (input > 10 && input < 20) {
      return from11to19.get(input - 11) + dollars;
    } else if (input < 100 && input % 10 == 0) {
      return from10to90.get(input / 10) + dollars;
    } else if (input >= 100 && input % 100 == 0) {
      return from0to9.get(input / 100) + hundred + dollars;
    } else if (input > 20 &&  input < 100 && input % 10 != 0 && input % 100 != 0) {
      return from10to90.get(input / 10) + " " + from0to9.get(input % 10) + dollars;
    } else if (input > 20 && input < 1000 && input % 100 != 0 && input % 10 == 0) {
      return from0to9.get(input / 100) + hundred + " and " + from10to90.get(input / 10 % 10) + dollars;
    } else if (input > 20 && input < 1000 && input % 10 != 0) {
      return from0to9.get(input / 100) + hundred + " and " + from10to90.get(input / 10 % 10) + " " +
             from0to9.get(input % 10) + dollars;
    } else {
      return  "Error";
    }
  }
}
