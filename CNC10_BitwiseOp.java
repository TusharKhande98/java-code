class CNC10_BitwiseOp {
    public static void main(String[] args) {
    // 1. Arithmatic Operator
        int x,y,a,s,m,d,r;
        x=16;
        y=3;
        a=x+y;
        s=x-y;
        m=x*y;
        d=x/y;
        r=x%y;
        System.out.println("Arithmatic Operators:---->");
        System.out.println("\tAddition is:- "+a);
        System.out.println("\tSubtraction is:- "+s);
        System.out.println("\tMultiplication is:- "+m);
        System.out.println("\tHere we get divided value without decimal:- "+d); // answer is 5.33 but in "/" division sign decimal part cannot be print only '5' we will get.
        System.out.println("\tHere we get remainder value:- "+r);

    //2. Bitwise Operator
        int p,q;
        p=11; //binary-->0000 1011
        q=22; //binary-->0001 0110
        System.out.println("\nBitwise Operator:---->");
//  Read theory part for it, to understand the calculation
        System.out.println(p&q); // both true then, o/p true(1) otherwise false(1+1=1, 0+1=0).
        System.out.println(p|q); // anyone is true then, o/p true(1) otherwise false(0+0=0, 0+1=1).
        System.out.println(p^q); // difference is true & same is false(0+1=1, 1+1=0, 0+0=0).
        System.out.println("After calculation final binary value convert to decimal & that is our answer for Bitwise Operator's\n");

    // Relational Operator
        int n,k;
        n=10;
        k=20;
        y=10;
        System.out.println("Relational operator are as below:-\n\t<\n\t<=\n\t>\n\t>=\n\t==\n\t!=");
        System.out.println(k<n);
        System.out.println(k>n);
        System.out.println(n!=k);
        System.out.println(n==y);


    }
}
