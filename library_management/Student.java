package library_management;

public class Student extends Member implements Borrowable{

    public Student(String name, String memberId, Address address)
    {
        super(name, memberId, address);
    }

    @Override
    public int getBorrowLimit()
    {
        return 5;
    }
}
