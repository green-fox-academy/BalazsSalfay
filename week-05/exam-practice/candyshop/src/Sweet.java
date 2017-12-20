public class Sweet {

  protected double priceDollar;
  protected int sugarGramm;

  public Sweet(double priceDollar, int sugarGramm) {
    this.priceDollar = priceDollar;
    this.sugarGramm = sugarGramm;
  }

  public Sweet() {
  }

  public double getPriceDollar() {
    return priceDollar;
  }

  public int getSugarGramm() {
    return sugarGramm;
  }

  public void setPriceDollar(double priceDollar) {
    this.priceDollar = priceDollar;
  }

  public void setSugarGramm(int sugarGramm) {
    this.sugarGramm = sugarGramm;
  }
}
