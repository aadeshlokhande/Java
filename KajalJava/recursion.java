// recursion

// import java.util.Scanner;

// public class recursion
// {

//     static void abc()
//     {
//         System.out.print("Hello mitro ");
//         abc();
//     }

//     public static void main(String[] args)
//     {
//         abc();
//     }
// }



// import java.util.Scanner;

// public class recursion
// {
//     static void abc(int a)
//     {
//         if(a>=1)
//         {
//             System.out.println("Hello mitro ");
//             abc(a-1);
//         }
//     }

//     public static void main(String[] args)
//     {
//         abc(10);
//     }
// }


// =================================================


// Factorial
// 5! = 5x4x3x2x1 = 120
// 4! = 4x3x2xx1

// 5! = 5x4!
// n! = n x (n-1)!

// 1! = 1 
// 0! = 1 



// import java.util.Scanner;

// public class recursion
// {

//     static int factorial(int a)
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
//         int num, ans;
//         // Scanner scanner = new Scanner(System.in);
//         // System.out.print("enter a number = ");
//         // num = scanner.nextInt();
//         ans = factorial(10);
//         System.out.println(ans);

//         // scanner.close();
//     }
// }


