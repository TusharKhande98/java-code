class CNC_B {
    public static void hello1()
    {
        // In this function we just add an printing msg
        System.out.println("Hello I am in class 'CNC23 B', \nand both classes are present in a single file/code...");
    }
}


//  Here both classes are in single code, & which code have 'main function' file name will be set on that same name
class C
{
//    normally we can create instance variable as belo
//        int x,y,z;
//    But while passing variable in a parameter we need to declare it individually as below
    public void hello2(int w, int x, int y)
    {
        // In this function we just set an arithmetic operation
        int z=w+x+y;
        System.out.println("\nHere we have w="+w+", x="+x+", y="+y);
        System.out.println("Sum of w+x+y is =:- "+z);
    }
}

class D
{
    public void hello3(float x, float y)
    {
        // In this function we create a formula to calculate percentage by inputting total & obtain marks
        float z=(x*100)/y;
        System.out.println("\nHere we have x="+x+", y="+y);
        System.out.println("Your obtain marks is "+x+ " & total marks are "+y+" so your percentage is:- "+z);
    }
}

class E
{
    public void addition(int x, int y)
    {

        int z=x+y;
        System.out.println("Addition of "+x+" & "+ y+" is:- "+z);
    }
    public void multiplication(int x, int y, int w)
    {

        int z=x*y*w;
        System.out.println("Multiplication of "+x+", "+ y+" & "+w+" is:- "+z);
    }
    public void subtraction(int x, int y)
    {

        int z=x-y;
        System.out.println("Subtraction of "+x+" & "+ y+" is:- "+z);
    }
    public void division(int x, int y)
    {

        int z=x/y;
        System.out.println("Division of "+x+" by "+ y+" is:- "+z);
    }
}

class F
{
    public int addBro(int x, int y)
    {
        System.out.println("As we know 'VOID' is a type which dosen't return anything.\nBut if we type 'INT' instead of 'VOID' so it return integer value, see syntax as above & below line in this code");
        return x+y;
    }
}
class G
{
    public double subtractBro(double x, double y)
    {
        System.out.println("\nAs we know 'VOID' is a type which dosen't return anything.\nBut if we type 'DOUBLE' instead of 'VOID' so it return integer value, see syntax as above & below line in this code");
        return x-y;
    }
}

class H
{
    public String show(String name)
    {
        return name;
    }
}

class I
{
    public void loop1()
    {
        for (int i = 1; i <= 3 ; i++)
        {
            System.out.println("For loop: "+i);
        }
    }
    public void loop2()
    {
        int x;
        x=1;
        while (x<=5)
        {
            System.out.println("While loop: "+x);
            x++;
        }
    }
    public void loop3()
    {
        int x;
        x=1;
        do
        {
            System.out.println("Do-while loop: "+x);
            x++;
        }
        while (x<=3);
    }
    public void Arr1()
    {
        int x[] = {10,20,30,40,50};
        System.out.println("Length of array is:- "+ x.length);
    }

}





public class CNC23_OOPs_Part_1_code2 {
    public static void main(String[] args) {

        CNC_B obj2 = new CNC_B();
        obj2.hello1();
        System.out.println("\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

        C objSum = new C();
  // now we have 2 variables in function which we call, so pass 2 values in our below function
        objSum.hello2(10,20,30); // value will be assign to var automatically
        System.out.println("\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");


        D marks = new D();
        marks.hello3(357,600);
        marks.hello3(350,600);
        marks.hello3(384,600);
        marks.hello3(324,600);
        System.out.println("\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");


        E operation = new E();
        operation.addition(100,1999);
        operation.subtraction(100,50);
        operation.multiplication(25,6,2);
        operation.division(2848,8);

        System.out.println("\nWe can also create different object for same class, there is no difference in output.\n");

        E mult = new E();
        E add = new E();
        E subt = new E();
        mult.multiplication(2,4,6);
        add.addition(45,55);
        subt.subtraction(1000,750);
        System.out.println("\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");


        F getReturnInt = new F();
        G getReturnDouble = new G();
        System.out.println("Addition is:- "+getReturnInt.addBro(2,3));
        System.out.println("Subtraction is:- "+getReturnDouble.subtractBro(20.2,3.5));
        System.out.println("\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");


        H strname = new H();
        System.out.println("Your string is:- "+strname.show("Lucifer Morningstar"));

        System.out.println("\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

        System.out.println("Now 'class I' have 4 methods, so make 4 objects for it");

        I objfour = new I();
        objfour.loop1();
        objfour.loop2();
        objfour.loop3();
        System.out.println("Repeat loop-3 again");
        objfour.loop3(); // we call it 2 times, so it display twice in o/p.
        objfour.Arr1();
        objfour.Arr1();



    }
}
