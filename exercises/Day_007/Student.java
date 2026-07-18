package exercises.Day_007;

public class Student {
    private String name;
    private String studentId;

    Student(String name, String studentId)
    {
        this.name=name;
        this.studentId=studentId;
    }
    Student(String name)
    {
        this.name=name;
        studentId="Not assigned";
    }
    public String getName(){return name;}
    public String getStudentId(){return studentId;}

    public void display()
    {
        System.out.println("Student name:"+name+"\nStudent ID:"+studentId);
    }
    
}
