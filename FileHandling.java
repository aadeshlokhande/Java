// File Handling

// read mode 
// write mode 

// abc.txt -----> hello -----> var (read mode)
// var ------> hello -----> file (write mode)

// Java Program to Illustrate reading from
// FileReader using FileReader class


// **************** read mode *****************

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class FileHandling 
{
  public static void main(String[] args) 
  {
    try 
    {
      File file = new File("abc.txt");
      Scanner myReader = new Scanner(file);

      String data = myReader.nextLine();
      System.out.println(data);
      myReader.close();
    } 
    catch (FileNotFoundException e) 
    {
      System.out.println(e);
      System.out.println("An error occurred.");
    }
  }
}






// import java.io.File;  // Import the File class
// import java.io.FileNotFoundException;  // Import this class to handle errors
// import java.util.Scanner; // Import the Scanner class to read text files

// public class FileHandling 
// {
//   public static void main(String[] args) 
//   {
//     try 
//     {
//       File file = new File("abc.txt");
//       Scanner myReader = new Scanner(file);

//       // for(int i = 1; i<=10; i++)
//       while (myReader.hasNextLine())
//       {
//         String data = myReader.nextLine();
//         System.out.println(data);
//       }

//       myReader.close();
//     } 
//     catch (FileNotFoundException e) 
//     {
//       System.out.println(e);
//       System.out.println("An error occurred.");
//     }
//   }
// }




// // **************** Write mode *****************


// import java.io.FileWriter;   // Import the FileWriter class
// import java.io.IOException;  // Import the IOException class to handle errors

// public class FileHandling 
// {
//   public static void main(String[] args) 
//   {
//     try 
//     {
//       FileWriter myWriter = new FileWriter("abc.txt");
//       myWriter.write("Hello");
//       myWriter.close();
//     } 
//     catch (IOException e) 
//     {
//       System.out.println("An error occurred.");

//     }
//   }
// }


// public class FileHandling
// {
//   public static void main(String[] args)
//   {
//     String str = "** Aadesh";
//     boolean a;
//     a = str.startsWith("**");
//     System.out.println(a);

//   }
// }



// import java.util.Scanner;

// public class FileHandling
// {
//   public static void main(String[] args)
//   {
//     int num;
//     Scanner scanner = new Scanner(System.in);
//     System.out.print("enter a number = ");
//     num = scanner.nextInt();
//     if(num==0)
//     {
//       System.out.println("Even");
//     }
//     else if(num==1)
//     {
//       System.out.println("Odd");
//     }
//     else if(num==2)
//     {
//       System.out.println("Even");
//     }
//     .
//     .
//     else if(num==1000)
//     {
//       System.out.println("Even");
//     }
//     else 
//     {
//       System.out.println("fhilal value out of range");
//     }
//     scanner.close();
//   }
// }

// 4020 lines 

// ===========================================
// ATM ----> recursion

// pin.txt ----> 2345 -----> 1122
// bal.txt ----> 12000 ----> 10800 -----> 12000

// press 1 : withdraw
//     enter your pin = 2345
//       enter your amount = 1200
//           transaction completed
//           current balance = 10800
//         low balance 
//       wrong pin 

// press 2 : check balance
//   enter your pin = 2345
//     current balance = 10800
//   wrong pin 

// press 3 : change pin 
//   enter your pin = 2345
//     enter new pin = 1122
//     confirm pin = 1122
//         pin changed
//     pin match nhi hori
//   wrong pin 

// press 4 : deposit 
//   enter a pin = 2345
//     enter a amount = 1200
//       current balance  = 12000 
//   wrong pin