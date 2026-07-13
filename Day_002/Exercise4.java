package Day_002;
class Rectangle
{
    int length;
    int breadth;

    Rectangle(int length, int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    public int area()
    {
        return length*breadth;
    }
    public int perimeter()
    {
        return 2*(length+breadth);
    }
}

public class Exercise4 {
    public static void main(String args[])
    {
        Rectangle r1=new Rectangle(10, 20);
        Rectangle r2=new Rectangle(30,40);
        System.out.println("Area of r1: " + r1.area());
        System.out.println("Perimeter of r1: " + r1.perimeter());
        System.out.println("Area of r2: " + r2.area());
        System.out.println("Perimeter of r2: " + r2.perimeter());
    }
    
}
