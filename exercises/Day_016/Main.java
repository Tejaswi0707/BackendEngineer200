package exercises.Day_016;

public class Main {
    public static void main(String args[])
    {
        Member s=new Student();
        Member t=new Teacher();
        Member g=new Guest();
    

        System.out.println(s.getBorrowLimit());
        System.out.println(t.getBorrowLimit());
        System.out.println(g.getBorrowLimit());

    }
    
}
