// NestedIfElse

// if(condition)
// {
//     code;    
//     if(condition)
//     {
//         code;    
//     }
//     else 
//     {
//         code;
//     }
// }
// else 
// {
//     code;
//     if(condition)
//     {
//         code;    
//     }
//     else 
//     {
//         code;
//     }
// }



// import java.util.Scanner;

// public class NestedIfElse
// {
//     public static void main(String[] args)
//     {
//         int age;
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("enter a age = ");
//         age = scanner.nextInt();
//         if(age>0 && age<=70)
//         {
//             if(age>18)
//             {
//                 System.out.println("you can drive");
//             }
//             else 
//             {
//                 System.out.println("you can't drive");
//             }
//         }
//         else 
//         {
//             System.out.println("invalid age");
//         }
//         scanner.close();
//     }
// }

// *********************************
// Goa
// paisa >= 10000
// fds >= 5
// permission == 1 


// import java.util.Scanner;
// public class NestedIfElse
// {
//     public static void main(String[] args)
//     {
//         int budget, fds, permission;
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("bhai budget kitna hai = ");
//         budget = scanner.nextInt();
//         if(budget>=10000)
//         {
//             System.out.println("Apke sath kitne fds hai = ");
//             fds = scanner.nextInt();
//             if(fds>=5)
//             {
//                 System.out.println("parents ne permission di hai kya = ");
//                 permission = scanner.nextInt();
//                 if(permission==1)
//                 {
//                     System.out.println("aao Goa ja sakta ho");
//                 }
//                 else
//                 {
//                     System.out.println("Aap goa nhi ja sakte");
//                 }
//             }
//             else 
//             {
//                 System.out.println("bhai trip ke liye fds add kro");
//             }
//         }
//         else 
//         {
//             System.out.println("Bhag ja bhikmange");
//         }
//         scanner.close();
//     }
// }


// *******************************************
// **************** Homework *****************
// *******************************************

// get 3 values from user and print greater number


// budget > 600000
//     hum car le sakte hai 
// loan kitna mil sakta hai 
//     car le sakte
//     bike le sakte