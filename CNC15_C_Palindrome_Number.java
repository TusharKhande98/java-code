import java.util.Scanner;

public class CNC15_C_Palindrome_Number {
    public static void main(String[] args) {

    // Palindrome no:- 121, 3223, 234432, 626 (even after reverse it looks same).
        Scanner pl = new Scanner(System.in);
        int m,s,rev=0;
        System.out.println("Enter any digit:- ");
        m=pl.nextInt(); //423
//  below code is same as previous reverse code in which after user input 'm=121'.
//  but after calculations it will be 'm=0', for that problem we use 1 extra variable to compare it with our 'rev'.
//  x=n so 'n' for calculation & its value stored in 'x' which we compared with our 'rev'-->x==rev.
        int x=m;
        while (m!=0)
        {
            s=m%10; // 423%10=3, 42%10=2, 4%10=4
            rev = (rev*10)+s; // rev=(0*10)+3=3, rev=(3*10)+2=32, rev=(32*10)+4=324
            m = m/10; // m=423/10=42, 42/10=4, 4/10=0
        }
        System.out.println("Reverse of your number is:- "+rev);
        if (x==rev) // rev will be compared with x in which inputted value is stored
        {
            System.out.println("Its a Palindrome number");
        }
        else
        {
            System.out.println("Its not a Palindrome number");
        }

    }
}
