// MultiLevelInheritance

        // A
        // |
        // v
        // B
        // |
        // v
        // C

class GrandParent
{
    void grandParentQuality()
    {
        System.out.println("Story telling");
    }
}

class Parent extends GrandParent
{
    void parentQuality()
    {
        System.out.println("paisa kamana");
    }
}

class Child extends Parent
{
    void childQuality()
    {
        System.out.println("Paisa udana");
    }
}

public class MultiLevelInheritance
{
    public static void main(String[] args)
    {
        Child obj = new Child();
        obj.grandParentQuality();
        obj.parentQuality();
        obj.childQuality();
    }
}