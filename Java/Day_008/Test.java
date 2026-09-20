package Java.Day_008;
class Test{
    int x = 10; // instance variable

    public void method()
    {
        int y= 20; //local variable

        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String arg[])
    {
        Test obj=new Test();
        obj.method();
    }
}