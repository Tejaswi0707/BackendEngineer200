package exercises.Day_019;

public abstract class Member {
    private String name;
    private String memberId;
    private int booksBorrowed;

    Member(String name, String memberId)
    {
        this.name=name;
        this.memberId=memberId;
    }

    public void borrow(){booksBorrowed+=1;}
    public void returnBook(){booksBorrowed-=1;}

    public abstract int getBorrowLimit();
    
}
