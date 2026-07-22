package exercises.Day_011;
import java.util.*;

public class StudentList {
    ArrayList<Student> students =new ArrayList<>();
    public void addStudent(Student student)
    {
        students.add(student);
    }
    public void displayStudents()
    {
        System.out.println("\nList of Student names:");
        for(Student student: students)
        {
            System.out.println(student.getName());
        }
    }  
}
