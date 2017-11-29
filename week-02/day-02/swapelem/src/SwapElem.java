import java.util.Arrays;

public class SwapElem {
    public static void main(String[] args) {

       String[] abc = {"first", "second", "third"};

       abc[0] = "third";
       abc[2] = "first";

        System.out.println(Arrays.toString(abc));
    }
}




// - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`