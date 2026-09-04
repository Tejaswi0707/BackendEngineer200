package Java.Day_003;
import java.util.Date;
public class Conflicts{
    public static void main(String args[])
    {
        Date d=new Date();
        System.out.println(d);

        java.sql.Date d1=java.sql.Date.valueOf("2026-09-04");
        System.out.println(d1);
    }
}