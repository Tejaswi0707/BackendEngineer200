package Day_004;
class Book
{
    String title;
}

public class Exercise1 {
    public static void change(int x)
    {
        x=50;
    }
    public static void change(Book b)
    {
        b.title="Python";
    }
    public static void main(String args[])
    {
        int x=10;
        System.out.println("Before call:"+x);
        change(x);
        System.out.println("After call:"+x);
        Book b1=new Book();
        b1.title="Java";
        System.out.println("Before call:"+b1.title);
        change(b1);
        System.out.println("After call:"+b1.title);
    }
    /*
    As integer is primitive data type, it stores value rather than reference. So when we pass it as an argument, the changes made within in the method, will not be reflected outside the method. Hence, the value of x remains unchanged. 
    Whereas, Book b here b stores the refernce of the object. So when we pass it as an argument, the changes made within in the method, will be reflected outside the method as the changes are made to the object that b is referring to. Hence, the value of b1.title changes from Java to Python.
     */
    
}
