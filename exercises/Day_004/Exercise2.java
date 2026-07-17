package exercises.Day_004;

public class Exercise2 {
    public static void swap(int a, int b)
    {
        int temp=a;
        a=b;
        b=temp;
    }
    public static void main(String args[])
    {
        int a=10, b=20;
        swap(a,b);
        System.out.println("a="+a+" b="+b);
    }
    /* As integer is primitive data type, it stores value rather than reference. Hence, changes made outside the method will not be reflected. Hence, the output does not swap the integers, The output is a=10, b=20. To swap those integers, it is advised to write logic within in the main method itself. */
    
}
