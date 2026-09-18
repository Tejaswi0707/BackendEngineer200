package Java.Day_006;

public class Exercise5 {

    private int x = 1;                 // A

    {                                   // B
        x = 2;
        System.out.println(x);
    }

    public Exercise5() {                     // C
        x = 3;
        System.out.println(x);
    }

    public static void main(String[] args) {
        
    }

    {                                   // D
        x = 4;
        System.out.println(x);
    }
}
    
