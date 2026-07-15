package Day_004;

public class Exercise4 {
    public static void replace(Book b)
    {
        b=new Book();
        b.title="Java Programming";
    }
    public static void main(String args[])
    {
        Book b1=new Book();
        b1.title="Python Programming";
        System.out.println("Before replace:"+b1.title);
        replace(b1);
        System.out.println("After replace:"+b1.title);
    }
    /*
    When we pass b1 to the replace method, the reference of the object is passed. So, when we create a new object, the reference is updated to point to the new object. However, the original reference in the main() method remains unchanged. Hence, the output for both the print statements will be Python Programming. */
    
}
