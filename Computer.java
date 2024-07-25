

public class Computer 
{

    void computer_method() 
    {
       System.out.println("Power gone! Shut down your PC soon...");
    }

    public static void main(String[] args) 
    {
       Computer c = new Computer();
       Laptop l = new Laptop();
       c.computer_method();
       l.laptop_method();
    }
}


class Laptop 
 {

    void laptop_method() 
    {
       System.out.println("99% Battery available.");
    }
 }