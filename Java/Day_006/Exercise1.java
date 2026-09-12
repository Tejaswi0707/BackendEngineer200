package Java.Day_006;

public class Exercise1 {
    int x = 10;
    {
        System.out.println("Initializer");
    }
    public Exercise1(){
        System.out.println("Constructor");
        x=20;
    }
    {
        System.out.println("Initializer2");
        System.out.println(x);
    }
    public static void main(String args[]){
        System.out.println("Main");
        Exercise1 obj=new Exercise1();
        System.out.println(obj.x);
    }
}
