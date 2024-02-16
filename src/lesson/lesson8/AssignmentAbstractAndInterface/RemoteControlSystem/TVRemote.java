package lesson.lesson8.AssignmentAbstractAndInterface.RemoteControlSystem;

public class TVRemote implements RemoteControl{

    @Override
    public void powerOn() {
        System.out.println("TV powering on....");
    }

    @Override
    public void powerOff() {
        System.out.println("TV powering off....");
    }

    @Override
    public void volumeUp() {
        System.out.println("TV volume increases...");
    }

    @Override
    public void volumeDown() {
        System.out.println("TV volume decreases...");
    }
    
}
