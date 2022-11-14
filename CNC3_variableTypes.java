// WE SEE DEFAULT VALUES OF EVERY DATA TYPES IN JAVA HERE...
class  CNC3_variableTypes {
    int instVar = 234; // instance variable
    static String statStr = "India"; // static variable
    byte a; // we declared it without assign a values
    short b; // to get its default value at output
    int c;  // now make object for this every insatnce variable
    long d; // & call it to print
    float e;
    double f;
    char g;
    boolean h;

    public static void main(String[] args) {
        int loc = 456 ; // local variable
        System.out.println("Here we print local variable which is inside main method:- "+loc);
        System.out.println("we print a variable that is not in main & without creating any object by using static keyword to it:- "+statStr);
//        int q; we cannot declare variable in main without initialize a value to it...
//        System.out.println(q);

        CNC3_variableTypes instObj = new CNC3_variableTypes();
        System.out.println("We print instance variable's value by making an object for that class which contains our value:- "+instObj.instVar);
        System.out.println(" ");

        System.out.println("Below we print default values of every data types:- ");
        System.out.println("Its a default value of byte:- "+instObj.a);
        System.out.println("Its a default value of short:- "+instObj.b);
        System.out.println("Its a default value of int:- "+instObj.c);
        System.out.println("Its a default value of long:- "+instObj.d);
        System.out.println("Its a default value of float:- "+instObj.e);
        System.out.println("Its a default value of double:- "+instObj.f);
        System.out.println("Its a default value of char:- "+instObj.g);
        System.out.println("Its a default value of boolean:- "+instObj.h);

    }
}
