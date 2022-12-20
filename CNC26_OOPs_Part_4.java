
// I - SINGLE LEVEL INHERITANCE
  // 1. Here we use parent class properties from child
class Aa
{
    public  int i,j; // declare i,j
    public void showij() // create method to show it
    {
        System.out.println("Value of 'i' is:- "+i); // when method call
        System.out.println("Value of 'j' is:- "+j); // it will print values
    }
}
class Bb extends Aa // extends means it will get property from class 'Aa' & give it to 'class Bb'.
// now here Aa is parent & Bb is child class
{
    public int k;
    public void showk() // method-1 in class Bb
    {
        System.out.println("Value of 'k' is:- "+k);
    }
    public void sum() // method-2 in class Bb
    {
        int  s = i+j+k;
    // value of 'k' declare in this sub-class but value of 'i&j' will import from above super-class
        System.out.println("Sum of i,j,k is:- "+s);
    }
}

  // 2. Here we use parent class's private properties from child by replacing private with protected keyword
class PrivateAb
{
    // private int a, b;  // we cannot use private variable directly even its child class also cant use it.
    protected int a,b;  //  instead private we use protected keyword so child class can use parents protected variables
    public void showab()
    {
        System.out.println(a);
        System.out.println(b);
    }
}

class Bp extends PrivateAb
{
    public int c;
    public void showc()
    {
        System.out.println(c);
    }
    public void sum()
    {
        int s = a+b+c;
        System.out.println("Sum is:- "+s);
    }
}
  // 3. Here we use parent class's privat properties from child by creating method
  class MethodThis
  {
      private  int a, b; // we cant give value directly to it
      public void setab(int a, int b)  // so we create this method
      {
          this.a=a;
          this.b=b;
      }
      public int geta()  // and get by calling this method
      {
          return a;
      }
      public int getb()
      {
          return b;
      }

      public void showab()
      {
          System.out.println(a);
          System.out.println(b);
      }
  }

  class MethodAccess extends MethodThis
  {
      public int c;
      public void showc()
      {
          System.out.println(c);
      }
      public void sum()
      {
          // we cant access private so we called method for addition too as below
          int s = geta()+getb()+c;
          System.out.println("Sum is:- "+s);
      }
  }


//  II - MULTI-LEVEL INHERITANCE
  // 1. CLASS B IS CHILD OF A--> CLASS C IS CHILD OF B

class InheritA
{
    public int x;
    public  void  showx()
    {
        System.out.println(x);
    }
}

class InheritB extends InheritA
  {
      public int y;
      public  void  showy()
      {
          System.out.println(y);
      }
  }

class InheritC extends InheritB
  {
      public int z;
      public  void  showz()
      {
          System.out.println(z);
      }
  }

class InheritD extends InheritC
  {
      public  void sum()
      {
          int s =x+y+z;
          System.out.println("SUm is:- "+s);
      }

  }


  // 2. Multi-level inheritance with private variable

  class InheritAa
  {
      private int x;
      public void setx(int x)
      {
          this.x=x;
      }
      public int getx()
      {
          return x;
      }
      public void showx()
      {
          System.out.println(x);
      }
  }

  class InheritBb extends InheritAa
  {
      private int y;
      public void sety(int y)
      {
          this.y=y;
      }
      public int gety()
      {
          return y;
      }
      public void showy()
      {
          System.out.println(y);
      }
  }

  class InheritCc extends InheritBb
  {
      public  void mult()
      {
          int mul =getx()+gety();
          System.out.println("Multiplication is "+getx()+" x "+gety() + " = "+mul);
      }
  }


//  III - HIERERCHICAL INHERITANCE
    // 1.


  class HrA
//final class HrA
      // IF WE WANT TO STOP INHERIT THEN USE THIS 'FINAL' KEYWORD in class
  {
      // public final void show(int x, int y)
      // IF WE WANT TO STOP method overriding THEN USE THIS 'FINAL' KEYWORD in method
      // final int x=10;
      // IF WE WANT A FIX VALUE OF A VARIABLE THEN USE 'FINAL' BEFORE IT
      public void show(int x, int y)
      {
          int z = x+y;
          System.out.println("\tSum is:- "+z);
      }
  }
  class HrB extends  HrA // class-B has parent-A
  {
      public  void  show(int x, int y)
      {
          int z = x-y;
          System.out.println("\tSubtraction is:- "+z);
      }
  }
  class HrC extends  HrA // class-C has parent-A
  {
      public  void  show(int x, int y)
      {
          int z = x*y;
          System.out.println("\tMultiplication is:- "+z);
      }
  }
  class HrD extends  HrA // every child class has a same parent class
  // method is also same in every class-->show
  // parameter also same---> int x, int y
  // we called it a Method Overriding--> same method with same parameter
  {
      public  void  show(int x, int y)
      {
          int z = x/y;
          System.out.println("\tDivision is:- "+z);
      }
  }
  // Now here every child has same parent b
  // But every child are not connect to each other they are directly link to class-A



  public class CNC26_OOPs_Part_4 {
    public static void main(String[] args) {

        System.out.println("\nAdvantage of 'Inheritance' is for reusability of code,\nSuppose a variable 'int x' is declare in super class so it will be access in sub class too without creating it.\n");
        System.out.println("1. Parent class also called as base class or subclass");
        System.out.println("2. Child class also called as sub class or derived class");
        System.out.println("3. Child can access the properties of parent class. But,\n\tParent class cannot access the properties of child class.");
        System.out.println("4. With the help of 'child object' we can access the parent property. But,\n\tWith the help of 'parent object' we cannot access the child property\n");

        System.out.println("Inheritance have a 4 types:-\n\t1. Single Inheritance-->\n\t\tIt have 1 parent class & 1 child class\n\t2. Multilevel Inheritance-->\n\t\tIt have chain of parent & child one by one as (A->B->C->D, where B is child of A & C is child of B also C is parent of D).\n\t3. Hiererchical-->\n\t\tIt have 1 parent class & multiple child class of that 1 parent.\n\t4. Multilple Inheritance-->\n\t\tIt have multiple parent class & 1 child class of that 2 parent class.");
        System.out.println("\n*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*\n");



        System.out.println("* I - SINGLE LEVEL INHERITANCE *");
        System.out.println("\t 1. Here we create object for child class-Bb so it can also access parent class-Aa contents");
        Bb obj = new Bb();
        obj.i=10;
        obj.j=20;
        obj.showij();
        obj.k=30;
        obj.showk();
        obj.sum();
        System.out.println("\n*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*\n");

        System.out.println("\t 2. Use 'protected' keyword instead of 'private' to give access of non-public variable to its child\n");
        Bp objpro = new Bp();
        objpro.a=100;
        objpro.b=200;
        objpro.showab();
        objpro.c=300;
        objpro.showc();
        objpro.sum();
        System.out.println("\n*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*\n");

        System.out.println("\t 3. Here we use parent class's private properties from child by creating method 'get set'\n");
        MethodAccess objmethod = new MethodAccess();
        objmethod.setab(10,20 ); // this value will goes to set method then this keyword then assign it to private int a,b
        objmethod.showab();
        objmethod.c=30;
        objmethod.showc();
        objmethod.sum();
        System.out.println("\n*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*\n");



        System.out.println("* II - MULTI-LEVEL INHERITANCE *");
        System.out.println("\t 1. In multilevel 'D' is child of 'C','C' is child of 'B',...'B' is child of 'A'.\n\tSo we create object for class-D directly & it will access all properties from above 3 parent class");

        InheritD objD = new InheritD();
        objD.x=10;
        objD.y=20;
        objD.z=30;
        objD.showx();
        objD.showy();
        objD.showz();
        objD.sum();
        System.out.println("\n*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*\n");

        System.out.println("\t 2. Here we make our variable as 'private' in multilevel inheritance.. see how to execute it by creating methods as--> get,set   ");
        InheritCc objP = new InheritCc();
        objP.setx(10);
        objP.sety(20);
        objP.showx();
        objP.showy();
        objP.mult();
        System.out.println("\n*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*\n");


        System.out.println("* III - HIERERCHICAL INHERITANCE *");
        System.out.println("\t 1. In this method(show) & parameter(int x, int y) is same.\n\t\tSame method name with same parameter are called as 'Method Overloading'");
        System.out.println("\t\tNow here every child has same parent...\n\t\tBut every child are not connect to each other they are directly link to class-A");
        // create object for class-B
        HrB objHrB = new HrB();
        HrC objHrC = new HrC();
        HrD objHrD = new HrD();
        HrA objHrA = new HrA();
        System.out.println("\nHere class-B extends class-A, but method name is same\nIf we crete an object for class-B then it will gives only output from class-B it dosen't give o/p from class-A");
        System.out.println("And if we change method name to 'show1' & 'show 2' then we can get different method call with same single object as above.");
        objHrB.show(30,20);
        objHrB.show(40,20);
        System.out.println("\nNow we had created separate objects for all class ");
        objHrC.show(40,20);
        objHrD.show(40,20);
        objHrA.show(40,20);
        System.out.println("\n-------------------------\n");

        System.out.println("\t 2. Same above code we can write with little update");
        System.out.println("Example of Polymorphism:- when a single thing have many form.\n this will possible only  when we have hierirchy inheritance(1 parent multiple child)");
        HrA newupd;
        // here A is superclass which is a user defined datatype(non-primitive)
        // whenever an class name is used as datatype so in this condition object is stored in it
        // now 'newupd' is a variable that we create in super class-A is used for class-B,C,D objects

        newupd = objHrA;
        newupd.show(10,20);
        newupd = objHrB;
        newupd.show(40,20);
        newupd = objHrC;
        newupd.show(10,20);
        newupd = objHrD;
        newupd.show(10,20);
        System.out.println("For example if some hacker try to hack system so he will get all same source code(all method calling lines are same) but only we knew that it which line perform which kind of operation.\nWhich makes our code secure & it called as 'Polymorphism'. that's why it benefited for security purpose");
        System.out.println("Above code is a example of--> Method overloading + Polymorphism");

        System.out.println("\n-------------------------\n");

        System.out.println("\t 3. Again above code with little update and make it short by array");

        // here use class name as datatype [HrA],
        // create variable [vzr]
        // & create object inside array for every class
        // then stored all objects in array variable [vzr]

        HrA vzr[] = {new HrA(),new HrB(),new HrC(),new HrD()};

        for (HrA rp:vzr) // value of 'vzr' are stored to 'rp'
        {
            rp.show(10,20);
        }
        // here class-A value are in [vzr] then after loop it goes to [rp] then print its operation
        // after 1 loop class-B value are in [vzr] then after loop it goes to [rp] then print its operation

        System.out.println("\t\t *-Facts about 'Final' keyword-*" );
        System.out.println("1. IF WE WANT TO STOP INHERIT THEN USE THIS 'FINAL' KEYWORD in class.");
        System.out.println("2. IF WE WANT TO STOP method overriding THEN USE THIS 'FINAL' KEYWORD in method.");
        System.out.println("3. IF WE WANT A FIX VALUE OF A VARIABLE THEN USE 'FINAL' BEFORE IT \n\t'final int x=10;'");


    }
}
