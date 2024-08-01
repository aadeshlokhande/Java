// Polymorphism
// compile time Polymorphism

// function overloading


// void calc ()
// {
//     "hello"
// }

// calc (int)
// {
//     "hello mitro"
// }

// calc(float)
// {
//     "hello janu"
// }

// calc(int,int)
// {

// }
// calc(int, float)
// {

// }

// calc(float,int)
// {

// }

// calc()---> 
// calc(2)---> 4 
// calc(2.0)-----> 8 
// calc(10,20)----> 20
// calc(10.0,20)----> -10
// calc(10,20.0)----> 200
// calc(10.0,20.0)----> 0.5


// class Calculator
// {
//     void calc(int a)
//     {
//         System.out.println(a*a);
//     }

//     void calc(int a, double b)
//     {
//         System.out.println(a/b);
//     }

//     void calc(double a, int b)
//     {
//         System.out.println(a*b);
//     }
// }

// public class Polymorphism
// {
//     public static void main(String[] args)
//     {
//         Calculator ob = new Calculator();
//         ob.calc(9.0,7);
//     }
// }



// ==========================================================================

// run time Polymorphism
// function overriding
// class Animal
// {
//     void eat()
//     {
//         System.out.println("Eating fruits");
//     }
// };

// class Dog extends Animal
// {
//     void eat()
//     {
//         System.out.println("Eating nonveg");
//     }
// }

// public class Polymorphism
// {
//     public static void main(String[] args)
//     {
//         Dog taffy = new Dog();
//         taffy.eat();
//     }
// }