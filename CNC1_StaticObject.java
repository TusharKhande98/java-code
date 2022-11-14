class Stat{
    public static void hello_stat() // here we use 'static', reason mention below.
    {
        System.out.println("You call me from another class by not creating object, but by using 'static' keyword in that class");
    }
}

class  CNC1_StaticObject{
    public static void main(String[] args){
// We can call a method from another class without creating any object by using 'static' keyword.
        Stat.hello_stat(); // write class name & call method directly as on LHS.

    }
}

