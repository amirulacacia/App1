package quiz1.question8;

public class Test {
    public static void main(String[] args) {

        // float x = 7, y = 200; //false
        // long x = 7, y = 200; //true
        // byte x = 7, y = 200; //false
        // double x = 7, y = 200; //false
        int x = 7, y = 200; // true
        // short x = 7, y = 200; //true

        System.out.println(String.valueOf(x + y).length());
    }
}

/*
 * To get output value 3, the correct variable will be long,
 * int and short. Byte very small bit which make it error
 * to compile due to large number given.
 * 
 * While float and double give the decimal which make
 * the output value is 5.
 */