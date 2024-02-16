package lesson.lesson8.assignmentabstractandinterface.animalhierarchy;

public abstract class Animal {
    String name;
    int age;

    public String eat() {
        return "eating....";
    }

    public String sleep() {
        return "sleeping....";
    }

    public abstract void makeSound();
}
