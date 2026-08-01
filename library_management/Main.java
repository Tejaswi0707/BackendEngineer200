package library_management;

public class Main {
    public static void main(String args[])
    {
        Library library=new Library();

        //Register books
        Book book1=new Book("Harry Potter","J.K.Rowling", "ISBN001");
        Book book2=new Book("Lord of Rings", "CJ Nowmy", "ISBN002");
        

        library.registerBook(book1);
        library.registerBook(book2);
        
        Address address1=new Address("Hyderabad","Telangana");
        Address address2=new Address("Bangalore","Karnataka");

        //Register students
        Student student1 = new Student("Tejaswi", "S001", address1);
        Student student2 = new Student("Divya", "S002", address2);

        library.registerMember(student1);
        library.registerMember(student2);
        

        System.out.println("\nBooks:");
        library.displayBooks();

        System.out.println();

        System.out.println("Members:");
        library.displayMembers();

        student1.displayMemberDetails();

      
    }
    
}
