package exercises.Day_023;

public class Main {
    public static void main(String args[])
    {
        // Create an instance of the enum
        Day today=Day.MONDAY;
        System.out.println(today);

        Counter c1=new Counter();
        Counter c2=new Counter();
        Counter c3=new Counter();

        System.out.println(Counter.getCount());
    }

    
}
