package Day_005;
class Books
{
    String title;
    String author;
    int isbn;
    boolean available;
    Books(String title, String author, int isbn, boolean available)
    {
        this.title=title;
        this.author=author;
        this.isbn=isbn;
        this.available=available;
    }

    public void borrow(){
        if(this.available){
            this.available=false;
            System.out.println("Borrow successful");
        }
        else{
            System.out.println("Book already borrowed.");
        }
    }

    public void returnBook()
    {
        this.available=true;
        System.out.println("Return successful!");
    }

    public void display()
    {
        System.out.println("Book title:"+title+"\nAuthor:"+author+"\nAvailablity:"+available+"\nIsbn:"+isbn);

    }

}

public class Exercise2 {
    public static void main(String args[])
    {
        Books b1=new Books("Harry Potter", "J.K. Rowling", 1595, false);
        b1.borrow(); 
        b1.returnBook();

    }
    
    
}
