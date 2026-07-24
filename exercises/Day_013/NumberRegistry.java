package exercises.Day_013;
import java.util.*;

public class NumberRegistry {
    ArrayList<Integer> nums=new ArrayList<>();

    public void addNumber(int num)
    {
        if(!containsNumber(num))
        {
        nums.add(num);
        return;
        }
        System.out.println("The number already exists: "+num);
    }
    public boolean containsNumber(int num)
    {
        for (Integer number:nums) 
        {
            if(number==num){return true;}
        }
        return false;
    }

    
}
