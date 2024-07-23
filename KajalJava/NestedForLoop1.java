// NestedForLoop



// * * * * * 
// * * * * * 
// * * * * * 
// * * * * * 
// * * * * * 


// public class NestedForLoop1
// {
//     public static void main(String[] args)
//     {
//         for(int i = 1; i<=5; i++)
//         {
//             for(int j = 1; j<=5; j++)
//             {
//                 System.out.print("* ");
//             }
//             System.out.println("");
//         }

//     }
// }




// 1 * 
// 2 * * 
// 3 * * * 
// 4 * * * * 
// 5 * * * * * 



// public class NestedForLoop1
// {
//     public static void main(String[] args)
//     {
//         for(int i = 1; i<=5; i++)
//         {
//             for(int j = 1; j<=i; j++)
//             {
//                 System.out.print("* ");
//             }
//             System.out.println("");
//         }

//     }
// }




// 5 * * * * * 
// 4 * * * * 
// 3 * * *
// 2 * * 
// 1 * 


// public class NestedForLoop1
// {
//     public static void main(String[] args)
//     {
//         for(int i = 5; i>=1; i--)
//         {
//             for(int j = 1; j<=i; j++)
//             {
//                 System.out.print("* ");
//             }
//             System.out.println("");
//         }
//     }
// }


// 1 
// 1 2
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5  



// public class NestedForLoop1
// {
//     public static void main(String[] args)
//     {
//         for(int i = 1; i<=5; i++)
//         {
//             for(int j = 1; j<=i; j++)
//             {
//                 System.out.print(j+" ");
//             }
//             System.out.println("");
//         }
//     }
// }



// 5 4 3 2 1 
// 4 3 2 1 
// 3 2 1 
// 2 1 
// 1

// i 1-5 
// j 5-1  
// j 

// public class NestedForLoop1
// {
//     public static void main(String[] args)
//     {
//         for(int i = 5; i>=1; i--)
//         {
//             for(int j = i; j>=1; j--)
//             {
//                 System.out.print(j+" ");
//             }
//             System.out.println("");
//         }
//     }
// }


// i 
// {
//     j 
//     {
//     }
//     k
//     {
//     }
// }
// ^^^^^^^^^^^^^^^^^^^ With Logic ^^^^^^^^^^^^^^^^^^^^^^^^^^

// *
// * *
// * * *
// * * * *
// * * * * *

//         *
//       * *
//     * * *
//   * * * *
// * * * * *

// * * * * *
//   * * * *
//     * * *
//       * *
//         *

//     *
//    * *
//   * * *
//  * * * *
// * * * * *

// * * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *

// * * * * *
// * * * *
// * * *
// * *
// *

// 1                           
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

// 1
// 2 1
// 3 2 1
// 4 3 2 1
// 5 4 3 2 1


// 5
// 5 4
// 5 4 3
// 5 4 3 2
// 5 4 3 2 1


// 5                
// 4 5             
// 3 4 5            
// 2 3 4 5          
// 1 2 3 4 5       



// 1 - 10 tables

// 1 - 100 counting
// 1 2 3 ......10
// 11 12 13.....20
// 21 22 23......30
// .
// .
// .
// 91 92 93......100
