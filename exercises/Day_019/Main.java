package exercises.Day_019;

public class Main{
    public static void main(String args[])
    {
        Member student=new Student("Tejaswi","S001");
        Member teacher=new Teacher("Reema","T001");

        student.borrow();
        student.returnBook();

        teacher.borrow();
        teacher.returnBook();
    }
    
}
