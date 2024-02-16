package lesson.lesson8.assignmentabstractandinterface.vehicleinterface;

public class Bicycle implements Vehicle {
    private double speed;

    @Override
    public void start() {
        System.out.println("Cycling!!!!");
        this.speed = 5;
        System.out.println("Bicycle Speed: " + this.speed + " km/h");
    }

    @Override
    public void stop() {
        System.out.println("Creeaaaakkkk!!!!");
        this.speed = 0;
        System.out.println("Bicycle Speed: " + this.speed + " km/h");
    }

    @Override
    public void accelerate(double speed) {
        this.speed += speed;
        System.out.println("Bicycle Speed: " + this.speed + " km/h");
    }

    @Override
    public void brake(double speed) {
        this.speed -= speed;
        System.out.println("Bicycle Speed: " + this.speed + " km/h");
    }

}
