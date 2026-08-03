package exercises.Day_021;

public class Student {
    private String name;
    private int age;
    Student(String name, int age)
    {
        this.age=age;
        this.name=name;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj==null){return false;}
        if(!(obj instanceof Student)){return false;}
        Student other=(Student) obj;
        return this.name.equals(other.name) && this.age==other.age;

    }
    
}
