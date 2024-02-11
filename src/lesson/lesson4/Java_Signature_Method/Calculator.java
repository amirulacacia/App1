package lesson.lesson4.Java_Signature_Method;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int square(int a) {
        return (int) Math.pow(a, 2);
    }

    public double square(double a) {
        return Math.pow(a, 2);
    }

    public double average(int a, int b, int c) {
        return (double) (a + b + c) / 3;
    }

    public double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}
