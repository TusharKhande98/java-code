class B{
    static String str="Denmark";
}

class CNC6_variables {
    int i =20; //Instance Variable
    static int s= 30; //Static Variable
    static String sr="India";

    public static void main(String[] args) {
        CNC6_variables obj = new CNC6_variables();
        int l=11; // Local Variable
        System.out.println("Local:- "+l);
        System.out.println("Instance:- "+obj.i);
        System.out.println("Static:- "+s);
        System.out.println(" ");
        System.out.println("We print string in static form but its in a class that have main method:- "+sr);
        System.out.println("Finding length of "+sr+" from same class:- "+sr.length());
        System.out.println(" ");
        System.out.println("Now we print string from another class which don't have main method by using that class name & appened var-name:- "+B.str);
        System.out.println("Finding length of "+B.str+" from another class:- "+B.str.length());
        System.out.println(" ");
        System.out.println("PRACTISE ON THIS SYNTAX IT MAY CONFUSED YOU, IF IT TAKES AS A CASUAL SYNTAX");
// WRITE DEFINITION OF "System.out.println" IN BOOK FROM V-6 WITH EXAMPLE AS ITS SHOWED

    }
}
