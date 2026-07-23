package exercises.Day_012;
import java.util.*;

public class NumberSearch {
    ArrayList<Integer> numbers=new ArrayList<>();

    public void addNumber(int num)
    {
        numbers.add(num);
    }

    public boolean findNumber(int number)
    {
        for(Integer num:numbers)
        {
            if(num==number){return true;}
        }
        return false;
    }
    
}
