import java.util.Scanner;

public class CNC15_B_Sum_And_RevOfNos {
    public static void main(String[] args) {

// CODE-I:- make sum of digits which inputted by user.
        Scanner so = new Scanner(System.in);
        int n,r,sum=0;
        System.out.println("Enter any digit:- ");
        n=so.nextInt(); // inputted digit will stored in 'n'. (n=423).
        while (n!=0) // cond. true then below while loop run. (423!=0).
        {
            // * mod[%] is a remainder of any division *
            // * division[/] dosen't give decimal value, not a float eg-423/10=42 *
            r=n%10; // (423%10=3) then (42%10=2) then (4%10=4)
            sum = sum + r; //(sum=0+3=3) then (3+2=5) then (5+4=9)
            n = n/10; // (423/10=42) then (42/10=4) then (4%10=0)
        } //now n=42 again loop will repeat & check condition from start, n=0 cond. false & print sum in output.
        System.out.println("Sum is:- "+sum);


    // CODE-II:- Make no reverse.
        Scanner re = new Scanner(System.in);
        int m,s,rev=0;
        System.out.println("Enter any digit:- ");
        m=re.nextInt(); //423
        while (m!=0)
        {
            s=m%10; // 423%10=3, 42%10=2, 4%10=4
            rev = (rev*10)+s; // rev=(0*10)+3=3, rev=(3*10)+2=32, rev=(32*10)+4=324
            m = m/10; // m=423/10=42, 42/10=4, 4/10=0
        }// then condition false & rev will be printed at output
        System.out.println("Reverse of your number is:- "+rev);
    }
}
