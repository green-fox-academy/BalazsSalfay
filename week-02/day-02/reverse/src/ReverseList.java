import java.util.Arrays;

public class ReverseList {
  public static void main(String[] args) {

    int[] aj = {3, 4, 5, 6, 7};
    int[] ja = new int[5];

    for (int i = 0; i < aj.length; i++) {
      ja[i] = aj[aj.length - i - 1];
    }
    System.out.println(Arrays.toString(ja));
  }
}




// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`