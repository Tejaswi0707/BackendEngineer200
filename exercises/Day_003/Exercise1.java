package exercises.Day_003;
import java.util.Scanner;

public class Exercise1 {
    public static int add(int a, int b){return a+b;}
    public static int sub(int a, int b){return a-b;}
    public static int multiply(int a, int b){return a*b;}
    public static double divide(int a, int b){return (double)a/b;}

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Addition:"+add(a,b));
        System.out.println("Subtraction:"+sub(a,b));
        System.out.println("Multiplication:"+multiply(a,b));
        System.out.println("Division:"+divide(a,b));
        sc.close();
    }
    
}
