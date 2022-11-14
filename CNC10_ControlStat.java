import java.util.Scanner;

class CNC10_ControlStat {
    public static void main(String[] args) {

    // 1. If statement:
       //CODE-1:-
        int a,b;
        a=111;
        b=22;
        if(a<b){
            System.out.println("a is less than b...");
        } // without else we cant get error, just blank space showed in output.

    // 2. If-Else statement:
        int c,d;
        c=11;
        d=22;
        if(c>d){
            System.out.println("c is less than d...");
        }
        else{
            System.out.println("c is greater");
        }

    // 3. If-Else-if statement:
        Scanner gr = new Scanner(System.in);
        int e,f,g;
        System.out.println("Enter first value");
        e=gr.nextInt();
        System.out.println("Enter second value");
        f=gr.nextInt();
        System.out.println("Enter third value");
        g=gr.nextInt();

        if(e>f && e>g){ // if both are true then this block prints output.
            System.out.println(e+" is the greatest number");
        }
        else if(f>e && f>g){
            System.out.println(f+" is the greatest number");
        }
        else if(g>f && g>e){
            System.out.println(g+" is the greatest number");
        }
        else{ // if all above condition above are false, then this block prints output.
            System.out.println("May be all are same");
        }


    }
}
