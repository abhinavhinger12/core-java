package basics;

public class PrimitiveVariable {
    public static void main(String[] args){
        /*
        int stored in 32 bits.
        int in instance variable has default value 0
        int in local variable need to be assigned before using
         */
        int x = 1234;
        System.out.println(x);
        /*
        byte uses 8 bits -127 to 128
        Default value 0
         */
        byte b = 12;
        System.out.println(b);
        /*
        short uses 16 bits
        Default value 0
         */
        short s = 35;
        System.out.println(s);

        /*
        long is stored in 64 bits.

        Default value is 0

         */
        long l = 1234567;
        System.out.println(l);

        /*
        float is used for floating point numbers. Uses 32 bits
        It has single precision meaning after 6 places to decimal point it loses precision
        and is an estimate. If accurate calculations required use Big Decimal class
         */
        float f = 3.1415f;
        System.out.println(f);
        /*
        double has double precision number. Uses 64bits
        Default value 0.0
        Uses D to designate double like f for float
         */

        double d = 3.13457599923384753929348D;
        System.out.println(d);
        /*
        char is 16 bit integer representing Unicode-encoded character
        Range --> 0 - 65535
        Default value is /u0000'
         */
        char c = 65;  //prints A
        System.out.println(c);

        /*
        Sometimes we need object wrapper rather than its primitive. Eg. When using with generics
        Java does this automatically for us. Called Autoboxing

         */

        Character cWrap = 'q';
        Integer iWrap = 12;


    }
}
