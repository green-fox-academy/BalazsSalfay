import java.util.ArrayList;
import java.util.Arrays;

public class QuoteSwap {
  public static void main(String[] args) {

    ArrayList<String> list = new ArrayList<String>
            (Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

    ArrayList<String> fixedQuote = new ArrayList<>(list);

    fixedQuote.set(2,list.get(5));
    fixedQuote.set(5,list.get(2));

    System.out.println(fixedQuote.toString());
  }
}




 //"What I cannot create, I do not understand"