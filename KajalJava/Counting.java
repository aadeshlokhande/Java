// Counting 1 - 100

public class Counting
{
    public static void main(String[] args)
    {
        int a = 0;
        for(int i = 1; i<=10; i++)
        {
            for(int j = 1; j<=10; j++)
            {
                ++a;
                System.out.print(a+"\t");
            }
            System.out.println("");
        }
    }
}