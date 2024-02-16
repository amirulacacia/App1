package lesson.lesson7.serializeanddeserializeobjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {
    public static void main(String[] args) {
        Employee employee = null;

        try (FileInputStream fis = new FileInputStream("employee.ser");
        ObjectInputStream ois = new ObjectInputStream(fis)){
            employee = (Employee)ois.readObject();
            System.out.println("Employee object deserialized succesfully");
            System.out.println("Name: "+employee.name);
            System.out.println("Age: "+employee.age);
            System.out.println("Address: "+employee.address);
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
