// ATM

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class ATM
{
    public static int readPin()
    {
        int a = 0;
        try 
        {
            File file = new File("pin.txt");
            Scanner myReader = new Scanner(file);

            a = myReader.nextInt();
            myReader.close();
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println(e);
            System.out.println("An error occurred.");
        }
        return a;
    }

    public static int readBal()
    {
        int a = 0;
        try 
        {
            File file = new File("bal.txt");
            Scanner myReader = new Scanner(file);

            a = myReader.nextInt();
            myReader.close();
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println(e);
            System.out.println("An error occurred.");
        }
        return a;
    }

    public static void writePin(int a)
    {
        try 
        {
            FileWriter myWriter = new FileWriter("pin.txt");
            myWriter.write(""+a);
            myWriter.close();
        } 
        catch (IOException e) 
        {
            System.out.println("An error occurred.");
        }
    }

    public static void writeBal(int a)
    {
        try 
        {
            FileWriter myWriter = new FileWriter("bal.txt");
            myWriter.write(""+a);
            myWriter.close();
        } 
        catch (IOException e) 
        {
            System.out.println("An error occurred.");
        }
    }
    
    
    
    
    public static void main(String[] args)
    {
        int choice, pin, bal, amount, upin, npin, cpin;
        Scanner scanner = new Scanner(System.in);
        System.out.println("**************** Welcome to ICE ATM *****************");
        System.out.println("Press 1 : Withdraw");
        System.out.println("Press 2 : Check balance");
        System.out.println("Press 3 : Change pin");
        System.out.println("Press 4 : Deposit");
        System.out.println("Enter your choice = ");

        choice = scanner.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Enter a pin = ");
                upin = scanner.nextInt();
                pin = readPin();
                if(upin==pin)
                {
                    System.out.println("Enter a amount = ");
                    amount = scanner.nextInt();
                    bal = readBal();
                    if(amount<bal)
                    {
                        System.out.println("transaction successful");
                        bal = bal - amount;
                        System.out.println("current balance = "+ bal);
                        writeBal(bal);
                    }
                    else 
                    {
                        System.out.println("low balance");
                    }
                }
                else
                {
                    System.out.println("wrong pin ");
                }
        }
        
        
        scanner.close();
    }
}