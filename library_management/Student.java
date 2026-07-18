package library_management;

public class Student {
    private String name;
    private String studentId;
    private int booksBorrowed;

    Student(String name, String studentId, int booksBorrowed)
    {
        this.name=name;
        this.studentId=studentId;
        this.booksBorrowed=booksBorrowed;
    }
    public String getName(){return name;}
    public String getStudentId(){return studentId;}
    public int getBooksBorrowed(){return booksBorrowed;}
    
    public void display()
    {
        System.out.println("Student Name:"+name+"\nStudent Id:"+studentId+"\nBooks borrowed:"+booksBorrowed);
    }
}
