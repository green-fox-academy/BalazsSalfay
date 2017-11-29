import java.util.Arrays;

public class Colors {
    public static void main(String[] args) {

       String[][] mycolors = new String[3][5];

       mycolors[0] = new String[] {"lime", "forest green", "olive", "pale green", "spring green"};
       mycolors[1] = new String[] {"orange red", "red", "tomato"};
       mycolors[2] = new String[] {"orchid", "violet", "pink", "hot pink"};

       System.out.println(Arrays.deepToString(mycolors));
    }
}




// - Create a two dimensional array
//   which can contain the different shades of specified colors
// - In `colors[0]` store the shades of green:
//   `"lime", "forest green", "olive", "pale green", "spring green"`
// - In `colors[1]` store the shades of red:
//   `"orange red", "red", "tomato"`
// - In `colors[2]` store the shades of pink:
//   `"orchid", "violet", "pink", "hot pink"`