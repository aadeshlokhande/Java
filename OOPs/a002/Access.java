public class Access 
{
    public static void main(String[] args)
    {
        Student samyak = new Student();
        // samyak.age = 21;
        // samyak.marks = 79;
        // samyak.name = "samyak";
        samyak.getData(10, 20, "samyak");

        Student kaustubh = new Student();
        // kaustubh.age = 20;
        // kaustubh.marks = 86;
        // kaustubh.name = "kaushtubh";
        kaustubh.getData(21, 90, "kaushtubh");
        // System.out.println(kaustubh.name);
        samyak.printData();
        kaustubh.printData();
        // samyak.info();
    }
}
