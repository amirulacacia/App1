package lesson.lesson8.assignmentabstractandinterface.EmployeeManagementSystem;

public class Developer extends Employee {
    public Developer(String name, int id) {
        super(name, id);
    }

    @Override
    public void calculateSalary() {
        salary = 5000;
    }
}
