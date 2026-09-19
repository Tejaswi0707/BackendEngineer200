package Java.Day_007;

public class Reference {
    public static void main(String args[])
    {
        String a=new String("Hello");
        String b=a;
        String c=new String("Hello");
        System.out.println(a==b); //It will return true because both a and b are pointing to the same object in the heap memory (i.e, the reference that is stored in the stack memory is same for both a and b. Here, reference is the actual address of the object in the heap memory.)
        System.out.println(a==c); //It will return false because a and c are pointing to different objects in the heap memory (i.e, the reference that is stored in the stack memory is different for both a and b. Here, reference is the actual address of the object in the heap memory. As we are creating a new object for c, it will have a different reference in the stack memory.)

        int x=10;
        int y=x;
        int z=10;
        System.out.println(x==y); //It will return true because both x and y are having the same value and stored in the stack memory.
        System.out.println(x==z); //It will return true because both x and z are having the same value and stored in the stack memory.

        String s = null;
    }   
    
}
