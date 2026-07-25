package library_management;
import java.util.*;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Student> students=new ArrayList<>();

    public void registerBook(Book book)
    {
        if (findBookByIsbn(book.getIsbn())==null)
        {
            books.add(book);
            return;
        }
        System.out.println("Book already registered.");
    }

    public void registerStudent(Student student)
    {
        if(findStudentById(student.getStudentId())==null)
        {
            students.add(student);
            return;
        }
        System.out.println("Student already registered.");
    }

    public void displayBooks()
    {
        for(Book book: books)
        {
            System.out.println("Title: "+book.getTitle());
            System.out.println("Author: "+book.getAuthor());
            System.out.println("ISBN: "+book.getIsbn());
            System.out.println("Status: "+book.isAvailable());
            System.out.println();
        }
        
    }

    public void displayStudents()
    {
        for(Student student: students)
        {
            System.out.println("Name: "+student.getName());
            System.out.println("Student ID: "+student.getStudentId());
            System.out.println("Books Borrowed: "+student.getBooksBorrowed());
            System.out.println();
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

    public Student findStudentById(String id)
    {
        for(Student student: students)
        {
            if(student.getStudentId().equals(id)){return student;}
        }
        return null;
    }
}
