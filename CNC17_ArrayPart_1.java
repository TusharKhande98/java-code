public class CNC17_ArrayPart_1 {
    public static void main(String[] args) {

    // CODE-I-(A):- Gives Output
        int a; // Declaration
        a = 12345; // Initialization
        System.out.println("Value of int 'a' is:- "+a);
        System.out.println(" ");

    // CODE-I-(B):- Gives Error
    /*    int b[];
        b = {10,20,30,40,50};
        System.out.println(b[0]);
    Its not a correct way of Array declaration
     */

    // CODE-I-(C):- correct way to declare array
        int c[] = {101,201,301,401,501};
        System.out.println("correct way to declare array is as below: \nint c[] = {101,201,301,401,501};");
        System.out.println("0'th position value in array 'c' is:- "+c[0]);
         System.out.println(" ");


    // CODE-I-(D):- Declaration of array with size & find its length
        int d[] = new int[5];
        System.out.println("way to declare array with its size is as below: \nint d[] = new int[5];");
        System.out.println("Here we used 'd.length' function to print array size as:- "+d.length);
        System.out.println(" ");

    // CODE- II:- different syntax used in array

        int e[]= {10,20,30,40,50};
        System.out.println(e[0]);
        int [] f= {10,20,30,40,50};
        System.out.println(f[1]);
        int []g= {10,20,30,40,50};
        System.out.println(g[2]);
        System.out.println("Value stored or length of the array is:- "+ g.length); // it gives length of array
        System.out.println("if we type only variables name i.e. 'x' so we get weird value which explain array property as:- "+g);
        System.out.println(" ");

    // CODE- III:- how to store one array in another & find its length

        int h[]= {10,20,30,40,50};
        int []i= {60,70,80};
        System.out.println("Length of h is:- "+h.length);
        System.out.println("Length of i is:- "+i.length);
        h=i;
        System.out.println("after store 'i' in 'h' length of h is:- "+h.length);
        i=h;
        System.out.println("after store 'i' in 'i' length of h is:- "+h.length);

        int j[]= {10,20,30,40,50};
        int []k= {60,70,80};
        k=j;
        System.out.println("The value of array 'j' is stored in 'k' so updated array values of 'k' are:- ");
        System.out.println(k[0]);
        System.out.println(k[1]);
        System.out.println(k[2]);
        System.out.println(" ");

    // CODE- IV:- how to allocate a memory or give size to a array (we called it dynamic array)

        int l[] = new int[5]; // after giving size we have to store exact same size in array, otherwise we get error.
        System.out.println(l[0]);
        System.out.println(l[1]);
        System.out.println(l[2]);
        System.out.println(l[3]);
        System.out.println(l[4]);
        System.out.println("It prints 'zero' cauz we hadn't store any value in it");
        System.out.println(" ");

    // CODE-V:- how to move array in another variable by Inhance for loop.

        int sum = 0;
        int []m = {101,102,103,104,105};
        for (int n:m) // syntax of enhance for loop
        {
            System.out.println(n);  // we can't write 'n' directly in other method, its just possible only in inhance loop
            sum = sum+n;
        } // values will be stored on by one in 'n' when value ends it will print output
        System.out.println("Addition  of all nos. in array is: "+sum);
        System.out.println(" ");

    // CODE-VI:- print arrays values with a for loop.
        System.out.println("Printing values using for loop");
        int p[] = {11,12,13,14,15,16,17,18,19,20};
        for (int q=0; q<=10; q++)
        {
        //    System.out.println(p[q]);
        }
        System.out.println(" ");

        System.out.println("Values are declared as double:-");
        double r[] = {10.20, 20, 102f, 'a', 40, 4.89};
        for (int s=0; s<=4; s++)
        {
            System.out.println(r[s]);
        }
        System.out.println(" ");

////  FROM ABOVE 2 RUN ONLY 1 AT A TIME, UNKNOWN ERROR FOUND SOLVE IT LATER.







    }
}
