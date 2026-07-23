package library_management;
import java.util.*;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Student> students=new ArrayList<>();

    public void registerBook(Book book)
    {
        books.add(book);
    }

    public void registerStudent(Student student)
    {
        students.add(student);
    }

    public void displayBooks()
    {
        System.out.println("List of Books:\n");
        for(Book book: books)
        {
            System.out.println(book.getTitle());
        }
    }

    public void displayStudents()
    {
        System.out.println("List of Students:\n");
        for(Student student: students)
        {
            System.out.println(student.getName());
        }
    }

    public void borrowBook(Student student, Book book)
    {
        if(student!=null && book!=null)
        {
            book.borrow(student);
        }
    }    

    public Book findBookByIsbn(String isbn)
    {
        for (Book book: books)
        {
            if(book.getIsbn().equals(isbn)){return book;}
        }
        return null;
    }
}
