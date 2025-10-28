import college.faculty.Faculty;
import college.student.Student;

public class MainApp {
    public static void main(String[] args) {
        Student s = new Student("Amol", 101);
        Faculty f = new Faculty("Dr. Meena", "Data Structures");

        System.out.println("=== College Details ===");
        s.display();
        f.display();
    }
}