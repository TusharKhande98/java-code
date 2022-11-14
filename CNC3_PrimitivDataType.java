// READ THEORY PART TO UNDERSTAND IT...

class CNC3_PrimitivDataType{
    public static void main(String[] args) {
    // 1.byte datatypes:-
        System.out.println(Byte.MAX_VALUE); // print last value.
        System.out.println(Byte.MIN_VALUE); // print last value.
        System.out.println("Maximum value of byte is:- "+Byte.MAX_VALUE); // print value with msg.
        System.out.println("Minimum value of byte is:- "+Byte.MIN_VALUE); // print value with msg.
        System.out.println(" ");
// If we try to print below line in byte we get error.
//        byte flt=10.25F; //Float value can't print in byte.
//        System.out.println(flt);
//        byte b3=128;  //Int value can't print in byte(beyond limit of byte).
//        System.out.println(b3);
//        byte tr = true;  //Boolean also can't convert into byte.
//        System.out.println(tr);
// Uncomment 1 line & run it, you will get error.

    // 2.short datatypes:-
        System.out.println(Short.MAX_VALUE); // print value.
        System.out.println(Short.MIN_VALUE); // print value.
        System.out.println("Maximum value of short is:- "+Short.MAX_VALUE); // print value with msg.
        System.out.println("Minimum value of short is:- "+Short.MIN_VALUE); // print value with msg.
        System.out.println(" ");

    // 3.int datatypes:-
        System.out.println(Integer.MAX_VALUE); // print value.
        System.out.println(Integer.MIN_VALUE); // print value.
        System.out.println("Maximum value of integer is:- "+Integer.MAX_VALUE); // print value with msg.
        System.out.println("Minimum value of integer is:- "+Integer.MIN_VALUE); // print value with msg.
        System.out.println(" ");

    // 4.long datatypes:-
        System.out.println(Long.MAX_VALUE); // print value.
        System.out.println(Long.MIN_VALUE); // print value.
        System.out.println("Maximum value of long is:- "+Long.MAX_VALUE); // print value with msg.
        System.out.println("Minimum value of long is:- "+Long.MIN_VALUE); // print value with msg.
        System.out.println(" ");

    // 5.float datatypes:-  Its having 4-5 values after dot
        System.out.println(Float.MAX_VALUE); // print value.
        System.out.println(Float.MIN_VALUE); // print value.
        System.out.println("Maximum value of float is:- "+Float.MAX_VALUE); // print value with msg.
        System.out.println("Minimum value of float is:- "+Float.MIN_VALUE); // print value with msg.
        float ft = 17.123456F; // eighter 'f' or 'F' is compulsary in float type values.
        System.out.println(ft);
        System.out.println(" ");

    // 6.double datatypes:-  Its having 14-15 values after dot
        System.out.println(Double.MAX_VALUE); // print value.
        System.out.println(Double.MIN_VALUE); // print value.
        System.out.println("Maximum value of double is:- "+Double.MAX_VALUE); // print value with msg.
        System.out.println("Minimum value of double is:- "+Double.MIN_VALUE); // print value with msg.
        double db = 10.123456789123456; // Dosen't matter you write 'D' or 'd' after value in double data type.
        System.out.println(db);
        System.out.println(" ");

    // 7.char datatypes:-  Default value=0, which represents space.
        System.out.println(Character.MAX_VALUE); // print value.
        System.out.println(Character.MIN_VALUE);
        char a= 'A';
        System.out.println(a);
        System.out.println(" ");

    // 8. boolean datatypes:- size not applicable, depends on virtual machine
       boolean p = true;
        System.out.println(p);
//        boolean t = True; // Get error of cannot find symbol
//        System.out.println(t);
    }
}
