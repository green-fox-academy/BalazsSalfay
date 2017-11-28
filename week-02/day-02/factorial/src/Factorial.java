public class Factorial {
    public static void main(String[] args) {
        int number = 12;
        factorio(number);
        System.out.println(number);

    }
    public static int factorio (int number){
        for (int i=0; i<number; i++) {
            int numberFactor = i;
            System.out.println(numberFactor);
        }
        return ;
    }
}
