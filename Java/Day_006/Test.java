package Java.Day_006;

public class Test {

    private int x = 1;                 // A

    {                                         // B
        x = 2;
        System.out.println(x);
    }

    public Test() {                     // C
        x = 3;
        System.out.println(x);
    }

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.x);
    }

    {                                         // D
        x = 4;
        System.out.println(x);
    }
}
