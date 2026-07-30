package exercises.Day_019;

public class Teacher extends Member implements Borrowable{
    Teacher(String name, String memberId)
    {
        super(name, memberId);
    }
    @Override
    public int getBorrowLimit()
    {
        return 10;
    }
    
}
