public class CNC16_A_Pre_Post_Increment {
    public static void main(String[] args) {

    // CODE-I:-
        int a=1;
        System.out.println("For a=1-->");
        System.out.println("\tIn Pre-Increment '++a' it directly print updated value i.e.:- "+ ++a);
        System.out.println("\tAfter increment original value of 'a' also change as we see:- " + a);

    // CODE-II:-
        int b=1;
        System.out.println("\nFor b=1-->");
        System.out.println("\tIn Post-Increment 'b++' first it prints original value i.e.:- "+ + b++ +" then increment");
        System.out.println("\tIf we print it again, the value of 'b' it will be updated i.e.:- "+b); // now it prints incremented value of b -->2

    // CODE-III:-
        int c, d=1;
        c=++d + ++d;
        System.out.println("\nFor c, d=1... what is 'c=++d + ++d?'-->");
        System.out.println("\tThe value of 'c' after increment & addition is is:- "+c);
        System.out.println("\tit will process as c=2+3=5 & 3 is last update of 'd'");
        System.out.println("\tAfter increment the last updated value of 'd' is:- "+d);


        // CODE-IV:- Read theory part for this code...
        int e, f=1;
        e=f++ + f++; // 1(++2inc)+2(++3inc)
        System.out.println("\nFor e, f=1... what is 'e=f++ + f++?'-->");
        System.out.println("\tThe value of 'e' after increment & addition is is:- "+e);
        System.out.println("\tit will process as e=1+2=3 & 3 is last update of 'f'");
        System.out.println("\tAfter increment the last updated value of 'f' is:- "+f);


        // CODE-V:-
        int g, h=1;
        g=++h + h++ + ++h; // 2 + 2(++3inc) + 4(++4inc)
        System.out.println("\nFor g, h=1... what is 'g=++h + h++ + ++h?'-->");
        System.out.println("\tThe value of 'g' after increment & addition is is:- "+g);
        System.out.println("\tit will process as g=2+2+4=8 & '4' is last update of 'h'");
        System.out.println("\tAfter increment the last updated value of 'h' is:- "+h);




    }
}
