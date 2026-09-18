package Java.Day_006;

public class Exercise4 {
    int x=1;
    {
        System.out.println(x);
        x=2;
    }
    {
        System.out.println(x);
        x=3;
    }
    public Exercise4(){
        System.out.println(x);
        x=100;
    }
    public static void main(String args[])
    {
        Exercise4 e = new Exercise4();
        System.out.println(e.x);
    }
    
}
