public class CNC21_ArrayPart_5 {
    public static void main(String[] args) {


        System.out.println("Same previous lecture topic + little bit new concept:-\n");

        // CODE-I(A):-
        System.out.println("Code-I(A):-");
        int d[] = {10,20,30,40,50};
        int e[] = {50,60};
        d = e;
        System.out.println("Assign value of array 'e' to array 'd");
        System.out.println("Value on position-1 of array 'd' is:- "+ d[0]);
        System.out.println("Value on position-2 of array 'd' is:- "+ d[1]);
//        System.out.println("Value on position-3 of array 'd' is:- "+ d[2]); it will out of bound
        System.out.println("Garbage selectors will release the memory after this process of updating array element");
        System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");


        // CODE-I(B):-
        System.out.println("Code-I(B):-");
        int f[] = {10,20,30,40,50};
        int g[] = {50,60};
        g = f;
        System.out.println("Assign value of array 'f' to array 'g");
        System.out.println("Value on position-1 of array 'g' is:- "+ g[0]);
        System.out.println("Value on position-2 of array 'g' is:- "+ g[1]);
        System.out.println("Value on position-2 of array 'g' is:- "+ g[2]);
        System.out.println("Value on position-2 of array 'g' is:- "+ g[3]);
        System.out.println("Value on position-2 of array 'g' is:- "+ g[4]);
        System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");


        //  CODE-II:-
        System.out.println("Code-II:- Declare character type value in array:-");
        char[] ch = {'a','e','i','o','u'};
        System.out.println("Character on position-2 of array 'c' is:- " +ch[1]);
        System.out.println("Character on position-3 of array 'c' is:- " +ch[2]);
        System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");


        //  CODE-III(A):-
        System.out.println("Code-III(A):- Declare & assign value in a single line:-");
        int [] j = {10,20,30,40,50};
        System.out.println("Value on position-2 of array 'j' is:-" + j[1]);
        System.out.println("Value on position-3 of array 'j' is:-" + j[2]);


        //  CODE-III(B):-
        System.out.println("Code-III(B):- Declaration & creation of array in single line:-");
        int []a = new int[3];  // Declaration + creation
        a[0]=10;
        a[1]=20;
        a[2]=30;
        System.out.println("Value on position-2 of array 'a' is:-" + a[1]);
        System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");


        //  CODE-III(C):-  We also can declare & initialize array code in different lines
        System.out.println("Code-III(C):- We also can declare & initialize array code in different lines:-");
        int []b; // Declaration
        b = new int[5];  // creation
        b[0]=10; // this below 5 are initialization
        b[1]=20;
        b[2]=30;
        b[3]=40;
        b[4]=50;
        System.out.println("Value on position-3 of array 'b' is:-" + b[2]);
        System.out.println("Value on position-5 of array 'b' is:-" + b[4]);
       // System.out.println(b[5]); // it will give o/p  as --> array out of bound
        System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");


        //  CODE-IV:-  Using length with wrapper class
        System.out.println("Code-IV:- Using length() function with Wrapper Class:-");
        String name = "Lucifer";
        System.out.println("Length of string is:- " + name.length());
//       // length is a inbuilt & static method
        System.out.println("In array we use only just 'length' but in string we use length() function.");
        System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");

        System.out.println("Note:- We can only store--> 1)byte, 2)short, 3)int, 4)char type of values in array");
        System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");

        //  CODE-V:-  Initialize char value in int array
        System.out.println("Code-V:- Initialize char value in int array & see o/p:-");
        int m[] =  new int['a'];
        System.out.println("Length of array 'm' is:-" + m.length);
        System.out.println("Cauz here we stored char value in int type array, so it return its UNICODE value.");
        System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");


        System.out.println("Length of variable 'args' used in our second line of java code is:- " + args.length);




    }
}
