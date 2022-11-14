import  java.util.Scanner;
class CNC9_InputUsingScanner {
    public static void main(String[] args) {
        Scanner so = new Scanner(System.in); // 1 created object can use multiple times, but if program wil not give o/p properly then create another again like below string.
// Creating object cauz we are using the Scanner class that is inbuilt in java.
// And 'System.in' means--> we can give input to computer like 'System.out' which gives us output.

        int x,y,z;
        System.out.println("Enter the value of x: ");
        x=so.nextInt(); // after inputting a value goes to buffer & it will be converted to integer by this method & stored to 'x'.
        System.out.println("Enter the value of y: ");
        y=so.nextInt();
        z = x + y; // addition will be stored to 'z'.
        System.out.println("Sum is:- "+z); // we get output.
        System.out.println(" ");

        String name;
        System.out.println("Enter your name:");
        name=so.next(); // in this method if you give space in line so it will not print after space(automaticallly breaked).
        System.out.println("Your name is:- "+name);
        System.out.println(" ");

        Scanner fnm = new Scanner(System.in);
        String fname;
        System.out.println("Enter your full name:");
        fname=fnm.nextLine(); // in this method whole line will be printed.
        System.out.println("Your full-name is:- "+fname);
        System.out.println(" ");

//  If we want to print character, so there is no special method for it
//  But we use 'next' appened with 'charAt' as below.

        Scanner chr = new Scanner(System.in);
        char ch;
        System.out.println("Enter any char:");
        ch=chr.next().charAt(0); // if we input a line too, still this method(charAt) stores & give o/p of character which is on 0'th position of line.
        System.out.println("Entered character is:- "+ch);
        System.out.println("Enter any char:");
        ch=chr.next().charAt(1); // from a input line it gives 2nd character in output.
        System.out.println("Entered character is:- "+ch);



    }
}
