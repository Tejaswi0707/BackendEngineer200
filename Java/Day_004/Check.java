package Java.Day_004;
import java.util.Random;

public class Check {
    public Check()
    {
        System.out.println("In constructor");
    }

    public static void main(String args[])
    {
        Check c=new Check();
        Random r=new Random();
        System.out.println(r.nextInt(10));
    }
    
}
