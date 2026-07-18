package exercises.Day_007;

public class Main {
    public static void main(String args[])
    {
        Student s1=new Student("Tejaswi", "UNT001");
        Student s2=new Student("Rahul");

        Rectangle r1=new Rectangle(10,20);
        Rectangle r2=new Rectangle(5);

        s1.display();
        s2.display();

        r1.calculateArea();
        r2.calculateArea();
    }
    
}
