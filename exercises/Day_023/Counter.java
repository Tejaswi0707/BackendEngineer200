package exercises.Day_023;

//Counter class to keep track of the number of instances created
public class Counter {
    private static int count;

    public Counter(){
        count++;
    }

    public static int getCount(){
        return count;
    }
    
}
