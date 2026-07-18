package library_management;

public class Main {
    public static void main(String args[])
    {
        Student s1=new Student("Tejaswi", "UNT001", 5);
        Student s2=new Student("Rooma", "UNT006", 2);

        Book b1=new Book("Harry Potter", "J.K. Rowling", "12345");
        Book b2=new Book("Lord of Rings", "Cathelen Mirni", "9087");
        Book b3=new Book("Alice in Wonderland", "Mehnrnn", "8768");

        s1.display();
        s2.display();


    }
    
}
