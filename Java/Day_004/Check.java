package Java.Day_004;
import java.util.Random;

public class Check {
    int numEggs=0;
    public Check()
    {
        System.out.println("In constructor");
        System.out.println(numEggs);
    }

    public Check(int numEggs)
    {
        this.numEggs = numEggs;
        System.out.println(numEggs);
    }

    public static void main(String args[])
    {
        Check c=new Check();
        Check c1=new Check(50);
        Random r=new Random();
        System.out.println(r.nextInt(10));
    }
    
}
