package exercises.Day_008;

public class Main {
    public static void main(String args[])
    {
        Student s1=new Student("Tejaswi");
        Student s2=new Student("Divya");

        Book b1=new Book("Harry Potter");
        Book b2=new Book("Lord of Rings");

        b1.borrow(s1);
        
        b1.display();
        b2.display();
    }
    
}
