package Java.Day_007;

public class Reference {
    public static void main(String args[])
    {
        String a=new String("Hello");
        String b=a;
        String c=new String("Hello");
        System.out.println(a==b); //It will return true because both a and b are pointing to the same object in the heap memory.
        System.out.println(a==c); //It will return false because a and c are pointing to different objects in the heap memory.
    }
    
}
