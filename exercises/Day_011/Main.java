package exercises.Day_011;
import java.util.*;

public class Main {
    public static void main(String args[])
    {
        StudentList obj=new StudentList();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            String name=sc.next();
            Student student=new Student(name);
            obj.addStudent(student);
        }
        obj.displayStudents();
        sc.close();
    }
    
}
