package quiz.quiz3.question49;

public class Test {
    public static void main(String[] args) {
        System.out.println("String");
    }

    public static void main(Integer[] args) {
        System.out.println("Integer");
    }

    public static void main(byte[] args) {
        System.out.println("byte");
    }
}

/*
 * Like any other method, main method can also be overloaded. But main method
 * called by JVM is always with String [] parameter. Don't get confused with 10
 * as it is passed as "10".
 * 
 * Execute above class with any command line arguments or 0 command line
 * argument, output will always be "String".
 */
