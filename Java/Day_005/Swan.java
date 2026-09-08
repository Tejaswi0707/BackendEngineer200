package Java.Day_005;
public class Swan {
    int numberEggs; //instance variable

    public static void main(String args[])
    {
        Swan mother = new Swan();
        mother.numberEggs=5;
        System.out.println("Number of eggs: " +mother.numberEggs);
    }


}