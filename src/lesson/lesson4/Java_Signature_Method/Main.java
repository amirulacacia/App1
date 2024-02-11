package lesson.lesson4.Java_Signature_Method;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(10, 2));
        System.out.println(calculator.add(5.5, 2.5));
        System.out.println(calculator.square(3));
        System.out.println(calculator.square(3.5));
        System.out.println(calculator.average(3, 2, 5));
        System.out.println(calculator.average(3.2, 5.6,3.2));

    }
}
