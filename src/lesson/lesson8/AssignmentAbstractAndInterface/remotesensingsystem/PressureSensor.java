package lesson.lesson8.assignmentabstractandinterface.remotesensingsystem;

public class PressureSensor implements Sensor {

    @Override
    public void measure() {
        System.out.println("Pressure reading: " + null + " kPa");
    }

    @Override
    public void calibrate() {
        System.out.println("Pressure sensor is calibrating...");
    }

}
