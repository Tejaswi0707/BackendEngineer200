package library_management;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private Student borrower;

    Book(String title, String author, String isbn)
    {
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }

    public String getTitle(){return title;}
    public String getIsbn(){return isbn;}
    public String getAuthor(){return author;}
    public String isAvailable(){
        if (borrower==null){return "Available";}
        else{return "Not Available";}
    }

    public void borrow(Student student)
    {
        if (borrower!=null){
            System.out.println("Book already borrowed.");
            return;
        }
        borrower=student;
        borrower.borrow();
        System.out.println("Book borrowed successfully!");
    }

    public void returnBook()
    {
        borrower.returnBook();
        borrower=null;
    }

    public void display()
    {
        if (borrower!=null)
        {
            System.out.println("Borrower name:"+borrower.getName());
            return;
        }
        System.out.println("Available");  
    } 
}
