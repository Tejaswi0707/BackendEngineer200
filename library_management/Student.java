package library_management;

public class Student extends Member {

    public Student(String name, String memberId)
    {
        super(name, memberId);
    }

    @Override
    public int getBorrowLimit()
    {
        return 5;
    }
}
