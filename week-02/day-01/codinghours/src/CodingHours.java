public class CodingHours {
    public static void main(String[] args) {
        int dailyCoding = 6;
        int semesterWeeks = 17;
        int codingDays = 5;

        int attendeeCoding = (dailyCoding * codingDays) * semesterWeeks;
        System.out.println(attendeeCoding);


        float avarageWorkHours = 52f;


        float avarageSemesterCoding = avarageWorkHours * semesterWeeks;

        float percentageCodingHours = (attendeeCoding / avarageSemesterCoding) * 100;
        System.out.println(percentageCodingHours);

    }
}
