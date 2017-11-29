import java.util.Arrays;

public class PrintArgument {
    public static void main(String[] args) {

        printer("first", "second", "third");

    }
    public static void printer (String... text) {


        for( int i=0; i<text.length; i++) {
            System.out.println(Arrays.toString(text));
        }

    }
}







//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printer`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printer("first")
// printer("first", "second")
// printer("first", "second", "third", "fourh")
// ...