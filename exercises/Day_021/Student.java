package exercises.Day_021;
import java.util.*;

public class Student {
    private String name;
    private int age;
    Student(String name, int age)
    {
        this.name=name;
        this.age=age;
    }

    @Override
    public boolean equals(Object obj){
        Student other=(Student)obj;

        return this.name.equals(other.name) && this.age==other.age;
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, age);
    }
    
}
