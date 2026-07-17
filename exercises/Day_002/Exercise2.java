package exercises.Day_002;

class Book{
        String title;
        String author;
        int pages;
        int price;

        Book(String title, String author, int pages, int price){
            this.title=title;
            this.author=author;
            this.pages=pages;
            this.price=price;
        }
    }

public class Exercise2 {
    public static void main(String args[])
    {
        Book book1=new Book("Harry Potter", "J.K. Rowling", 500,2000);
        Book book2=new Book("The Great Gatsby", "F. Scott Fitzgerald", 180, 1500);
        System.out.println("Title:"+book1.title+"\n"+"Author:"+book1.author+"\n"+"Pages:"+book1.pages+"\n"+"Price:"+book1.price);
        System.out.println();
        System.out.println("Title:"+book2.title+"\n"+"Author:"+book2.author+"\n"+"Pages:"+book2.pages+"\n"+"Price:"+book2.price);
        
    }
    
}
