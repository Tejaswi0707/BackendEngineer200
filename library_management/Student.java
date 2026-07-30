package library_management;

public class Student extends Member implements Borrowable{

    public Student(String name, String memberId)
    {
        super(name, memberId);
    }
    @Override 
    public void borrow()
    {
        super.borrow();
    }

    @Override 
    public void returnBook()
    {
        super.returnBook();
    }

    @Override
    public int getBorrowLimit()
    {
        return 5;
    }
}
