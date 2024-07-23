// Nested For Loop


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
//             System.out.println("");
//         }        
//     }
// }



// public class NestedForLoop
// {
//     public static void main(String[] args)
//     {
//         for(int i = 1; i<=5; i++)
//          {
//             for(int j = 1; j<=5; j++)
//             {
//                 System.out.print(j+" ");
//             }
//            System.out.println("");
//         }        
//     }
// }




// public class NestedForLoop
// {
//     public static void main(String[] args)
//     {
//         for(int i = 1; i<=5; i++)
//          {
//             for(int j = 1; j<=5; j++)
//             {
//                 System.out.print(" "+i+j);
//             }
//            System.out.println("");
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
//          {
//             for(int j = 1; j<=5; j++)
//             {
//                 if(i==1)
//                 {
//                     System.out.print("1 ");
//                 }
//                 else 
//                 {
//                     System.out.print("0 ");
//                 }
//             }
//            System.out.println("");
//         }        
//     }
// }

// 11   12 13 14 15
// 21 22    23 24 25
// 31 32 33     34 35
// 41 42 43 44      45
// 51 52 53 54 55

// 1 0 0 0 0 
// 1 1 0 0 0
// 1 1 1 0 0
// 1 1 1 1 0
// 1 1 1 1 1 


// public class NestedForLoop
// {
//     public static void main(String[] args)
//     {
//         for(int i = 1; i<=5; i++)
//          {
//             for(int j = 1; j<=5; j++)
//             {
//                 if(i>=j)
//                 {
//                     System.out.print("* ");
//                 }
//                 else 
//                 {
//                     System.out.print("  ");
//                 }
//             }
//            System.out.println("");
//         }        
//     }
// }


// ****************  *****************

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
//          {
//             for(int j = 1; j<=5; j++)
//             {
//                 if(i==j)
//                 {
//                     System.out.print("1 ");
//                 }
//                 else 
//                 {
//                     System.out.print("0 ");
//                 }
//             }
//            System.out.println("");
//         }        
//     }
// }


// ****************  *****************
// 11 12 13 14 15
// 21 22 23 24      25
// 31 32 33         34 35
// 41 42            43 44 45
// 51               52 53 54 55

// 1 1 1 1 1
// 1 1 1 1 0
// 1 1 1 0 0 
// 1 1 0 0 0 
// 1 0 0 0 0 
// 8888888888888888888888888888888888888

// 11 12 13 14 15
// 21 22 23 24 25
// 31 32 33 34 35
// 41 42 43 44 45
// 51 52 53 54 55

// * * * * * 
// *       * 
// *       * 
// *       * 
// * * * * * 


// public class NestedForLoop
// {
//     public static void main(String[] args)
//     {
//         for(int i = 1; i<=5; i++)
//          {
//             for(int j = 1; j<=5; j++)
//             {
//                 if(i==1 || i==5 || j==1 || j==5)
//                 {
//                     System.out.print("1 ");
//                 }
//                 else 
//                 {
//                     System.out.print("0 ");
//                 }
//             }
//            System.out.println("");
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

// 11 12 13 14 15
// 21 22 23 24 25
// 31 32 33 34 35
// 41 42 43 44 45
// 51 52 53 54 55

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
