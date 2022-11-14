import java.util.Scanner;

public class CNC15_D_ArmstrongNumber {
    public static void main(String[] args) {
// Armstrong number is 153 = 1^3+5^3+3^3 = 1+125+27 = 153
// Sum of cube of all digits in a no. = armstrong number.
        Scanner pl = new Scanner(System.in);
        int m,s,sum=0;
        System.out.println("Enter any digit:- ");
        m=pl.nextInt();
        int x=m;
        while (m!=0)
        {
            s=m%10; // 423%10=3, 42%10=2, 4%10=4
            sum = sum+(s*s*s); // 0+1=1, 1+125=126, 126+27=153
            m = m/10; // m=423/10=42, 42/10=4, 4/10=0
        }
        System.out.println("Sum of your number is:- "+sum);
        if (x==sum) // rev will be compared with x in which inputted value is stored
        {
            System.out.println("Its a Armstrong number");
        }
        else
        {
            System.out.println("Its not a Armstrong number");
        }


    }
}
