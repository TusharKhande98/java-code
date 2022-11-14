class CNC1_A { // In JAVA code class name & file name should have to be same
    public static void main(String[] args){


        System.out.println("\nIn this code we get o/p statement, but that o/p are written in another external file,\nfor which we create an object in this file using that class's name & after running this file we will get that o/p.\n");

        CNC1_B h1 = new CNC1_B();
        System.out.println("\tHere 'CNC1_B' class file's o/p has shown.");
        // Here we create object as 'h1', to call it from another class-B, which is outside of this file, remember syntax.
        h1.hello1();  // With object name we call class-B's method, to get its output.
        System.out.println("");

        CNC1_C h2 = new CNC1_C(); // same as above 2 lines we create object for another class..
        System.out.println("\tHere 'CNC1_C' class file's o/p has shown.");
        h2.hello2();
    }

}

