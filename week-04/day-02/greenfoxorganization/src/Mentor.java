public class Mentor extends Person {
  private String level;

  public Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.level = level;
  }

  public Mentor() {
    level = "intermediate";
  }

  public void introduce() {
    System.out.println("Hi, I am " + name + ", a " + age + " years old " + gender + " " + level + " mentor.");
  }

  public void getGoal() {
    System.out.println(message + "Educate brilliant junior software developers.");
  }
}
