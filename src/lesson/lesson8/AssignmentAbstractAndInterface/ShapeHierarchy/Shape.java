package lesson.lesson8.assignmentabstractandinterface.ShapeHierarchy;

public abstract class Shape {
    String color;
    boolean filled;

    public abstract double getArea();
    public abstract double getPerimeter();

    public String toString(){
        return "color: " + color + ", filled: " + filled;
    }
}
