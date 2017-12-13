import java.util.ArrayList;

public class Sum {
  ArrayList<Integer> elements;
  Sum () {
    elements = new ArrayList<>();
    elements.add(34);
    elements.add(65);
    elements.add(27);

  }

  public int summingElement(ArrayList<Integer> element) {
    int summing = 0;
    for (int i = 0; i < element.size(); i++) {
      summing = element.get(i) + summing;
    }
    return summing;
  }
}
