public class Person {
  protected String name;
  protected int age;
  protected String gender;
  protected String message = "My goal is: ";


  public Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public Person() {
    name = "Jane Doe";
    age = 30;
    gender = "female";
  }

  public void getGoal() {
    System.out.println(message + "Live for the moment!");
  }

  public void introduce() {
    System.out.println("Hi, I am " + name + ", a " + age + " years old " + gender + ".");
  }
}
