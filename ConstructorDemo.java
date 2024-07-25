// Constructor

public class ConstructorDemo
{
    public static void main(String[] args)
    {
        Student aadesh = new Student(10,20);
        // aadesh.getData(10, 20);
        aadesh.printData();
    }
}


class Student
{
    int age;
    int marks;

    // Student()
    // {
    //     System.out.println("Welcome");
    // }


    Student(int a, int m)
    {
        age = a;
        marks = m;
    }
    
    void printData()
    {
        System.out.println(age);
        System.out.println(marks);
    }

}
 

