package assignment.assignment3.encapsulation;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        System.out.println(student1.getName() + " " + student1.getAge() + " " + student1.getRollNumber());

        student1.setName("Amirul");
        student1.setAge(23);
        student1.setRollNumber(69);
        student2.setName("Darwish");
        student2.setAge(20);
        student2.setRollNumber(58);

        System.out.println(student1.getName() + " " + student1.getAge() + " " + student1.getRollNumber());
        System.out.println(student2.getName() + " " + student2.getAge() + " " + student2.getRollNumber());
    }
}
