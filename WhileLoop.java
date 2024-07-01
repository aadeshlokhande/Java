// While loop

// a = 10 
// a < 10

// while(condition)
// {
//     code;
// }


// import java.util.Scanner;

// public class WhileLoop 
// {
//     public static void main(String[] args)
//     {
//         int a = 1;
//         while(a<=10)
//         {
//             System.out.println("good morning babu");
//             a++;
//         }    
//     }
// }



// import java.util.Scanner;
// public class WhileLoop 
// {
//     public static void main(String[] args)
//     {
//         int a,b, con = 1;
//         Scanner scanner = new Scanner(System.in);
//         while(con==1)
//         {
//             System.out.print("Enter a number = ");
//             a = scanner.nextInt();
//             System.out.print("Enter a number = ");
//             b = scanner.nextInt();
//             System.out.println(a+b);
//             System.out.println("do you want to continue = ");
//             con = scanner.nextInt();
//         }
//         scanner.close();
//     }
// }



// enter a -ve number = 3
// enter a -ve number = 5
// enter a -ve number = 5
// enter a -ve number = 8
// enter a -ve number = -6
// thanks for entering -ve number 

// *******************************************
// **************** Homework *****************
// *******************************************


// get 2 values from user and print addition till answer is 0(zero)

// ****************  *****************
// get values from user till 0. if he enter zero then print sum of all previous values
// enter a number = 4 
// enter a number = 6
// enter a number = 2
// enter a number = 8
// enter a number = 0
// answer = 20

// import java.util.Scanner;

// public class WhileLoop
// {
//     public static void main(String[] args)
//     {
//         int sum = 0,a=5; 
//         Scanner scanner = new Scanner(System.in);

//         while(a!=0)
//         {
//             System.out.print("Enter a number = ");
//             a = scanner.nextInt();
//             sum = sum + a;
//         }

//         System.out.println("total sum ="+sum);
//         scanner.close();
//     }
// }
// ****************  *****************

// factorial
// 5! = 5x4x3x2x1 = 120 


// ****************  *****************
// biryani = 120

// import java.util.Scanner;

// public class WhileLoop
// {
//     public static void main(String[] args)
//     {
//         int numPlate = 0, con = 1, biryani = 120;
//         Scanner scanner = new Scanner(System.in);
//         while(con==1)
//         {
//             System.out.print("do you want biryani 1/0 = ");
//             con = scanner.nextInt();
//             if(con==1)
//                 ++numPlate;
//         }
//         con = numPlate * biryani;
//         System.out.println("your total bill is "+con);
//         scanner.close();
//     }
// }
