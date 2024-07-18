// MultiDimensionArray


// import java.util.Scanner;

// public class MultiDimensionArray
// {
//     public static void main(String[] args)
//     {
//         // int a[][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
//         int a[][] = new int[4][3];
//         Scanner scanner = new Scanner(System.in);
//         for(int i = 0; i<4; i++)
//         {
//             for(int j = 0; j<3; j++)
//             {
//                 System.out.print("enter a number = ");
//                 a[i][j] = scanner.nextInt();
//             }
//             System.out.println("");
//         }


//         for(int i = 0; i<4; i++)
//         {
//             for(int j = 0; j<3; j++)
//             {
//                 System.out.print("\t"+a[i][j]);
//             }
//             System.out.println("");
//         }
//         // System.out.print("");
//         // scanner.close();
//     }
// }
// a[2][3][4] = {{{1,2,3,4},{1,2,3,4},{1,2,3,4}},{{1,2,3,4},{1,2,3,4},{1,2,3,4}}}


// marks[10][6] = {
//     {12,32,54,76,98,57},
//     {},
//     {}
// }
// *********************************

// a[] = {2,4,7,45,34,24};
// import java.util.Scanner;

// public class MultiDimensionArray
// {
//     public static void main(String[] args)
//     {
//         int a[] = {10,20,30,40,50,60,11,22,33,22,44};
//         int index = -1,num;
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("enter a number = ");
//         num= scanner.nextInt();
//         for(int i = 0; i<10; i++)
//         {
//             if(a[i] == num)
//             {
//                 index = i;
//                 break;
//             }
//         }
//         System.out.println(index);
//         scanner.close();
//     }
// }



// *******************************************

// import java.util.Scanner;

// public class MultiDimensionArray
// {
//     public static void main(String[] args)
//     {
//         int a[] = {10,20,30,40,50,60,11,22,33,22,44};
//         int index[] = {-1,-1},num;
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("enter a number = ");
//         num= scanner.nextInt();
//         for(int i = 0; i<10; i++)
//         {
//             if(a[i] == num)
//             {
//                 index[1] = i;
//                 break;
//             }
//         }

//         System.out.println(index);
//         scanner.close();
//     }
// }

// *********************************
// int a[4][3];

// a[1][1] = 10 
// print(a[1][1])

// int a[][] = {{10,20,30},{40,50,60},{11,22,33}};

// *******************************************
// **************** Homework *****************
// *******************************************


// get values of 2 matrix and print sum 

// 10 20 30
// 20 40 50
// 30 50 60 
// symetric matrix

// linear search for all values 

// marksheet
// marks[10][6] = {
//     {12,34,32,54,23,75},
//     {12,34,32,54,23,75},
//     {},
// };
// press 1 : marks 
    // rollnumber = 1
    // press 0 = marathi
    // press 1 = hindi
    // .
    // . 
    // press 5 = history
    // choice = 1
    // marks = 34
// press 2 : result
    // rollnumber = 0
    // hindi = 12 
    // marathi = 34 
    // . 
    // . 
    // .
// press 3 : whole result

//             hin     mar     eng     his     geo     math 
// rollnum0    89      78      67      56      78      89
// rollnum1    67      56      34      76      89      98