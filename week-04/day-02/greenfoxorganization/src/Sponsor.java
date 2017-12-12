public class Sponsor extends Person {
  String company;
  int hiredStudents;

  public Sponsor(String name, int age, String gender,String company) {
    super(name, age, gender);
    this.company = company;
    hiredStudents = 0;
  }

  public Sponsor() {
    company = "Google";
  }

  public void getGoal() {
    System.out.println(message + "Hire brilliant junior software developers.");
  }

  public void introduce() {
    System.out.println("Hi, I am " + name + ", a " + age + " years old " + gender
            + " who represents " + company + " and hired " + hiredStudents + " students fo far.");
  }

  public int hire() {
    return hiredStudents++;
  }
}
