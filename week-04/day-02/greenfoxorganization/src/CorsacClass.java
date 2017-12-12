import java.util.ArrayList;
import java.util.List;

public class CorsacClass {
  String classname;
  List<Student> students;
  List<Mentor> mentors;

  public CorsacClass(String classname) {
    students = new ArrayList<>();
    mentors = new ArrayList<>();
    this.classname = classname;
  }

  public void addStudent(Student student) {
    students.add(student);
  }

  public void addMentor(Mentor mentor){
    mentors.add(mentor);
  }

  public void info() {
    System.out.println("Corsac " + classname + " class has " + students.size() +
            " students and " + mentors.size() + " mentors.");
  }
}
