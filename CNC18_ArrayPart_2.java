public class CNC18_ArrayPart_2 {
    public static void main(String[] args) {

    // CODE-1:- ways to write array syntax.
        int a; // Declaration
        a = 10;  // Initialization
        System.out.println("Value stored in variable 'a' is:- "+a);
        System.out.println(" ");

    // CODE-2:- Below syntax is incorrect for array declaration.
     /*   int b[];
        b = {101, 102, 103, 104, 105};
        System.out.println(b);  */

    // CODE-3:- dynamic array declaration(we can give a fix size to array)
        int[] c = new int[5];
        System.out.println("size declared for array is:- "+c.length);
        System.out.println(" ");

    // CODE-4:- we get error if we give size of float or negative in int data type in array.
      /*  int d[] = new int[5.5];  // float value
        int e[] = new int[-5];     // negative value
        System.out.println(d.length);
        System.out.println(e.length);    */

     // CODE-5:- we stored char value in int & get o/p of its ASCII value.
        int[] f = new int['a'];
        System.out.println("we give char value in int declaration, So array size of 'f' is:- "+f.length);
        System.out.println(" ");

    // CODE-5(A):-  Here we stored double value in int data types & get error.
      /*  double g =10.5; // stored value is in double
        int h=g; // then we stored it in int
        System.out.println(h);   // double > int===> typecast not possible get error. */

    // CODE-5(B):- Here we stored int value in double data types & get o/p by auto-typecast by compiler.
        int i =10; // stored value is in int
        double j=i; // then we stored it in double
        System.out.println("Double < int, So typecast is possible our value is '10' & value we get is:- "+j);   // double < int===> typecast possible get o/p
        System.out.println(" ");

    // CODE-5(C):- Same CODE-5(A) will give o/p here by doing explicit typecast(manual/forced conversion) which may losses data.
        int k = (int) 10.5;
        System.out.println("By doing explicit typecast we get our output with data change/loss original value is '10.5' & value we get is:- "+k);
        System.out.println(" ");

    // CODE-6(A):- example of typecast
       /* int l = 130;  get error cauz int > byte
        byte m=l;       so we cant store it as this in small data type
        System.out.println(m);  */

    // CODE-6(B):- above code will run by doing manual explicit typecast
        int n =130;
        byte o = (byte) n;
        System.out.println("We get value of 'int' in 'byte' with data loss, original value is '130' & we get is "+o);
        System.out.println(" ");

    // CODE-7:- now as CODE-4 we get same error for array but it can be fix by same typecast.
        /* int []p = new int[10.5]; <--- get error here
        System.out.println(p.length);   so do as below */

        int []p = new int[(int)10.5]; // now get o/p by doing simple typecast
        System.out.println("By typecast we get array length with data loss from '10.5' to---> "+p.length);
        System.out.println(" ");

    // CODE-8:- Same code as above--> byte value stored in int   byte < int
        byte r = 10;
        int []q = new int[r]; //  typecast automatic
        System.out.println("Typecast is done by compiler here automatically cauz, byte<int so array size is:---> "+q.length);
        System.out.println(" ");

    // CODE-9:- We declare low digit value but in 'long' type & stored it in 'int' type.
        long s = 20;
        int []t = new int[(int)s];
        System.out.println("value 20 is less but its in 'long type' still we need to typecast it otherwise we get error, so array size is:---> "+t.length);
        System.out.println(" ");

    // CODE-10:- Maximum size od array.
        System.out.println("Among 1)byte 2)short 3)int 4)long 'int' is greater, so its a maximum size, but it only gives o/p in super computer, normal hardware don't have that much space to allocate memory \nIt exceeds virtual Machine limit.");
        // int []u = new int[2147483647];
       // System.out.println(u);
        System.out.println(" ");


    // CODE-11:- example of array declaration in different data types as below.
        double []v = {10.23, 53.77};
        System.out.println("we stored 'double' data types value in 'array-v'");
        System.out.println("Element present on no-1 in 'array-v' is:- "+v[1]);
        System.out.println(" ");

        char []w = {'a','b','c','d','e','f'};
        System.out.println("we stored 'char' data types value in 'array-w'");
        System.out.println("Element present on no-3 in 'array-w' is:- "+w[3]);









    }
}
