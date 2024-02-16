package lesson.lesson8.assignmentabstractandinterface.EmployeeManagementSystem;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Amirul", 1);
        Developer developer = new Developer("Zal", 2);
        Intern intern = new Intern("Darwish", 3);

        manager.displayDetails();
        manager.calculateSalary();
        manager.displayDetails();

        developer.calculateSalary();
        intern.calculateSalary();
        developer.displayDetails();
        intern.displayDetails();
    }
}
