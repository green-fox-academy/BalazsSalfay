public class SecondInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int hoursLeft = 23 - currentHours;
        int minuteLeft = 60 - currentMinutes;
        int secondLeft = 60 - currentSeconds;

        System.out.println(hoursLeft + ":" + minuteLeft + ":" + secondLeft);
    }
}
