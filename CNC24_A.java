public class CNC24_A {
    public int x;  // instance variable
    public void show()
    {
        System.out.println("Value assign to 'x' is x="+x+".");
    }
}

class Ab
{
    private int x;  // now its a private class, so we can't access it from outside directly.
    private int y;
    public void set(int a, int b) // int a--> is a parameter
    {
        // value will be set in this parameter 'a'
        // then same value will assign to int 'x'
        // cauz they both are in same class, so we can do it
        x=a;
        y=b;

    }
    public void show()
    {
        System.out.println("\nValue access from private class using another function in same class is:- \n"+x+","+y);
    }
}


class Abc
{
    private int t;
    private int s;
    public void set(int t, int s)
    {
        t=t;
        s=s;

    }
    public void show()
    {
        System.out.println("\nValue access from private class using another function in same class is:- \n"+t+","+s+ "\n");
    }
}


class Abcd
{
    private int r;
    private int p;
    public void set(int r, int p)
    {
        this.r=r;
        this.p=p;

    }
    public void show()
    {
        System.out.println("\nValue access from private class using another function in same class is:- \n"+r+","+p+ "\n");
    }
}


class Abcde
{
    private int x,y;
    public Abcde(int x, int y) // Parameterized constructor
    // instead 'void set' we directly write class name
    // Now it will called as constructor
    {
        this.x=x;
        this.y=y;

    }
    public void show()
    {
        System.out.println(x);
        System.out.println(y);
        System.out.println("It called from a constructor method.");
    }
}
// Constructor:- Its name is same as class name but without any return type
// Its types:- 1.Parameterized 2.Non-Parameterized

class Abcdef
{
    public Abcdef()
    {
        System.out.println("Its a Non-parameterized constructor, which will call without creating any object");
    }
}




