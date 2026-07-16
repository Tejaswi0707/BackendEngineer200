package Day_005;
class Book
{
    String title;
    String author;
    boolean available;
    int isbn;

    Book(String title, String author, boolean available, int isbn)
    {
        this.title=title;
        this.author=author;
        this.available=available;
        this.isbn=isbn;
    }
    public void display()
    {
        System.out.println("Book title:"+title+"\nAuthor:"+author+"\nAvailablity:"+available+"\nIsbn:"+isbn);
    }
}

public class Exercise1 {
    public static void main(String args[])
    {
        Book b1=new Book("Harry Potter", "J.K. Rowling", true, 1547);
        b1.display();
    }
    
}
