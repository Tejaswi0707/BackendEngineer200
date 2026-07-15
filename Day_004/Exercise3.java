package Day_004;


public class Exercise3 {
    public static void rename(Book b)
    {
        b.title="C++";
    }
    public static void main(String args[])
    {
        Book b1=new Book();
        b1.title="Java";
        System.out.println("Before call:"+b1.title);
        rename(b1);
        System.out.println("After call:"+b1.title);
    }
    /*
    As b1 stores the referennce of the object. So when we pass it as an argument  to the method rename, the changes made within the method will be reflected outside the method as the changes are made to the object that b1 is referring to. Hence, the value of b1.title changes from Java to C++.
     */
    
}
