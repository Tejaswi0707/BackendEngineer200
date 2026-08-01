package library_management;

public abstract class Member {

    private String name;
    private String memberId;
    private int booksBorrowed;
    private Address address;

    public Member(String name, String memberId, Address address)
    {
        this.name=name;
        this.memberId=memberId;
        this.address=address;
    }

    public String getName(){return name;}
    public String getMemberId(){return memberId;}
    public int getBooksBorrowed(){return booksBorrowed;}
    public String getAddress(){
        return "city: "+address.getCity()+", state: "+address.getState();
    }

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

    public void displayMemberDetails(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+memberId);
        System.out.println("City: "+address.getCity());
        System.out.println("State: "+address.getState());
        System.out.println("Books Borrowed: "+booksBorrowed);
    }

    public abstract int getBorrowLimit();   
}
