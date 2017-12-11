import java.util.*;

public class Dominoes {

  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    //System.out.println(dominoes);
    System.out.println("The ordered list of dominoes are: " + orderDominos(dominoes));
  }

  public static List<Domino> orderDominos(List<Domino> orderDom) {
    for (int i = 0; i < orderDom.size(); i++) {
      for (int j = i; j < orderDom.size(); j++) {
        if (orderDom.get(i).getValues()[1] == orderDom.get(j).getValues()[0]) {
          orderDom.add(i + 1, orderDom.get(j));
          orderDom.remove(j + 1);
        }
      }
    }
    return orderDom;
  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
}
