package lesson.lesson8.assignmentabstractandinterface.remotesensingsystem;

public class TemperatureSensor implements Sensor {

    @Override
    public void measure() {
        System.out.println("Temperature reading: " + null + " \u00B0C");
    }

    @Override
    public void calibrate() {
        System.out.println("Temperature sensor is calibrating...");
    }
    
}
