package exercises.Day_008;

public class Book {
    private String title;
    private Student borrower;

    Book(String title)
    {
        this.title=title;
        this.borrower=null;
    }

    public void returnBook()
    {
        borrower=null;
        System.out.println("Book returned successfully!");
    }

    public void borrow(Student student)
    {
        if (borrower!=null){
            System.out.println("Book already borrowed");
            return;
        }
        borrower=student; //Storing reference to the exisitng one.
        System.out.println("Book borrowed successfully");
    }

    public void display()
    {
        System.out.println("Book title:"+title);
        if (borrower!=null)
        {
            System.out.println("Borrower name:"+borrower.getName());
            return;
        }
        System.out.println("Available");
        
    }
    
}
