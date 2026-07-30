package exercises.Day_019;

public class Student extends Member implements Borrowable
{
    Student(String name, String memberId)
    {
        super(name, memberId);
    }
    @Override
    public void borrow(){
        super.borrow();
    }
    @Override 
    public void returnBook(){
        super.returnBook();
    }
    @Override
    public int getBorrowLimit()
    {
        return 5;
    }


}