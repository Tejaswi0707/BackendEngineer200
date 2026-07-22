package library_management;

public class Library {

    public void borrowBook(Student student, Book book)
    {
        if(student!=null && book!=null)
        {
            book.borrow(student);
        }
    }    
}
