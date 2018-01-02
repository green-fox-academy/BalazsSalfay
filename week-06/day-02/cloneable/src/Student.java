public class Student extends Person implements Cloneable {
  private String previousOrganization;
  private int skippedDays;

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    skippedDays = 0;
  }

  public Student() {
    previousOrganization = "The School of Life";
  }

  public void getGoal() {
    System.out.println(message + "Be a junior software developer.");
  }

  public void introduce() {
    System.out.println("Hi, I am " + name + ", a " + age + " years old " + gender + " from " + previousOrganization +
            " who skipped " + skippedDays + " days from the course already.") ;
  }

  public void skipDays(int numberOfDays) {
    skippedDays += numberOfDays;
  }

  public Object clone()throws CloneNotSupportedException  {
    return super.clone();
  }
}
