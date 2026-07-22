package exercises.Day_010;

public class MathApp {
    public static void main(String args[])
    {
        Calculator c=new Calculator();
        int a=10;
        int b=20;
        System.out.println("Addition:"+c.add(a,b));
        System.out.println("Subtraction:"+c.subtract(a,b));
        System.out.println("Multiplication:"+c.multiply(a,b));
        System.out.println("Division:"+c.divide(a,b));
    }
    
}
