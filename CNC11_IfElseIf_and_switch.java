import java.util.Scanner;

class CNC11_IfElseIf_and_switch {
    public static void main(String[] args) {
    // CODE-1:- If Else If
        Scanner chs = new Scanner(System.in);
        int x,y,z;
        System.out.println("Enter first value");
        x=chs.nextInt();
        System.out.println("Enter second value");
        y=chs.nextInt();
        System.out.println("Enter Choice: \n1.Add\n2.Sub\n3.Mult\n4.Div");
        z=chs.nextInt(); // which operation we have to perform is stored in a no. ID which conditions are derived in if-else part below
//we did this program only in 3 variables, x,y,choice & other operation are directly done inside bracket of s.o.u.t. statement, as below 2nd line.
        if(z==1){ // if user input 'no.1' at o/p then this block print & gives addition cauz, we write that condition inside bracket which concate with string.
            System.out.println("Sum is:- "+(x+y));
        }
        else if(z==2){
            System.out.println("Subt is:- "+(x-y));
        }
        else if(z==3){ // if choice input is 3, then multiplication performed which is written inside bracket as a condition.
            System.out.println("Mult is:- "+(x*y));
        }
        else if(z==4){
            System.out.println("Div is:- "+(x/y));
        }
        else{ // we don't add conditions in else part
            System.out.println("Invalid Choice\nTry Again..."); // if user press another no. then this msg will print.
        }
        System.out.println(" ");

    // CODE-2:- Switch case

        Scanner sw = new Scanner(System.in); // scanner again active here to take input.
        int p,q,r;
        System.out.println("Enter first value");
        p=sw.nextInt();
        System.out.println("Enter second value");
        q=sw.nextInt();
        System.out.println("Enter Choice: \n1.Add\n2.Sub\n3.Mult\n4.Div");
        r=sw.nextInt(); // Choice no. will be stored in variable 'r'.

        switch (r) // after no. is stored 'switch statement' checks, which case have inputted choice no. then only that block runs.
        {
            case 1: // if choice is '1' then addition will performed
                System.out.println("Sum is:- "+(p+q)); // this block prints msg + addition
                break; //then switch statement will break here & program will terminate(only if when the choice is 1).
            case 2:
                System.out.println("Subt is:- "+(p-q));
                break;
            case 3:
                System.out.println("Mult is:- "+(p*q));
                break;
            case 4: //choice=4 then multiplication performed in this block & prints it.
                System.out.println("Div is:- "+(p/q));
                break;
            default: // if we give wrong choice input then default block run & print this msg.
                System.out.println("Invalid Choice\nTry Again...");
                break;
        }
        System.out.println(" ");

    // CODE-3:- Switch case (check its vowel or not...)
        Scanner vo = new Scanner(System.in); // scanner again active here to take input.
        char ch;
        System.out.println("Enter any Char:- ");
        ch=vo.next().charAt(0);

        switch(ch)
        { // this program is written differently in video
          // may be in IDE, if our printing output is same for some condition  then it can be also written in 1 line after declaring cases.
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Yes... "+"'"+ch+"'"+" is a vowel");
                break; // if we don't write break, then it will be a logical error not a syntax error.
            default:
                System.out.println("Not a vowel, its a consonant");
        }
        System.out.println(" ");


    // CODE-4:- If-Else (check its vowel or not...)
        Scanner vow = new Scanner(System.in);
        char cht;
        System.out.println("Enter any Char:- ");
        cht=vow.next().charAt(0);

        if(cht=='a'){
            System.out.println(cht+" is a vowel");
        }
        else if(cht=='e'){
            System.out.println(cht+" is a vowel");
        }
        else if(cht=='i'){
            System.out.println(cht+" is a vowel");
        }
        else if(cht=='o'){
            System.out.println(cht+" is a vowel");
        }
        else if(cht=='u'){
            System.out.println(cht+" is a vowel");
        }
        else{
            System.out.println(ch+" Not a vowel");
        }
        System.out.println(" ");

    // CODE-4:- If-Else (check its vowel or not With Logical Operator OR-->'||')
        Scanner vo1 = new Scanner(System.in);
        char ch1;
        System.out.println("BELOW OUTPUT IS BY USING LOGICAL 'OR' OPERATOR with a short method using If-Else");
        System.out.println("Enter any Char:- ");
        ch1=vo1.next().charAt(0);

        if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u' ){
            System.out.println(ch1+" is a vowel");
        }
        else{
            System.out.println(ch1+" is a vowel");
        }
        System.out.println(" ");

    // CODE-5:- If-Else (Check class distinction by inputting marks with logical and-->&& operator).
        Scanner mksObj = new Scanner(System.in);
        int mk;
        System.out.println("Enter your marks:- ");
        mk=mksObj.nextInt();

        if(mk>=80 && mk<=100){
            System.out.println("1st Class");
        }
        else if(mk>=60 && mk<=79){
            System.out.println("2nd Class");
        }
        else if(mk>=40 && mk<=59){
            System.out.println("3rd Class");
        }
        else{
            System.out.println("Fail");
        }
        System.out.println(" ");

    // CODE-6:- How weather detector app works, here is a sample code with nested If as below.
        int temp=30;
        boolean sunlight = false;
//  CODE IS TRICKY TO UNDERSTAND:
        if(temp>35)
        {
            System.out.println("Its hot outside");
            if (sunlight==true)
            {
                System.out.println("Its a SunDay");
            }
            else
            {
                System.out.println("Its cloudy");
            }
        }
        else
        {
            System.out.println("Its not hot outside");
            if (sunlight==true)
            {
                System.out.println("Its a SunDay");
            }
            else
            {
                System.out.println("Its cloudy");
            }
        }




    }
}
