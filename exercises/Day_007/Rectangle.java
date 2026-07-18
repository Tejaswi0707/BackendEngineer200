package exercises.Day_007;

public class Rectangle {

    private int length;
    private int width;

    Rectangle(int side)
    {
        this.length=side;
        this.width=side;
    }

    Rectangle(int length, int width)
    {
        this.length=length;
        this.width=width;
    }

    public void calculateArea()
    {
        System.out.println("Area:"+length*width);
    }
    
}
