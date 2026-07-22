package library_management;
import java.util.*;

public class Main {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Library library=new Library();
        int numOfBooks=sc.nextInt();sc.nextLine();
        for (int i=0;i<numOfBooks;i++)
        {
            String title=sc.nextLine();
            String author=sc.nextLine();
            String isbn=sc.nextLine();

            Book book=new Book(title, author, isbn);
            library.registerBook(book);
        }
        int numOfStudents=sc.nextInt();sc.nextLine();
        for (int i=0;i<numOfStudents;i++)
        {
            String name=sc.nextLine();
            String studentId=sc.nextLine();

            Student student=new Student(name, studentId);
            library.registerStudent(student);
        }

        library.displayBooks();
        library.displayStudents();

        sc.close();
    }
    
}
