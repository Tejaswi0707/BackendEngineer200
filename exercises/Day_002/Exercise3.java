package exercises.Day_002;

class Books
{
    String title;
    String author;
    int pages;
    int price;

    Books(String title, String author, int pages, int price)
    {
        this.title=title;
        this.author=author;
        this.pages=pages;
        this.price=price;
    }
}

public class Exercise3 {
    public static void main(String args[])
    {
        Books book1=new Books("Lord of Rings", "J.K. Rowling", 500, 2000);
        Books book2=book1;
        book2.title="Harry Potter";
        System.out.println(book1.title);

    }
    
}
