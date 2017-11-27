public class Swap {
    public static void main(String[] args) {
        int a = 123;
        int b = 526;


        a += (b - (b = a));
        System.out.println("a = " + a + ", b = " + b);


    }
}
