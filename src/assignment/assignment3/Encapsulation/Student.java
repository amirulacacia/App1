package assignment.assignment3.Encapsulation;

public class Student {
    private String name;
    private int age, rollNumber;

    public Student(){

    }

    public String getName(){
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getRollNumber() {
        return this.rollNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}
