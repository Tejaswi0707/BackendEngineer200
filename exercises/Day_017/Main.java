package exercises.Day_017;
import java.util.*;

public class Main {
    public static void main(String args[])
    {
        ArrayList<Member> members=new ArrayList<>();

        members.add(new Student());
        members.add(new Teacher());
        members.add(new Guest());
        
        for (Member member:members)
        {
            member.introduce();
        }

    }
    
}
