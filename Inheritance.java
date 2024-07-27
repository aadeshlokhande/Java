// Inheritance
// single 

class Parent
{
    void ParentQuality()
    {
        System.out.println("hardworking");
    }
}

class Child extends Parent
{
    void childQuality()
    {
        System.out.println("Clever");
    }
}

public class Inheritance
{
    public static void main(String[] args)
    {
        // Parent jethalal = new Parent();
        // jethalal.ParentQuality();

        Child tappu = new Child();
        tappu.childQuality();
        tappu.ParentQuality();
    }
}
