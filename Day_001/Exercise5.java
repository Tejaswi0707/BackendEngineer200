package Day_001;


public class Exercise5 {
    public static void main(String args[])
    {
    char character='*';
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(character);
        }
        System.out.println();
    }
}
}
