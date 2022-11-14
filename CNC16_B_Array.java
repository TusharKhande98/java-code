import java.util.Scanner;

class CNC16_B_ArrayPart_1 {
    public static void main(String[] args) {


        System.out.println("1-D ARRAY EXAMPLES");
    // CODE-I(A):- printing array values
        int x[]={10,20,30};
        System.out.println("Below values from array are printed with a separate printing syntax");
        System.out.println("\t"+x[2]);
        System.out.println("\t"+x[0]);
        System.out.println("\t"+x[1]);

    // CODE-I(B):- Syntax-1 to declare array.
        //int c[]= new int[] {10,20,30};
    // CODE-I(C):- Syntax-2 to declare array when we take user input.
        //int d[]= new int[size];

        // CODE-II:- printing array values with for loop
        int a[]={10,20,30,40,50};
        System.out.println("Below values from array are printed by using for loop");
        for (int i=0;i<=4;i++)
        {
            System.out.println("\t"+a[i]);
        }

    // CODE-III:- printing values & its sum using for loop
        int b[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Printing value & its sum from array by for loop");
        int sum=0;
        for (int w=0;w<=9;w++)
        {
            System.out.println("\t"+b[w]);
            sum= sum+b[w];
        }
        System.out.println("Sum is:- "+sum);


    // CODE-IV:- Taking array values from user input.
        System.out.println("\n1-D DYNAMIC ARRAY EXAMPLES");
        Scanner so = new Scanner(System.in);
        int size; // declareation of size for array
        System.out.println("Enter size of array:- ");
        size = so.nextInt(); // inputted size stored in memory
        int e[] = new int[size]; // input size=5 then 5 cell will created
        System.out.println("Enter "+size+" values"); //size=5 so below loop also run 5 times

        for (int i=0;i<size;i++)
        { // we use this for loop to store inputted data on diiferent location of cells(on diff. position of 'x').
            e[i]=so.nextInt(); // for i=0 first inputted value stored for i=4 last inputted value by user will stored on x[i] i.e. on cell x[4]
        }
        System.out.println("Entered values are as below:- ");
        int add=0;

        for (int i=0;i<size;i++) // with this loop values will be displayed
        {
            System.out.println("\t"+e[i]); // it prints values
            add= add+e[i]; // it prints addition
        }
        System.out.println("Sum is:- "+add);

    // CODE-V:- 2-D array
        System.out.println("\n2-D ARRAY EXAMPLES");
        int f[][] = {{10,20,30,40,50}, {60,70,80,90,100}};
        System.out.println("Here f[1][2] means in array 'f' which number is presents in 2nd column of 1st row:- "+f[1][2]);
        System.out.println("So f[0][4] means 0 represents row & 4 represents column:- "+f[0][4]);

    // CODE-VI:- 2-D array with for loop
        System.out.println("\nPrinting 2-D array using for loop");
        int g[][] = {{11,21,31,41,51},{61,71,81,91,101}};
        for(int i=0;i<=1;i++) // this is for row--> we have row 0 & 1 only (2 Rows)
        { //this loop run single time below 4 (this happen 2 times in this codes) when i=2<-- false loop terminate & value will print
            for (int j=0;j<=4;j++) // this is for column--> we have column 0,1,2,3,4 (5 Columns)
            { // this loop run 4 times until row condition not false.
                System.out.println(g[i][j]);
            }
        } // here we get output in different lines thats not good

    // CODE-VII:- 2-D copy of above loop with proper output
        System.out.println("\nPrinting proper output for same code as above.\n2-D array will be called as a Multidimensional Array");
        int k[][] = {{11,21,31,41,51},{61,71,81,91,101}};
        int addition;
        addition=0;
        for(int i=0;i<=1;i++)
        {
            for (int j=0;j<=4;j++)
            {
                System.out.print(" "+k[i][j]); // we remove 'ln' from 'println' in this line & add 1 space.
                addition = addition+k[i][j]; // it performs addition
            } // whenever number is print 1 space will be added to output.
            System.out.println("\n"); // after inner for loop new external loop will be prints in a new line by adding this line.
        }
        System.out.println("=====================");
        System.out.println("sum is:- "+addition); // sum is print here after calculationg in a loop


        // CODE-VIII:- 3-D array same of above with little change
        System.out.println("\nPrinting 3-D Array, with little change in above code");
        int l[][] = {{10,20,30,40,50},{60,70,80,90,100},{11,12,13,14,15}};
        int add_sum;
        add_sum=0;
        for(int i=0;i<=2;i++)  // here only row value is changed.
        {
            for (int j=0;j<=4;j++)
            {
                System.out.print(" "+l[i][j]);
                add_sum = add_sum+l[i][j]; // it performs addition
            }
            System.out.println("\n");
        }
        System.out.println("=====================");
        System.out.println("sum is:- "+add_sum);


        // CODE-IX:- 3-D array same of above with little change in column
        System.out.println("\nPrinting 3-D Array, with little change in above code");
        int m[][] = {{10,20,30,40,50,51},{60,70,80,90,100,52},{11,12,13,14,15,53}};
        int ad_sum;
        ad_sum=0;
        for(int i=0;i<=2;i++)  // here only row value is changed.
        {
            for (int j=0;j<=5;j++) // column vallue also change.
            {
                System.out.print(" "+m[i][j]);
                ad_sum = ad_sum+m[i][j]; // it performs addition
            }
            System.out.println("\n");
        }
        System.out.println("=====================");
        System.out.println("sum is:- "+ad_sum);


    }
}
