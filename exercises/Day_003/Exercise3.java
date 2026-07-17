package exercises.Day_003;

public class Exercise3 {
    public static int area(int side)
    {
        return side*side;
    }
    public static int area(int length, int width)
    {
        return length*width;
    }
    public static void main(String args[])
    {
        int side=5;
        int length=10, width=20;
        System.out.println("Area of square:"+area(side));
        System.out.println("Area of rectangle:"+area(length, width));
        
    }
}
