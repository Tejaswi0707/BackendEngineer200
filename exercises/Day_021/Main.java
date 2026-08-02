package exercises.Day_021;

public class Main {
    public static void main(String args[]){
        Student s1=new Student("Tejaswi",20);
        Student s2=new Student("Tejaswi",20);
        System.out.println(s1==s2); 
        System.out.println(s1.equals(s2)); 
        System.out.println(s1);
    }
    
}
