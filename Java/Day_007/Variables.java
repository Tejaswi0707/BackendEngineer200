package Java.Day_007;

public class Variables {
    String s1, s2;
    String x;

    public static void main(String args[])
    {
        Variables obj=new Variables();
        System.out.println(obj.s1);
        String s="yes", n="no";
        System.out.println(s);
        System.out.println(n);

        int l1,l2,l3=90; //multiple variable declaration
        System.out.println(l3);
        int x=100; int y=980;
        System.out.println(x);
        System.out.println(y);

        long String = 965430000; // String is a keyword in Java, but here it is used as a variable name. It is not recommended to use keywords as variable names. here, the range of long is -9223372036854775808 to 9223372036854775807, so it will not give an error because the value is within the range for long. We can use long data type to store this value.
        System.out.println(String);

        
    }
    
}
