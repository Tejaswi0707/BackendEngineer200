package Java.Day_009;
class Test{
    private String name;

    public static void main(String args[])
    {
        Test t=new Test();
        System.out.println(t.name);// as we are accessing the private variable name in the same class, it will print null. As we have not initialized the variable name, it's an instance variable and default value of String is null.
    }
}