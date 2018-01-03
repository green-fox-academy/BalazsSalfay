import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

public class Stream6 {

  public static void main(String[] args) {

    List<String> mytext = new ArrayList<String>();
    mytext.add("thisisanicelongword");

    Map<Character, Long> charFrequency = mytext.stream()
            .collect(Collectors.groupingBy(c -> c,Collectors.counting()));
    System.out.println(charFrequency);
  }
}
