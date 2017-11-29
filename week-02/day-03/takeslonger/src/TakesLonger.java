public class TakesLonger {
    public static void main(String[] args) {

        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        StringBuilder fixed = new StringBuilder();

        fixed.append(quote.substring(0,21)).append("always takes longer than").append(quote.substring(20));

        System.out.println(fixed.toString());
    }
}


// When saving this quote a disk error has occured. Please fix it.
// Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
// Using pieces of the quote variable (instead of just redefining the string)