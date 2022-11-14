public class CNC13_TypeCasting {
    public static void main(String[] args) {

        // CODE-I:-
        //int a= 10.5; //get error lossy conversion
        //System.out.println(a); // compiler cant be able to convert value in 'int' cauz (int<double)

        // CODE-II:- int value in double.
        double b= 10; // get output 10.0(converted to double value, typecast done by compiler)
        System.out.println("Value converted to double:- "+b);

        // CODE-III:- Update of CODE-I.
        int c = (int)10.5; // typecast by programmer
        System.out.println("Value converted to int from double, so some data will loss:- "+c); // No Error, but data will loss.

        // CODE-IV:- stored character in int.
        int d = 'a'; // typecast by programmer
        System.out.println("character stored in int value so, Its ASCII value will print in int i.e. :- "+d);
        int e = 'D';
        System.out.println("int value of character 'D' is:- "+e);

        // CODE-V:-
        //int x = 130;
        //byte f = x; // (byte < int)
        //System.out.println(f); // Get Error

        // CODE-VI:- update of CODE-V.
        int y = 130;
        byte i = (byte)y; // (Converted int to byte, but data will loss)
        System.out.println("Converted to byte & data loss, cauz of its size: "+i);

        // CODE-VII:-
        double z = 10.5;
        //int j = z; // error of lossy conversion.
        int j = (int)z; // (Converted double to int, & data loss).
        System.out.println("convert to int & data loss:- "+j);




    }
}
