package exercises.Day_020;

public class Member {
    private String name;
    private String memberId;
    private Address address;

    Member(String name, String memberId, Address address)
    {
        this.name=name;
        this.memberId=memberId;
        this.address=address;
    }

    public String getAddress(){
        return "City: "+address.getCity()+", State: "+address.getState();
    }
    public String getMemberId(){
        return memberId;
    }
    public String getName(){
        return name;
    }
}
