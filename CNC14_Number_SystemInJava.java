import java.util.Scanner;

public class CNC14_Number_SystemInJava {
    public static void main(String[] args) {

        // CODE-I:-
        System.out.println("READ THEORY PART TO UNDERSTAND IT CAREFULLY HERE WE JUST WRITE A CODE OF IT");
        System.out.println("\n1.Binary to Decimal");
        int a = 0b1110;
        System.out.println("\tDecimal number of Binary '0b1110' is:- "+a);

        // CODE-II:-
        System.out.println("\n2.Octal to Decimal");
        int b = 010;
        System.out.println("\tDecimal number of Octal '010' is:- "+b);

        // CODE-III:-
        System.out.println("\n3.Hexa-value to Decimal");
        int c = 0xc;
        System.out.println("\tDecimal number of Hexadecimal '0xc' is:- "+c);
        int d = 0xf;
        System.out.println("\tDecimal number of Hexadecimal '0xf' is:- "+d);
        int e = 0xff8;
        System.out.println("\tDecimal number of Hexadecimal '0xff8' is:- "+e) ;
        int f = 0xAb8;
        System.out.println("\tDecimal number of Hexadecimal '0xAb8' is:- "+f);

        // CODE-IV(A):-  Take input from user with scanner in Hexadecimal.
        Scanner obj = new Scanner(System.in);
        System.out.println("\n4.We take input in Hexadecimal format");
        System.out.println("\tEnter any Hexa value:- ");
        int g = obj.nextInt(16); // write hexa base value in bracket.
        System.out.println("\tDecimal number of Hexa-value is:- "+g);

        // CODE-IV(B):-  Take input from user with scanner in Binary.
        System.out.println("\n4.We take input in Binary format");
        System.out.println("\tEnter any Binary value:- ");
        int h = obj.nextInt(2); // write Binary base value in bracket.
        System.out.println("\tDecimal number of Binary value is:- "+h);

        // CODE-IV(C):-  Take input from user with scanner in Octal.
        System.out.println("\n4.We take input in Octal format");
        System.out.println("\tEnter any Octal value:- ");
        int i = obj.nextInt(8); // write Octal base value in bracket.
        System.out.println("\tDecimal number of Octal value is:- "+i);


    }
}
