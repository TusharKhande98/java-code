public class CNC22_JaggedArray {
    public static void main(String[] args) {


        // Jagged array is called as array of array, below are example
        System.out.println("CODE-I(A):- Example of jagged array");
        int a[][][] = {{{10,20,30,40,50}},{{11,12,13},{45,46}},{{47,48,49,50}}};
        System.out.println("int a[][][] = {{{10,20,30,40,50}},{{11,12,13},{45,46}},{{47,48,49,50}}};");
        System.out.println("Length of this Jagged array 'a' is:- " + a.length);
        System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");


        System.out.println("CODE-I(B):- Example of jagged array with another syntax");
        int b[][][] = {
                        {{10,20,30,40,50}},
                        {{11,12,13},{45,46}},
                        {{47,48,49,50}}
                      };
        // below lines we write to print in o/p statement to understand execution of code with its o/p.
        System.out.println("int b[][][] = {\n" +
                "                        {{10,20,30,40,50}},\n" +
                "                        {{11,12,13},{45,46}},\n" +
                "                        {{47,48,49,50}}\n" +
                "                      };\n" +
                "        ");
        System.out.println("Length of this Jagged array 'b' is:- " + b.length);
        System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");



        System.out.println("CODE-I(C):- Find length of a single array in jagged array");
        int c[][][] = {
                        {{10,20,30,40,50}},
                        {{11,12,13},{45,46}},
                        {{47,48,49,50}}
                    };
        System.out.println("Length of 0th position array in Jagged array 'c' is:- " + c[0].length);
        System.out.println("Length of 1st position array in Jagged array 'c' is:- " + c[1].length);
        System.out.println("Length of 2nd position array in Jagged array 'c' is:- " + c[2].length);
        System.out.println("Length of 0th position array in Jagged array's 0th position 'c' is:- " + c[0][0].length);
        System.out.println("Length of 0th position array in Jagged array's 1st position 'c' is:- " + c[1][0].length);
        System.out.println("Length of 1st position array in Jagged array's 1st position 'c' is:- " + c[1][1].length);
        System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");

        System.out.println("NOTE:- to learn it deeply read theory concept from book");
        System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");

        System.out.println(c);
        System.out.println("This above o/p just explain that contents stored in var 'c' is.. \n[[[=3-D array, I=integer datta stored, @=hex value from system  \nwhich means some integer values are stored in a 3-dimensional array.\n");

        System.out.println("Similarly below example contains 2-D array");
        System.out.println(c[0]);
        System.out.println(" ");

        System.out.println("Again now below example contains 1-D array");
        System.out.println(c[0][0]);
        System.out.println(" ");

        System.out.println("Now below example shows value stored in a particular array");
        System.out.println(c[0][0][0]);
        System.out.println(c[2][0][3]);
        System.out.println(c[1][1][1]);
        System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");


        // CODE-II:-
        System.out.println("CODE-II:- How to print all values from array in a 3- Dimensional array");
        int d[][][] = {
                        {{10,20,30,40,50}},
                        {{11,12,13},{45,46}},
                        {{47,48,49,50}}
                      };

                    for(int i=0; i<d.length; i++)
                    {
                        for(int j=0; j<d[i].length; j++)
                        {
                            for(int k=0; k<d[i][j].length; k++)
                            {
                                System.out.print(" " + d[i][j][k]);
                            }
                            System.out.println("\n");
                        }
                    }





    }
}
