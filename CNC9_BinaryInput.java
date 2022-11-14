import java.util.Scanner;

class CNC9_BinaryInput {
    public static void main(String[] args) {
        Scanner so = new Scanner(System.in);
        int x;
        System.out.println("Enter any Hexadecimal number:");
        x=so.nextInt(16); //just putdown hexavalue in bracket
        System.out.println("Decimal number is:- "+x);

        int b;
        System.out.println("Enter any Binary number:");
        b=so.nextInt(2); //just putdown Binary in bracket
        System.out.println("Binary number is:- "+b);

        int oc;
        System.out.println("Enter any Octal number:");
        oc=so.nextInt(8); //just putdown Octal in bracket
        System.out.println("Octal number is:- "+oc);
    }
}
