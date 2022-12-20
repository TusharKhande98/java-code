
// Method Overloading:- Same method with different parameters.
// Constructor Overloading:- Same constructor with different parameters.

// 1. ITS FOR METHOD OVERLOADING
class A
{
// in this 'class-a' all methods have same name but parameters are assigned in different mode
    public void show() // here we don't give any value(parameter)
    {
        System.out.println("No parameter passed here.");
    }
    public void show(int x) // here we pass an value so 1 parameter is present
    {
        System.out.println("Value of 'x' is:- "+x);
    }
    public void show(int x, int y)
    {
        int z = x+y;
        System.out.println("Sum of 'x' & 'y' is:- "+z);
    }
    public double show( double x)
    {
        // except void if we type any return method so write 'return' keyword as below to get o/p
        return x*x;
    }
}

// 2. ITS FOR NORMAL CONSTRUCTOR
class Ba
{
    private  int x,y; // variable declared - 2 integer
    private String name; //string declared - 1 string

    // we cannot access private directly so we use constructor here (we can also use method for it)
    public Ba() // its a non-parameterized constructor
    {
        x = 10;
        y = 200;
        name  = "Morningstar";
// once we create object for class-B constructor will be call, then constructor will activated & all this value will be assign to resp. var.
    }
    public void show()
    {
        System.out.println("'x' is :- "+x);
        System.out.println("'y' is :- "+y);
        System.out.println("Country name is :- "+name);
    }
}

// 3. ITS FOR MULTIPLE CONSTRUCTOR means Constructor Overloading
class Baa
{
    private  int x,y;
    private String name;
    public Baa() // its a constructor-1
    {
        x = 10;
        y = 200;
        name  = "Morningstar";
    }
    public Baa(int x) // constructor-2 with same name, but 1 parameter passed here
    {
        this.x=x;
    }
    public Baa(int x, int y) // constructor-3 with same name, but 2 parameter passed here
    {
        this.x=x;
        this.y=y;
    }
    public Baa(int x, int y, String name) // constructor-4 with same name, but 3 parameter passed here
    {
        this.x=x;
        this.y=y;
        this.name=name;
    }

    public void show()
    {
        System.out.println("'x' is :- "+x);
        System.out.println("'y' is :- "+y);
        System.out.println("Country name is :- "+name);
    }
}


public class CNC25_OOPs_Part_3 {
    public static void main(String[] args) {

        System.out.println("\t\tI. Method overloading examples\n\n");
        A obj = new A();
        System.out.println("\n1. It have no parameter");
        obj.show();
        System.out.println("\n2. We just pass single parameter so o/p is...");
        obj.show(101);
        System.out.println("\n3. If we pass two parameter then it will call a method in which we set addition function");
        obj.show(129, 71);
        System.out.println("\n4. If we give double type value then we get its square, as it set in function");
        System.out.println(obj.show(7.0));
        // we set double & write 'return', thats why we need to write print statement separately
        System.out.println("\n*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#\n");

        System.out.println("\t\tII. Constructor example\n\n");
        Ba ob = new Ba();
        // by doing this constructor will call directly.
        // but to show it on screen we write 'show()' method & create object for class-Ba
        ob.show();
        System.out.println("\n*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#\n");

        System.out.println("\t\tIII. Constructor overloading example (with 1 parameter)\n\n");
    // below line is for normal constructor for class-Baa similar as above
        Baa normconst = new Baa();
        normconst.show();
    // below line is for constructor overloading for same class-Baa
        Baa conoverload = new Baa(11); // object should be with a different name
    // by assign 11 in this, it will set 'private in t x=11' in above class
    // same value x will assign to 'this' keyword's 'x'
    // & remaining 'y=0' & 'name=null' will be shown by default cauz we dosen't set anything for that.
        conoverload.show();

        System.out.println("\n*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#\n");

        System.out.println("\t\tIII. Constructor overloading example (with 2 parameter)\n\n");

        Baa conover2 = new Baa(12,13);
        conover2.show();
        // here we pass 2 values so constructor of two parameter's block will execute
        // & value are set to 'x' & 'y' then 'name=null'
        // default values for 'int = 0' & 'string = null'

        System.out.println("\n*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#\n");

        System.out.println("\t\tIII. Constructor overloading example (with 3 parameter)\n\n");

        Baa conover3 = new Baa(12,13, "Bharatvarsh");
        conover3.show();

        System.out.println("\n*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#\n");

        System.out.println("Q.- Difference between Method overloading & Constructor overloading");
        System.out.println("A.- In method overloading we need to create just 1 object.\n\tBut in  constructor overloading we need to create separate objects for every different function call.");

    }
}
