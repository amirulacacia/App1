package lesson.lesson8.assignmentabstractandinterface.vehicleinterface;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.start();
        bicycle.accelerate(10);
        bicycle.brake(5);
        bicycle.accelerate(10);
        bicycle.stop();

        Car car = new Car();
        car.start();
        car.accelerate(50);
        car.brake(20);
        car.accelerate(100);
        car.stop();
    }
}
