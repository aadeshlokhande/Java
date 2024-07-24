
public class Student
{
    int age;
    int marks;
    String name;

    public void info()
    {
        System.out.println("I am a Student class");
    }

    public void getData(int a, int b, String c)
    {
        age = a;
        marks = b ;
        name = c;
    }

    public void printData()
    {
        System.out.println("age ="+age);
        System.out.println("marks = "+marks);
        System.out.println("name = "+name);
    }
}