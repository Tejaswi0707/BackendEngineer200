package Java.Day_006;

class Egg {

    private int number = 3;       // A

    {                             // B
        number = 4;
        System.out.println(number);
    }

    public Egg() {                // C
        number = 5;
        System.out.println(number);
    }

    {
        number = 100;
    }

    public static void main(String[] args) {
        Egg e = new Egg();        // D
        System.out.println(e.number);
    }
}