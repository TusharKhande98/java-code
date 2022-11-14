import java.util.Scanner;
public class CNC12_Loops {
    public static void main(String[] args) {
        int x,y,z,a,b;
        x=1;
        y=0;
        z=13;
        a=20;
        b=0;
        // CODE-I(A):-

        System.out.println("Print same msg 3 times in a While Loop:- ");
        while(x<=3)
        {
            System.out.println("Hello JAVA--->");
            x++;
        }

        // CODE-I(B):-
        System.out.println("\nPrint Nos. With While Loop from 1 to 10 with increment of 2:- ");
        while(y<=10)
        {
            System.out.println(y);
            y+=2;
        }

        // CODE-I(C):-
        System.out.println("\nZ=13 so condition is false, get blank output in While Loop:- ");
        while(z<=10) // condition false, so it gives blank output.
        {
            System.out.println(z);
            z++;
        }

        // CODE-II(A):-
        System.out.println("\na=13 but, In Do-While condition checked first so 1 value is print compulsory(in while we get blank o/p:-");
        do{ // do print a value firstly then it check condition (in 'while' it checks cond. first)
            System.out.println(a);
            a++;
        }
        while(a<=10);// after print value & checked condition loop terminates, means atleast 1 value is prints

        // CODE-II(B):-
        System.out.println("\nPrint 1 to 10 with increment of 2 in Do-While");
        do{
            System.out.println(b);
            b+=2;
        }
        while(b<=10);

        // CODE-III(A):-
        System.out.println("\nPrint 1 to 10 in For-Loop");
        for (int c=1;c<=10;c++)
        {
            System.out.println(c);
        }

        // CODE-III(B):-
        System.out.println("\nGet blank cauz, condition false so loop terminated");
        for (int q=12;q<=10;q++)
        {
            System.out.println(q);
        }

        // CODE-III(C):-
        System.out.println("\nSkip 5 in series of 1 to 10 by using 'CONTINUE' in For-Loop");
        for (int s=1;s<=10;s++)
        {
            if (s==5) // when x=5
            {
                continue; // this keyword skip that value of x=5 in series
            }
            System.out.println(s);
        }

        // CODE-III(D):-
        System.out.println("\nSkip 4,5,6,7,8 in series of 1 to 10 by using 'CONTINUE' For-Loop");
        for (int s=1;s<=10;s++)
        {
            if (s>=5 && s<=8)
            {
                continue; // output is 1,2,3,9,10
            }
            System.out.println(s);
        }

        // CODE-III(E):-
        System.out.println("\nUsing 'BREAK' keyword with same condition as above we get different output...\nCauz 'BREAK' discontinue the next part of condition & print output directly.");
        for (int s=1;s<=10;s++)
        {
            if (s>=5 && s<=8)
            {
                break; // output is 1,2,3,4 only
            }
            System.out.println(s);
        }

        // CODE-IV(A):- Print table with For Loop
        System.out.println("\nPrint table of 5 in For-Loop");
        for (int t=1;t<=10;t++)
        {
// it will print 5x1=5,5x2=10... continue until x=10-->5x10=50 then x=11 & condition will false & loop terminate then get output
            System.out.println(5*t);
        }

        // CODE-IV(B):- Print table with For Loop
        System.out.println("\nTake User Input to Print table of any no. in For-Loop");
        Scanner so = new Scanner(System.in);
        int n;
        System.out.println("Enter a number to print its table:- ");
        n=so.nextInt();
        for (int t=1;t<=10;t++)
        {
            System.out.println(n*t);
        }

        // CODE-IV(C):- Print table with For Loop
        System.out.println("\nTake User Input to Print table of any no. upto any no. in For-Loop");
        Scanner any = new Scanner(System.in);
        int no, upto;
        System.out.println("Enter a number to print its table:- ");
        no=any.nextInt();
        System.out.println("Upto which number you want to print this table ");
        upto=any.nextInt();
        for (int t=1;t<=upto;t++)
        {
            System.out.println(no*t);
        }

        // CODE-V(A):- Print Character with For Loop
        System.out.println("\nPrint alphabets 'A to Z' by using 'char' in For-Loop");
        for (char t=65;t<=90;t++)// by using char 65=A & 90=z
        { // all int value convert to char & print that values character according to ASCII code
            System.out.println(t);
        }

        // CODE-V(B):- Print Character with For Loop
        System.out.println("\nPrint alphabets 'A to Z',special symbols, 'a to z'  by using 'char' in For-Loop");
        for (char t=65;t<=122;t++)
        {
            System.out.println(t);
        }


        // CODE-V(C):- Print Character with For Loop
        System.out.println("\nPrint alphabets 'A to Z' & 'a to z' & skip special symbols  by using 'char' in For-Loop");
        for (char t=65;t<=122;t++)
        {
            if (t>=91 && t<=96)
            {
                continue;
            }
            System.out.println(t);
        }

    }

}
