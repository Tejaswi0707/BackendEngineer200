package exercises.Day_006;

class Books
{
    private boolean available=true;

    public boolean borrow()
    {
        if(this.available==true){
            this.available=false;
            return true;
        }
        return false;
    }
    public void returnBook()
    {
        this.available=true;
        System.out.println("Book returned!");
    }


}

public class Exercise4 {
    public static void main(String args[])
    {
        Books b1=new Books();
        if(b1.borrow())
        {
            System.out.println("Book borrowed succesfully!");
        }
        else
        {
            System.out.println("Unavailable");
        }

    }
    
}
