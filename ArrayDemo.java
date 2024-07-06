// Array 

// datatype[] arrrName;
// datatype []arrrName;
// datatype arrrName[];-----> 

// arrrName = new arrrName[size];


// public class ArrayDemo
// {
//     public static void main(String[] args)
//     {
//         // int a[];
//         // a = new int[5];
//         // a[1] = 10;
//         // System.out.println(a[6]);
        
//         // int a[] = new int[5];

//     }
// }



// import java.util.Scanner;

// public class ArrayDemo
// {
//     public static void main(String[] args)
//     {
//         int a[] = new int[5];

//         Scanner scanner = new Scanner(System.in);
//         // System.out.print("Enter a number = ");
//         // a[3] = scanner.nextInt();
//         // System.out.println(a[3]);

//         for(int i = 0; i<5; i++)
//         {
//             System.out.print("Enter a number = ");
//             a[i] = scanner.nextInt();
//         }

//         for(int i = 0; i<5; i++)
//         {
//             System.out.println(a[i]);
//         }
//         scanner.close();
//     }
// }


// import java.util.Scanner;

// public class ArrayDemo
// {
//     public static void main(String[] args)
//     {
//         int a[] = new int[5];
//         int sum = 0;
//         Scanner scanner = new Scanner(System.in);

//         for(int i = 0; i<5; i++)
//         {
//             System.out.print("enter a number = ");
//             a[i] = scanner.nextInt();
//         }

//         for(int i = 0; i<5; i++)
//         {
//             sum = sum + a[i];
//         }
//         System.out.println("total sum = "+sum);
//         scanner.close();
//     }
// }


// import java.util.Scanner;

// public class ArrayDemo
// {
//     public static void main(String[] args)
//     {
//         int size ;
//         double avrg,sum = 0;
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("enter a array size = ");
//         size = scanner.nextInt();

//         int arr[] = new int[size];

//         for(int i = 0; i<size; i++)
//         {
//             System.out.println("Enter a number = ");
//             arr[i] = scanner.nextInt();
//         }

//         for(int i = 0; i<size; i++)
//         {
//             sum = sum + arr[i];
//         }

//         avrg = sum/size;
//         System.out.println("total sum = "+sum);
//         System.out.println("avrg = "+avrg);
//         scanner.close();
//     }
// }

// 4.965484
// 3.673824958438

// import java.util.Scanner;

// public class ArrayDemo
// {
//     public static void main(String[] args)
//     {
//         int a[] = new int[10];
//         int max = 0;
//         Scanner scanner = new Scanner(System.in);
//         for(int i = 0; i<10; i++)
//         {
//             System.out.print("enter a number = ");
//             a[i] = scanner.nextInt();
//         }
        
//         for(int i = 0; i<10; i++)
//         {
//             if(max<a[i])
//             {
//                 max = a[i];
//             }
//         }

//         System.out.println("max = "+max);
//         scanner.close();
//     }
// }