class CNC1_D{
    public void hello1()
    {
        System.out.println("Hello I'm in class D");
    }
}
class CNC1_E{
    public void hello2()
    {
        System.out.println("Hello I'm in class E");
    }
}

class CNC1_Mix { // File name should on class name which contains main method as below line.
    public static void main(String[] args){


        CNC1_D h1 = new CNC1_D(); //Here we call above class's method to print output.
        h1.hello1();
        System.out.println("");
        CNC1_E h2 = new CNC1_E();
        h2.hello2();
    }
}
