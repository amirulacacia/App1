package lesson.lesson4.pojoclass;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Amirul", 20, "zasaza@gmail.com");

        System.out.println(person.getAge());
        System.out.println(person.getName());
        System.out.println(person.getEmail());
        person.setAge(10);
        person.setEmail("lalalaport@outlook.com");
        person.setName("Irfan");
        System.out.println(person.getAge());
        System.out.println(person.getName());
        System.out.println(person.getEmail());
    }
}
// A POJO (Plain Old Java Object) class in Java is a simple Java class that only
// contains private fields,
// along with public getter and setter methods to access and modify those
// fields. POJO classes are used
// to represent data objects in the application. They are appropriate when you
// need to model data with
// attributes but do not require any specific functionality or behavior beyond
// accessing and modifying
// those attributes.
