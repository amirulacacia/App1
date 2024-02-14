package lesson.lesson7.Exercise.JsonFile;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Person(name = '" + name + "\', age = " + age + ")";
    }
}
