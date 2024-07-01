// NestedForLoop

// * * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *

// for(init; cond; inc/dec)
// {
//     code;
//     for(init; cond; inc/dec)
//     {
//         code;
//     }
//     code;
// }

// table of 5 :-> 5 10 15.....




// public class NestedForLoop
// {
//     public static void main(String[] args)
//     {
//         for(int i = 1; i<=5; i++)
//         {
//             for(int j = 1; j<=5; j++)
//             {
//                 System.out.print("* ");
//             }
//             System.out.print("\n");
//         }
//     }
// }



// public class NestedForLoop
// {
//     public static void main(String[] args)
//     {
//         for(int i = 1; i<=5; i++)
//         {
//             for(int j = 1; j<=5; j++)
//             {
//                 System.out.print(j+" ");
//             }
//             System.out.print("\n");
//         }
//     }
// }



// public class NestedForLoop
// {
//     public static void main(String[] args)
//     {
//         for(int i = 1; i<=5; i++)
//         {
//             for(int j = 1; j<=5; j++)
//             {
//                 System.out.print(" "+i+j);
//             }
//             System.out.print("\n");
//         }
//     }
// }


// 11 12 13 14 15
// 21 22 23 24 25
// 31 32 33 34 35
// 41 42 43 44 45
// 51 52 53 54 55


// 1 1 1 1 1
// 0 0 0 0 0
// 0 0 0 0 0
// 0 0 0 0 0
// 0 0 0 0 0

// public class NestedForLoop
// {
//     public static void main(String[] args)
//     {
//         for(int i = 1; i<=5; i++)
//         {
//             for(int j = 1; j<=5; j++)
//             {
//                 if(i==1)
//                 {
//                     System.out.print("1 ");
//                 }
//                 else
//                 System.out.print("0 ");
//             }
//             System.out.print("\n");
//         }
//     }
// }







// 11 12 13 14 15
// 21 22 23 24 25
// 31 32 33 34 35
// 41 42 43 44 45
// 51 52 53 54 55


// 1 0 0 0 0
// 0 1 0 0 0
// 0 0 1 0 0
// 0 0 0 1 0
// 0 0 0 0 1

// public class NestedForLoop
// {
//     public static void main(String[] args)
//     {
//         for(int i = 1; i<=5; i++)
//         {
//             for(int j = 1; j<=5; j++)
//             {
//                 if(i==j)
//                 {
//                     System.out.print("1 ");
//                 }
//                 else
//                 System.out.print("0 ");
//             }
//             System.out.print("\n");
//         }
//     }
// }


// ****************  *****************


// // 11 12 13 14 15
// // 21 22 23 24 25
// // 31 32 33 34 35
// // 41 42 43 44 45
// // 51 52 53 54 55


// // 1 0 0 0 0
// // 1 1 0 0 0
// // 1 1 1 0 0
// // 1 1 1 1 0
// // 1 1 1 1 1

// public class NestedForLoop
// {
//     public static void main(String[] args)
//     {
//         for(int i = 1; i<=5; i++)
//         {
//             for(int j = 1; j<=5; j++)
//             {
//                 if(i>=j)
//                 {
//                     System.out.print("* ");
//                 }
//                 else
//                 System.out.print("  ");
//             }
//             System.out.print("\n");
//         }
//     }
// }

// ****************  *****************

// 11 12 13 14 15
// 21 22 23 24 25
// 31 32 33 34 35
// 41 42 43 44 45
// 51 52 53 54 55


//         *
//       * *
//     * * *
//   * * * *
// * * * * *

// public class NestedForLoop
// {
//     public static void main(String[] args)
//     {
//         for(int i = 1; i<=5; i++)
//         {
//             for(int j = 1; j<=5; j++)
//             {
//                 if(i+j>=6)
//                 {
//                     System.out.print("* ");
//                 }
//                 else
//                 System.out.print(" ");
//             }
//             System.out.print("\n");
//         }
//     }
// }



// 11 12 13 14 15
// 21 22 23 24 25
// 31 32 33 34 35
// 41 42 43 44 45
// 51 52 53 54 55

// 1 1 1 1 1
// 1 0 0 0 1
// 1 0 0 0 1
// 1 0 0 0 1
// 1 1 1 1 1


// public class NestedForLoop
// {
//     public static void main(String[] args)
//     {
//         for(int i = 1; i<=5; i++)
//         {
//             for(int j = 1; j<=5; j++)
//             {
//                 if(i==1 || j==1 || i==5 || j==5)
//                 {
//                     System.out.print("* ");
//                 }
//                 else
//                 System.out.print("  ");
//             }
//             System.out.print("\n");
//         }
//     }
// }


// 1 0 0 0 0
// 1 1 0 0 0
// 1 0 1 0 0
// 1 0 0 1 0
// 1 1 1 1 1


// 1 0 1 0 1
// 0 1 0 1 0
// 1 0 1 0 1
// 0 1 0 1 0
// 1 0 1 0 1





// *******************************
// *******************************
// *******************************



// public class NestedForLoop
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




// public class NestedForLoop
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




// ^^^^^^^^^^^^HOMEWORK^^^^^^^^^^^^
// ^^^^^^^^^^^^^^^^^^^ With Index ^^^^^^^^^^^^^^^^^^^^^^^^^^

// 1 0 0 0 0
// 1 0 0 0 0
// 1 0 0 0 0
// 1 0 0 0 0
// 1 0 0 0 0

// 1 0 0 0 0
// 1 1 0 0 0
// 1 1 1 0 0
// 1 1 1 1 0
// 1 1 1 1 1

// 1 1 1 1 1
// 0 1 1 1 1
// 0 0 1 1 1
// 0 0 0 1 1
// 0 0 0 0 1

// 1 0 0 0 0
// 0 1 0 0 0
// 0 0 1 0 0
// 0 0 0 1 0
// 0 0 0 0 1

// 0 0 0 0 1
// 0 0 0 1 0
// 0 0 1 0 0
// 0 1 0 0 0
// 1 0 0 0 0

// 1 1 1 1 1
// 1 0 0 0 1
// 1 0 0 0 1
// 1 0 0 0 1
// 1 1 1 1 1

// 1 1 1 1 1
// 1 1 0 1 1
// 1 0 1 0 1
// 1 1 0 1 1
// 1 1 1 1 1

// 1 0 1 0 1
// 0 1 0 1 0
// 1 0 1 0 1
// 0 1 0 1 0
// 1 0 1 0 1


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

// * * * * *
// *       *
// *       *
// *       *
// * * * * *

// *
// * *
// *   *
// *     *
// * * * * *

// * * * * *
// * *   * *
// *   *   *
// * *   * *
// * * * * *

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



// public class NestedForLoop
// {
//     public static void main(String[] args)
//     {
//         int a = 0;
//         for(int i = 1; i<=10; i++)
//         {
//             for(int j = 1; j<=10; j++)
//             {
//                 ++a;
//                 System.out.print(a+"\t");
//             }
//             System.out.println("");
//         }
//     }
// }


// ======================================================
// whatsapp formating 

// *bold*
// _italic_
// *_aadesh_* 
// ~stroke~

// - aadesh 
// > aadesh 
// 1. hello 
// ```code```
// `code`