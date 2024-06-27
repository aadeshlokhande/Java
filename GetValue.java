// import java.util.Scanner;

// public class GetInput
// {
//     public static void main(String[] args)
//     {
//         // Create a Scanner object
//         Scanner scanner = new Scanner(System.in);

//         // Prompt the user to enter a string
//         System.out.print("Enter your name: ");
//         String name = scanner.nextLine();
//         System.out.println("Your name is: " + name);

// // Prompt the user to enter an integer
// System.out.print("Enter your age: ");
// int age = scanner.nextInt();
// System.out.println("Your age is: " + age);

// // Prompt the user to enter a double
// System.out.print("Enter your height in meters: ");
// double height = scanner.nextDouble();
// System.out.println("Your height is: " + height + " meters");

// Close the scanner
//         scanner.close();
//     }
// }


// ==========================================


// import java.util.Scanner;

// public class GetInput
// {
//     public static void main(String[] args)
//     {
//         int a,b,c;
//         // Create a Scanner object
//         Scanner scanner = new Scanner(System.in);

//         // Prompt the user to enter an integer
//         System.out.print("Enter a number = ");
//         a = scanner.nextInt();
//         System.out.print("Enter a number = ");
//         b = scanner.nextInt();

//         c = a + b;
//         System.out.println(c);
//         scanner.close();
//     }
// }


// ==========================================

import java.util.Scanner;

public class GetValue
{
    public static void main(String[] args)
    {
        int age;
        String name;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name = ");
        name = scanner.nextLine();

        System.out.print("Enter your age = ");
        age = scanner.nextInt();

        System.out.println("My name is " + name + " and my age is " + age );

        scanner.close();
    }
}
