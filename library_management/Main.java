package library_management;

public class Main {
    public static void main(String args[])
    {
        Student s1=new Student("Tejaswi", "UNT001", 5);
        Book b1=new Book("Harry Potter", "J.K. Rowling", "12345");
        
        b1.borrow(s1);
        b1.display();
        
        b1.returnBook(); 
        b1.display();
        

    }
    
}
