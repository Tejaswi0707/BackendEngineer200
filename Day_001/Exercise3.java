package Day_001;

class Student {
    String name;
    int age;
    String University;
    String FavoriteLanguage;

    Student(String name, int age, String University, String FavoriteLanguage)
    {
        this.name=name;
        this.age=age;
        this.University=University;
        this.FavoriteLanguage=FavoriteLanguage;
    }
}

public class Exercise3 {
    public static void main(String args[])
    {
        Student student1=new Student("Alex", 24, "UNT", "Java");
        System.out.println("Name:"+student1.name+" Age:"+student1.age+" University:"+student1.University+" Favorite Language:"+student1.FavoriteLanguage);

    }
    
}
