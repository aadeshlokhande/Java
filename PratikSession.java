// PratikSession
import java.util.Scanner;

public class PratikSession
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n,key,flag=0,i;
        int []a = new int[30];
        System.out.print("Enter array size = ");
        n = scanner.nextInt();
        System.out.print("Enter array elements in ascending order = ");
        for(i=0; i<n ; i++)
        {
            a[i] = scanner.nextInt();
        }

        System.out.print("Enter key element = ");
        key = scanner.nextInt();

        int mid,low=0,high = n-1;
        for(i=0; i<n ; i++)
        {
            mid = (low + high)/2;
           if(a[mid]==key)
           {
                System.out.print("element found on position "+mid);
                flag = 1;
                break;
           }

           if(key>a[mid])
           {
                low = mid + 1;
           }
           else
           {
             high = mid - 1;
           }
        }

        if(flag==0)
        {
            System.out.println("element not found ");
        }

        scanner.close();
    }
}