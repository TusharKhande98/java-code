public class CNC15_A_Fibonacci {
    public static void main(String[] args) {
        System.out.println("READ THEORY PART TO UNDERSTAND IT");

// CODE-I:- Fibonacci Series
        int n1=0,n2=1,n3;
        System.out.println(n1); // fib. first no. will print here i.e. =0
        System.out.println(n2); // fib. second no. will print here i.e. =1
        for (int c=1;c<=10;c++)
        {
            n3=n1+n2;
            System.out.println(n3);  // fib. third no. will print here i.e.0+1=1
            n1=n2; // value will update every time.
            n2=n3; // after print previous n3.

        }

    }
}
