package library_management;

public class Main {
    public static void main(String args[])
    {
        Student student=new Student("Tejaswi", "UNT001", 5);
        Book book=new Book("Harry Potter", "J.K. Rowling", "12345");
        
        Library library=new Library();
        library.borrowBook(student, book);
        

    }
    
}
