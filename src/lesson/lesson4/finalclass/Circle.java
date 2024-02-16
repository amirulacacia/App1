package lesson.lesson4.finalclass;

public final class Circle {
    private double radius;
    private double PI = 3.14159;

    public Circle(double radius){
        this.radius = radius;
    }

    public double calculateArea(){
        return PI * Math.pow(this.radius, 2);
    }
}
