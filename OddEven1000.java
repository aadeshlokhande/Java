// OddEven1000


// import java.io.FileWriter;   // Import the FileWriter class
// import java.io.IOException;  // Import the IOException class to handle errors

// public class OddEven1000
// {
//   public static void main(String[] args) 
//   {
//     try 
//     {
//       FileWriter myWriter = new FileWriter("EvenOddDemo.java");
//       myWriter.write("import java.util.Scanner;\npublic class EvenOddDemo\n{\n\tpublic static void main(String[] args)\n\t{\n\tint num;\n\tScanner scanner = new Scanner(System.in);\n\tSystem.out.print(\"enter a number = \");\n\tnum = scanner.nextInt();\n\tif(num==0)\n\t{\n\t\tSystem.out.println(\"Even\");\n\t}");
//       for(int i = 1; i<=5000; i++)
//       {
//         myWriter.write("\n\t\telse if(num=="+i+")\n\t\t{\n\t\t\tSystem.out.println(\"Odd\");\n\t\t}");
//         ++i;
//         myWriter.write("\n\t\telse if(num=="+i+")\n\t\t{\n\t\t\tSystem.out.println(\"Even\");\n\t\t}");
//       }      
//       myWriter.write("\n\t\telse\n\t\t{\n\t\t\tSystem.out.println(\"fhilal value out of range\");\n\t\t}\n\t\tscanner.close();\n\t}\n}");
//       myWriter.close();
//     } 
//     catch (IOException e) 
//     {
//       System.out.println("An error occurred.");

//     }
//   }
// }