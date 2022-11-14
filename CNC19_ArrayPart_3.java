
//  LECTURE 20 IS REPEATED & COVERED HERE JUMP TO L-21

public class CNC19_ArrayPart_3 {
    public static void main(String[] args) {
        System.out.println("I. 2D or Multidimensional Array Examples:-");
        int x[][] = {{1,2,3},{4,5,6}};
        System.out.println(x[1][2]); // gives o/p as--> 6
        //System.out.println(x[1][3]); // o/p as--> array index out of bound
        // it dosen't give compile time error, but gives in runtime exception
        System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");

        // We can declare array in java by various changes in syntax as below-
        System.out.println("II. Declare array with 5 different syntax as below:-");
        int [][] a = {{10,20,30,40},{50,60,70,80}};
        System.out.println(a[1][2]);
        int [][]b = {{10,20,30,40},{50,60,70,80}};
        System.out.println(b[1][2]);
        int []c[]  = {{10,20,30,40},{50,60,70,80}};
        System.out.println(c[1][2]);
        int[] d[] = {{10,20,30,40},{50,60,70,80}};
        System.out.println(d[1][2]);
        int[] []e = {{10,20,30,40},{50,60,70,80}};
        System.out.println(e[1][2]);
        System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");



        // Printing all elements in 2-D array
        System.out.println("III. Printing all elements in 2-D array using for loop:-");
        int f[][] = {{10,20,30,40,50},{60,70,80,90,100}};
        for(int i=0; i<=1; i++)
        {
            for(int j=0; j<=4; j++)
            {
                System.out.println(f[i][j]);
            }
        }
        System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");



        // Same as above with little change in o/p
        System.out.println("IV. Printing all elements in 2-D array using for loop in different way:-");
        int m[][] = {{100,200,300,400,500},{600,700,800,900,1000}};
        for(int k=0; k<=1; k++)
        {
            for(int l=0; l<=4; l++)
            {
                System.out.print(" "+m[k][l]);
                // this will assemble o/p in horizontal line with some space
            }
            System.out.println("\n");
            // after array 1 next array 2 will print in new line
        }
        System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");


        // Same as above but here we do sum of array numbers
        System.out.println("V. Printing addition of all numbers from array:-");
        int sum = 0;
        int n[][] = {{10,20,30,40,50},{60,70,80,90,100}};
        for(int o=0; o<=1; o++)
        {
            for(int p=0; p<=4; p++)
            {
                System.out.print(" "+n[o][p]);
                sum = sum+n[o][p];
                // sum=0+10=10, sum=10+20 this will go on...
            }
            System.out.println("\n");
        }
        System.out.println("==================");
        System.out.println("Addition of all numbers in this array is:- " +sum);

        System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");



        // Same code with 2 extra row, for this we just have to change logic of row value in loop ne need to add extra loop
        System.out.println("VI. Same code as above with extra 2 rows & 1 column:-");
        int add = 0;
        int q[][] = {{10,20,30,40,50,11},{60,70,80,90,100,11},{10,20,30,40,50,11},{10,20,30,40,50,11}};
        for(int o=0; o<=3; o++)
        {
            for(int p=0; p<=5; p++)
            {
                System.out.print(" "+q[o][p]);
                add = add+q[o][p];
                // sum=0+10=10, sum=10+20 this will go on...
            }
            System.out.println("\n");
        }
        System.out.println("==================");
        System.out.println("Addition of all numbers in this array is:- " +add);

        System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");

//  LECTURE 20 IS REPEATED & COVERED HERE JUMP TO L-21

    }
}
