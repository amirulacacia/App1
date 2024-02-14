package lesson.lesson7.SerializeAndDeserializeObjects;

import java.io.Serializable;

public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int age;
    String address;
}
