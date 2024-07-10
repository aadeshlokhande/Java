// operator


// **************** arithmatic *****************
// unary
// a = 10

// print(-a) ------------> -10
// print(+a) ------------> 10
// ++a -------> +1
// print(a) ----------> 11
// --a -------> -1
// print(a) ----------> 9

// a++ 
// ++a 


// binary
// a = 10
// b = 20
// print(a + b) ------> 30
// print(a - b) ------> -10
// print(a * b) ------> 200
// print(a / b) ------> 0.0
// print(a % b) ------> 10
// =========================================
// **************** Relationship *****************
// binary
// a = 10 
// b = 20 
// a < b -----------> true 
// a > b -----------> false 
// a <= b ----------> true 
// a >= b ----------> false 
// a == b ----------> false 
// a != b ----------> true 

// ternary
// condition ? trueCode : falseCode;

// age = 4
// age > 18 ? print("hello") : print("bye bye");
// a = age > 18 ? 10 : 20;


// **************** logical *****************

// and - && - ziddi 
// gupchup         paneer      feel 
//     0               0       0 
//     0               1       0 
//     1               0       0 
//     1               1       1 


// or - || - garreb dil wala
// gupchup         paneer      feel 
    // 0               0           0 
    // 0               1           1 
    // 1               0           1
    // 1               1           1

// not - ! - ulte khopdi
// 1 ----> 0 
// 0 ----> 1 
// not true ---> false 
// not false ----> true 

// **************** assignment *****************
// a = 10 
// b = a 

// a = 10 
// // a = a + 2 
// a += 2 
// a -= 2 
// a *= 2 
// a /= 2 
// a %= 2 

// public class OperatorDemo
// {
//     public static void main(String[] args)
//     {
//         int a = 10;
//         System.out.println("a = "+a); // 10
//         a += 2;
//         System.out.println("a = "+a); // 12
//         a -= 2;
//         System.out.println("a = "+a); // 8 / 10
//         a *= 2;
//         System.out.println("a = "+a); // 20
//         a /= 2;
//         System.out.println("a = "+a); // 5 / 10 
//         a %= 2;
//         System.out.println("a = "+a); // 0
//     }
// }

// *********************************

import java.util.Scanner;

public class OperatorDemo
{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of (a) = ");
        a = scanner.nextInt();
        System.out.print("Enter the value of (b) = ");
        b = scanner.nextInt();
        c = a + b;
        System.out.println(a+" + "+b+" = "+c);
        scanner.close();
    }
}

// 10 + 20 = 30 