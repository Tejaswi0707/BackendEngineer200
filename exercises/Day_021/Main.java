package exercises.Day_021;

public class Main {
    public static void main(String args[]){
        Student s1=new Student("Tejaswi",20);
        Student s2=new Student("Tejaswi",20);

        System.out.println(s1==s2); 
        System.out.println(s1.equals(s2)); 
        System.out.println(s1);

        String stud1=new String("Tejaswi");
        String stud2=new String("Tejaswi");
        System.out.println(stud1==stud2);
        System.out.println(stud1.equals(stud2));
    }
}
