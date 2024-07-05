// recursion 




// public class recursionDemo
// {
//     public static void hello(int a)
//     {
//         if(a>=1)
//         {
//             System.out.println("Hello mitro");

//             hello(a-1);
//         }
//     }
//     public static void main(String[] args)
//     {
//         hello(5);
//     }
// }


// factorial
// 5! = 5x4x3x2x1
// 4! = 4x3x2x1 
// 5! = 5x4! 

// n! = n x (n-1)!

// 1! = 1 
// 0! = 1 


// import java.util.Scanner;

// public class recursionDemo
// {
//     public static int factorial(int a)
//     {
//         if(a==1 || a==0)
//         {
//             return 1;
//         }
//         else 
//         {
//             return a * factorial(a-1);
//         }
//     }

//     public static void main(String[] args)
//     {
//         int num,ans;
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("enter a number = ");
//         num = scanner.nextInt();
//         ans = factorial(num);
//         System.out.println("factorial of "+num+ " is "+ans);
//         scanner.close();
//     }
// }

// 1 byte = 8 bit 
// 64 bit ---> int ----> 4 bytes ---> 32 bit ---> 2^32 ---> 
// 32 bit ---> int ----> 2 bytes ---> 16 bit 
