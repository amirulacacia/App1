package lesson.lesson8.AssignmentAbstractAndInterface.EmployeeManagementSystem;

public abstract class Employee {
    private String name;
    private int id;
    protected double salary;

    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    public abstract void calculateSalary();

    public void displayDetails(){
        System.out.println("Name   : " + name);
        System.out.println("ID     : " + id);
        System.out.println("Salary : RM" + salary + "\n");
    }
}
