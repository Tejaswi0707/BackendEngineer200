package exercises.Day_003;

class Student
{
    String name;
    int marks;

    Student(String name, int marks)
    {
        this.name=name;
        this.marks=marks;
    }
    public void display()
    {
        System.out.println("Name:"+name+"\nmarks:"+marks);
    }
    public boolean isPassed()
    {
        return marks>=40;
    }
}

public class Exercise4 {
    public static void main(String args[])
    {
        Student s1=new Student("Tejaswi", 26);
        s1.display();
        boolean result=s1.isPassed();
        System.out.println("Result:"+result);
    }
    
}
