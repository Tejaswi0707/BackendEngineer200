package exercises.Day_006;
class Book
{
    private String title;
    private String author;
    private String isbn;
    private boolean available=true;

    public String getTitle(){ return title;}
    public String getAuthor(){return author;}
    public String getIsbn(){return isbn;}
    public boolean getAvailable(){ return available;}

    public void setTitle(String title)
    {
        if(title==""||title==null){
            System.out.println("Invalid title");
            return;
        }
        this.title=title;
    }

}

public class Exercise1 {
    public static void main(String args[])
    {
        Book b1=new Book();
        System.out.println(b1.getAvailable());
    }
    
}
