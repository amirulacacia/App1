package lesson.lesson8.AssignmentAbstractAndInterface.VehicleInterface;

public class Car implements Vehicle {

    private double speed;

    @Override
    public void start() {
        System.out.println("Vrooom!!! Vrooom!!!");
        this.speed = 10;
        System.out.println("Car Speed: " + this.speed+ " km/h");
    }

    @Override
    public void stop() {
        System.out.println("Screeeeeech!!!!!");
        this.speed = 0;
        System.out.println("Car Speed: " + this.speed+ " km/h");
    }

    @Override
    public void accelerate(double speed) {
        this.speed += speed;
        System.out.println("Car Speed: " + this.speed+ " km/h");
    }

    @Override
    public void brake(double speed) {
        this.speed -= speed;
        System.out.println("Car Speed: " + this.speed+ " km/h");
    }
}
