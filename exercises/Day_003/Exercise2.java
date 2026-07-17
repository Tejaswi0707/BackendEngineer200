package exercises.Day_003;

public class Exercise2 {
    public static int square(int a){return a*a;}
    public static int cube(int a){return a*a*a;}
    public static boolean isEven(int a){return a%2==0;}
    public static void main(String args[])
    {
        int n=5;
        System.out.println("Square:"+square(n)+"\nCube:"+cube(n)+"\nisEven:"+isEven(n));
    }
    
}
