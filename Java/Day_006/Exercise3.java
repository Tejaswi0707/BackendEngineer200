package Java.Day_006;

public class Exercise3 {
    int x=1;
    {
        x=2;
    }
    public Exercise3(){
        x=3;
    }
    {
        x=4;
        System.out.println(x);
    }
    public static void main(String args[])
    {
        Exercise3 e =new Exercise3();
        System.out.println(e.x);
    }
    
}
