

public class CNC24_OOPs_Part_2
{
    // Instance Block - 1
    static
    {
        System.out.println("It will also run, and it called as instance Block.\n");

        int x,y,z;
        x=10;
        y=11;
        z=x*y;
        System.out.println("Multiplication is:- "+z+"\n");
    }
    // Instance Block - 2
    static
    {
        System.out.println("It will also run, and it called as instance Block.");

        int x,y,z;
        x=12;
        y=11;
        z=x/y;
        System.out.println("Subtraction is:- "+z+"\n");
    }
    // Instance Block - 3
//    {
//        System.out.println("It will also run, and it called as instance Block.");
//
//        int x,y,z;
//        x=10;
//        y=11;
//        z=x+y;
//        System.out.println("Sum is:- "+z+"\n");
//    }


    public static void main(String[] args) {

        CNC24_A obj1 = new CNC24_A();
        obj1.x=10; // value 10 will assign to var x that we create in another class
        System.out.println("Here we make object for class & print its value.");
        obj1.show(); // here we call show method in which print msg/value is written

        CNC24_A obj2 = new CNC24_A();
        obj2.x=20;
        System.out.println("\nNow again we make another object for that same class & print its value.");
        obj2.show();

        System.out.println("* It means we can create 2 or more objects for same class & assign different values too.");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

        Ab obj3 = new Ab();
        obj3.set(11,12); // this value first assign to 'a' then assign same value into 'x'.
        obj3.show();
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

        Abc obj4 = new Abc();
        obj4.set(11,12);
        obj4.show();
        System.out.println("In code we can declare variable in private & public with same name...\nIt dosen't throw any error, but compiler will confused in values & variable\n so it returns default value as zero--> 0, 0 ");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

        Abcd obj5 = new Abcd();
        obj5.set(10,20);
        obj5.show();
        System.out.println("Now if we write 'this' keyword at initializing same variable\nCompiler will understand that it talks about instance variable.that we declare in first line of private.");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n");


        Abcde obj6 = new Abcde(30,40);
        obj6.show();
        System.out.println("In this way we can pass value directly into class bracket.");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n");


        Abcdef obj7 = new Abcdef();
        // in this non-parameterized constructor 'new' keyword will create object automatically & calls constructor
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n");


        CNC24_OOPs_Part_2 inst = new CNC24_OOPs_Part_2();
        // without creating object if we runt it, so we will get an b;lank output
        System.out.println("If we write 'static' keyword so without creating any object it will give o/p, try it carefully.");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n");

        //LAST 3 MINUTE REMAINING





    }
}

