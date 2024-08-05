// Break

// public class BreakContinue
// {
//     public static void main(String[] args)
//     {
//         for(int i = 1; i<=10; i++)
//         {
//             if(i==5)
//             {
//                 break;
//             }
//             System.out.println(i);
//         }
//     }
// }

// public class BreakContinue
// {
//     public static void main(String[] args)
//     {
//         for(int i = 1; i<=10; i++)
//         {
//             if(i==5)
//             {
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }


// =================================================

import java.util.Scanner;

public class BreakContinue
{
    public static void main(String[] args)
    {
        int num,a,count = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number = ");
        num = scanner.nextInt();
        a = (int)num/2;

        for(int i = 2; i<=a; i++)
        {
            for(int j = 2; j<=a; j++)
            {
                if(i*j == num)
                {
                    ++count;
                }
            }
        }

        if(count==0)
        {
            System.out.println("prime");
        }
        else 
        {
            System.out.println("not a prime");
        }
        scanner.close();
    }
}