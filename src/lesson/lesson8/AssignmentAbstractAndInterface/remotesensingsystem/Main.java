package lesson.lesson8.assignmentabstractandinterface.remotesensingsystem;

public class Main {
    public static void main(String[] args) {
        PressureSensor pressureSensor = new PressureSensor();
        pressureSensor.measure();
        pressureSensor.calibrate();

        TemperatureSensor temperatureSensor = new TemperatureSensor();
        temperatureSensor.measure();
        temperatureSensor.calibrate();
        
    }
}
