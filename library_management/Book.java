package library_management;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean available=true;

    Book(String title, String author, String isbn)
    {
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }
    
}
