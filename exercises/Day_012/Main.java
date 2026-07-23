package exercises.Day_012;

public class Main {
    public static void main(String args[])
    {
        NumberSearch nums=new NumberSearch();
        nums.addNumber(1);
        nums.addNumber(2);
        nums.addNumber(3);
        nums.addNumber(4);
        nums.addNumber(5);

        System.out.println("Is 4 present? "+nums.findNumber(4));
        System.out.println("Is 6 present? "+nums.findNumber(6));
    }
    
}
