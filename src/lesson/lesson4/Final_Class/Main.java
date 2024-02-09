package lesson.lesson4.Final_Class;

public class Main {
    public static void main(String[] args) {
        //The final class cannot be subclassed.
        //Final class are used when you want to prevent
        //inheritance or extension of a class.
        Circle circle = new Circle(5);
        System.out.println(circle.calculateArea());
    }
}
