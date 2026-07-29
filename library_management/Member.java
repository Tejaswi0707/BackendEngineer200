package library_management;

public abstract class Member {

    private String name;
    private String memberId;
    private int booksBorrowed;

    public Member(String name, String memberId)
    {
        this.name=name;
        this.memberId=memberId;
    }

    public String getName(){return name;}
    public String getMemberId(){return memberId;}
    public int getBooksBorrowed(){return booksBorrowed;}

    public void borrow(){
        booksBorrowed+=1;
    }

    public boolean canBorrow(){
        return booksBorrowed < getBorrowLimit();
    }
    
    public void returnBook(){
        if(booksBorrowed>0){
            booksBorrowed-=1;
        }
    }

    public abstract int getBorrowLimit();


    
}
