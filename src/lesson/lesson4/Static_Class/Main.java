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
// Static classes in Java are similar to static classes in C#, they cannot be instantiated,
// and they can only contain static members. They are appropriate for utility classes that
// contain methods applicable to a specific domain but don't require instance-specific data.
// Static classes are also useful when you want to group related methods together without the
// need for creating instances of the class.
