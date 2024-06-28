// Conditional Statement

// if 
// if(condition)
// {
//     code;
// }

// import java.util.Scanner;

// public class ConditionalStatement
// {
//     public static void main(String[] args)
//     {
//         int num;
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter a number = ");
//         num = scanner.nextInt();

//         if(num<10)
//         {
//             System.out.print("this is lesser than 10");
//         }
//         scanner.close();
//     }
// }


// import java.util.Scanner;

// public class ConditionalStatement
// {
//     public static void main(String[] args)
//     {
//         int age;
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("enter a age = ");
//         age = scanner.nextInt();

//         if(age>18)
//         {
//             System.out.print("Adult ");
//         }
//         System.out.print("Boy");
//         scanner.close();
//     }
// }


// if else 

// import java.util.Scanner;

// public class ConditionalStatement
// {
//     public static void main(String[] args)
//     {
//         int age;
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter your age = ");
//         age = scanner.nextInt();
//         if(age>18)
//         {
//             System.out.println("you can drive");
//         }
//         else
//         {
//             System.out.println("you can't drive");
//         }
//         scanner.close();
//     }
// }


// import java.util.Scanner;
// public class ConditionalStatement
// {
//     public static void main(String[] args)
//     {
//         String name;
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("enter your name = ");
//         name = scanner.nextLine();
//         if(name.equals("aadesh"))
//         {
//             System.out.println("hello");
//         }
//         scanner.close();
//     }
// }


// if else ladder 

// |_|
// |_|
// |_|
// |_|
// |_|
// | |

// if(condition)
// {
//     code;
// }
// else if(condition)
// {
//     code;
// }
// else if(condition)
// {
//     code;
// }
// else 
// {
//     code;
// }

// import java.util.Scanner;

// public class ConditionalStatement
// {
//     public static void main(String[] args)
//     {
//         int num;
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("enter a number = ");
//         num = scanner.nextInt();
        
//         if(num==1)
//         {
//             System.out.println("ONE");
//         }
//         else if(num==2)
//         {
//             System.out.println("TWO");
//         }
//         else if(num==3)
//         {
//             System.out.println("THREE");
//         }
//         else if(num==4)
//         {
//             System.out.println("FOUR");
//         }
//         else
//         {
//             System.out.println("invalid number");
//         }
        
//         scanner.close();
//     }
// }


// **************** Nested if else *****************

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

// public class ConditionalStatement
// {
//     public static void main(String[] args)
//     {
//         int age;
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter your age = ");
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




// if(condition)
// {
//     code;
//     if(condition)
//     {
//         code;
//         if(condition)
//         {
//             code;
//         }
//         else 
//         {
//             code;
//         }
//     }
//     else 
//     {
//         code;
//     }
// }
// else 
// {
//     code;
// }


// import java.util.Scanner;

// public class ConditionalStatement
// {
//     public static void main(String[] args)
//     {
//         int a,b,c;
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter 3 numbers = ");
//         a = scanner.nextInt();
//         b = scanner.nextInt();
//         c = scanner.nextInt();

//         if(a>b)
//         {
//             if(a>c)
//             {
//                 System.out.println(a);
//             }
//             else 
//             {
//                 System.out.println(c);
//             }
//         }
//         else 
//         {
//             if(b>c)
//             {
//                 System.out.println(b);
//             }
//             else 
//             {
//                 System.out.println(c);
//             }
//         }
//         scanner.close();
//     }
// }