// 27.09 completed

// 4th type of Inheritance--->
    // Multiple Inheritance:- which isn't support to java (multiple parent & single child)
    // by using 'extends' keyword we can inherit only one class's property by assigning one class at a time not multiple according to syntax

//class AbstA
//{
//    public void show() // eg of non abstract method
//    {
//        System.out.println("Its a Non-Abstract method(normal method that we used already)");
//    }
//}

// without declaring any printing statement & applying ';' to method it will behave as abstract method
// and Abstract class only can be written inside 'Interface' not inside 'class'
// class contains method name + body part
// interface contains only abstract method

        // MULTIPLE INHERITANCE
// HERE WE LINK CHILD WITH PARENT CLASS(interface with class)
interface AbstAa
{
    public void show1(); // eg of abstract method
}
interface AbstB
{
    public void show2(); // eg of abstract method
}

class AbstC implements AbstAa,AbstB // by implement we can get both parents here
// after 'implements' only Interface name will be written
// after 'extends' only Class name will be written
{
    public void show1()
    {
        System.out.println("\tI am from 'Interface-Aa' but implemented in 'Class-C'");
    }
    public void show2()
    {
        System.out.println("\tI am from 'Interface-B' but implemented in 'Class-C'");
    }
}

// HERE WE LINK CHILD WITH PARENT & AGAIN PARENT WITH PARENT(interface with interface)
interface Aaa
{
    public void show1();
}

interface Bbb extends Aaa // interface can link with interface using 'extend' keyword
{
    public void show2();
}

class Ccc implements Bbb // class link with interface by 'implement' keyword
{
    public void show1()
    {
        System.out.println("\tFrom class-A");
    }
    public void show2()
    {
        System.out.println("\tFrom class-B");
    }
}


    // ABSTRACT CLASS with abstract method
abstract class AbtA
{
    abstract void hello();
}

class AbtB extends AbtA  // A will be parent of B here
{
    void hello() // if child class dosent implement parent's method, then we get compile time error
    {
        System.out.println("\nImplementation of abstract class-A is done in class-B");
    }
}

class AbtC extends AbtA  // A will be parent of C here
{
    void hello() // if child class dosent implement parent's method, then we get compile time error
    {
        System.out.println("\nImplementation of abstract class-A is done in class-C");
    }
}

    // ABSTRACT CLASS with non-abstract method & constructor

abstract class AbstrA
{
    abstract void hello(); // abstract
    public void hello2()  // non-abstract
    {
        System.out.println("\nIts a non-abstract method");
    }
    AbstrA() // constructor
    {
        System.out.println("\nIts a parent constructor");
    }
}

class AbstrB extends AbstrA
{
    void hello()
    {

        System.out.println("I am an abstract method, Implemented from class-A");
    }
    AbstrB()
    {
        System.out.println("\nIts a child constructor \nChild cannot create its own method but it can create constructor of itself");
    }
}



public class CNC27_OOPs_Part_5 {
    public static void main(String[] args) {

        System.out.println("\t\t *-Multiple Inheritance-*");
        System.out.println("Multiple Inheritance is not support by Java Language.");
        System.out.println("\t1. By using 'extends' keyword we can inherit only one class's property by assigning one class at a time not multiple according to syntax.");
        System.out.println("\t2. Again if we have two super class & one child class and both have a method with same name as 'hello()' so sub class will get confused\n\tThat's why JAVA dosen't support Multiple inheritance.");
        System.out.println("\t3. In 'Interface' Parent class only have a method & its implementation is depends on child class");
        System.out.println("\t4. Interface have a default abstract method in it(if we dosent write any body part)");
        System.out.println("------------------------------------------------------------------------------------------------------");

        System.out.println("Below o/p generated by making normal link of class with interface");
        AbstC obj = new AbstC();
        obj.show1();
        obj.show2();
        System.out.println("--------------------------------------");

        System.out.println("Below o/p generated by making link of class with interface & interface with interface also.");
        Ccc intcl = new Ccc();
        intcl.show1();
        intcl.show2();
        System.out.println("--------------------------------------");


    // ABSTRACT CLASS with abstract method
        System.out.println("\t\t *-Abstract Class-*");
        System.out.println("\t1. If we write 'Abstract' infront of any class, so it will be behave as abstract class");
        System.out.println("\t2. Abstract class have atleast 1 abstract method in it with same keyword 'abstract'");
        System.out.println("\t3. After 1 compulsory abstract method we can declare another non-abstract method too & can also create a constructor");
        System.out.println("\t4. Implementation of abstract class should had to be done by every child class & its compulsory");
        System.out.println("\t5. Child class can't create its own method in abstract class");
        System.out.println("\t6. Similar as interface, we cant create object for Abstract class too. But we can create reference of it (just like object)");

        // Reference is create by giving parent name on LHS child name on RHS
        AbtA refA = new AbtB();
        refA.hello();
        System.out.println("\twe have 3 class + 3 output at 1 method so which class's o/p we get?");
        System.out.println("\tHere we create reference + give constructor as of class-B, so we get class-B method implementation o/p");

        AbtA refB = new AbtC();
        refB.hello();
        System.out.println("\tHere we create reference + constructor of class-C, so we will get o/p implementation of it");


    // ABSTRACT CLASS with non-abstract method & constructor
        System.out.println("--------------------------------------");
        AbstrA objq = new AbstrB(); // its a reference
        System.out.println("\nQ. In this scenario if both constructor are called, then which will print firstly");
        System.out.println("A. Parent constructor will be called first then child will be print");




    }
}
