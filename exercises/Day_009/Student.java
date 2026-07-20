package exercises.Day_009;

public class Student {
    String name;
    int borrowedCount;
    Student(String name)
    {
        this.name=name;
    }

    public void borrowBook()
    {
        borrowedCount+=1;
    }

    public void returnBook()
    {
        if(borrowedCount>0){
        borrowedCount-=1;
        return;
        }
        System.out.println("No books to return!");
    }
    public void display()
    {
        System.out.println("Student name:"+name+"\nBorrowed:"+borrowedCount);
    }
    
}
