package lesson.lesson4.Abstract_Class;

public class Main {
    public static void main(String[] args) {
        // Abstract class is a template for subclass
        Shape rectangular = new Rectangular(5,4);
        Circle circle = new Circle(3);

        System.out.println(rectangular.calculateArea());
        System.out.println(circle.calculateArea());
    }
}
