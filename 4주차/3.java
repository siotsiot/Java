import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private String grade;
    private int studentNumber;
    static int student_count = 0;

    public Student(String grade, String name) {
        this.grade = grade;
        this.name = name;
        student_count++;
        this.studentNumber = student_count;
    }

    public String toString() {
        return "Student "+ studentNumber + ":" + "Name - " + name + ", Grade - " + grade;
    }
}

public class StudentTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        String grade, name;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Student name: ");
            name = sc.nextLine();
            System.out.print("Enter Student grade: ");
            grade = sc.nextLine();
            list.add(new Student(grade, name));
        }
        System.out.println("--------------------------");
        System.out.println("Total Students: " + Student.student_count);
        System.out.println();
        for (Student s : list)
            System.out.println(s);
    }
}
