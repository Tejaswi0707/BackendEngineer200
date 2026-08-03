package exercises.Day_021;
import java.util.*;

public class Main {
    public static void main(String args[]){
        Student s1=new Student("Teju",20);
        Student s2=new Student("Teju",20);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println("-------------");
        System.out.println(s1.equals(s2));

        HashSet<Student> set=new HashSet<>();
        set.add(s1);

        System.out.println(set.contains(s2));
    }
}
