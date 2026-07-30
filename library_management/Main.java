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
        

        //Register students
        Student student1 = new Student("Tejaswi", "S001");
        Student student2 = new Student("Divya", "S002");
       

        library.registerMember(student1);
        library.registerMember(student2);
        

        System.out.println("\nBooks:");
        library.displayBooks();

        System.out.println();

        System.out.println("Members:");
        library.displayMembers();

      
    }
    
}
