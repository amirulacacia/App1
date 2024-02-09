package lesson.lesson4.Static_Class;

public class Main {
    public static void main(String[] args) {

        // The difference between static and non-static
        // is that static class doesnt need to make object
        // to called the method.
        System.out.println(MathUtils.add(10, 5));
        System.out.println(MathUtils.subtract(8, 15));
        int number = 17;
        System.out.println(MathUtils.isEven(number)? number + " is odd": number + " is even");
    }
}
