package exercises.Day_005;

public class Exercise4 {
    public static void main(String args[])
    {
    Books b1=new Books("Harry Potter", "J.K.Rowling", 1456, true);
    Books b2=new Books("Lord of Rings", "Jane king", 1234, true);
    Books b3=new Books("King of thrones", "Lewis Carrol", 456, true);

    b1.borrow();
    b2.borrow();
    b3.borrow();

    b1.returnBook();

    b1.display();
    b2.display();
    b3.display();
    } 
}
