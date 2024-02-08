package assignment.assignment2;

public class ArrayFunction {
    public static void main(String[] args) {
        int[] a = { 100, 101, 102, 103 };
        int k = 100;

        printArrayValues(a);
        System.out.println("k = " + k);
        someMethod(k, a);
        printArrayValues(a);
        System.out.println("k = " + k);

    }

    public static void someMethod(int k, int[] b) {
        System.out.println("----------------In the method.");
        k = 0;
        for (int i = 0; i < b.length; i++)
            b[i] = 0;
        printArrayValues(b);
        System.out.println("k = " + k);
        System.out.println("------Going out of the method.");
    }

    public static void printArrayValues(int[] c) {
        for (int i = 0; i < c.length; i++)
            System.out.print(c[i] + ", ");
        System.out.println();
    }

}
