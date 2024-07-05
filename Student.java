import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class Student
{
    public static void main(String[] args) 
  {
    String classs = "", sectionn = "", namee = "", finelData = "", row = "";
    try 
    {
      File file = new File("Students.txt");
      Scanner myReader = new Scanner(file);

        for(int i = 1; i<=22; i++)
        {
            String data = myReader.nextLine();
            if(data.startsWith("**"))
            {
                classs = data.replace("** ", "");
                continue;
            }

            else if(data.startsWith("--"))
            {
                sectionn = data.replace("-- ", "");
                continue;

            }
            else
            {
                namee = data;
            }
            row = classs+", "+sectionn+", "+namee+"\n";
            finelData = finelData + row;
        }
    
    try 
    {
        FileWriter myWriter = new FileWriter("students.csv");
        myWriter.write(finelData);
        myWriter.close();
    } 
    catch (IOException e) 
    {
        System.out.println("An error occurred.");

    }
    System.out.println(finelData);
      myReader.close();
    } 
    catch (FileNotFoundException e) 
    {
      System.out.println(e);
      System.out.println("An error occurred.");
    }
  }
}