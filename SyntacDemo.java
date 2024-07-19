// {}{{}}{{{}}}

import java.util.Scanner;

public class SyntacDemo
{
    public static void main(String[] args)
    {
        String a;
        int size, count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Syntax = ");
        a = scanner.nextLine();
        size = a.length();

        for(int i = 0; i<size; i++)
        {
            if(count>=0)
            {
                if(a.charAt(i) == '{')
                {
                    ++count;
                }
                else 
                {
                    --count;
                }
            }
            else 
            {
                break;
            }
        }

        if(count==0)
        {
            System.out.println("Valid");
        }
        else 
        {
            System.out.println("Invalid");
        }

        scanner.close();
    }
}