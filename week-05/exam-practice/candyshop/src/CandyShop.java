import java.util.ArrayList;
import java.util.List;

public class CandyShop {

  protected int shopSugarGramm;
  protected double incomeDollar;
  private static final double SUGARPRICE_1GR = 0.1;
  private int candyAmount;
  private int lollipopAmount;
  List<Sweet> storage = new ArrayList<>();
  protected static final Candy CANDY = new Candy();
  protected static final Lollipop LOLLIPOP = new Lollipop();

  public CandyShop(int shopSugerGramm) {
    this.shopSugarGramm = shopSugerGramm;
  }

  public void createSweets(Sweet sweet) {
    storage.add(sweet);
    shopSugarGramm -= sweet.sugarGramm;
    if (sweet == CANDY) {
      candyAmount++;
    } else {
      lollipopAmount++;
    }
  }

  public void raise(double raise) {
    CANDY.priceDollar += CANDY.priceDollar * (raise / 100);
    LOLLIPOP.priceDollar += LOLLIPOP.priceDollar * (raise / 100);
  }

  public void buySugar(int sugarAmount) {
    shopSugarGramm += sugarAmount;
    incomeDollar = incomeDollar - (sugarAmount * SUGARPRICE_1GR);
  }

  public void sell(Sweet sweet,int amount) {
    if (storage.size() != 0 ) {
      incomeDollar += sweet.priceDollar * amount;
      for (int i = 0; i < amount; i++) {
        storage.remove(sweet);
      }
    }
    if (sweet == CANDY && candyAmount !=0) {
      candyAmount -= amount;
    } else if (sweet == LOLLIPOP && lollipopAmount != 0) {
      lollipopAmount -= amount;
    } else {
      System.out.println("The storage is empty.");
    }
  }

  @Override
  public String toString() {
    return "Inventory: " + candyAmount + " candies, " + lollipopAmount + " lollipops, " + "Income: " +
            incomeDollar + "$" + ", Sugar: " + shopSugarGramm + "gr";
  }
}
