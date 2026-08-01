package exercises.Day_020;

public class Main {
    public static void main(String args[]){
        Address address=new Address("Hyderabad","Telangana");
        Member student=new Member("Tejaswi","S001",address);

        System.out.println(student.getAddress());
    }
    
}
