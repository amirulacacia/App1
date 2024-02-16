package lesson.lesson8.assignmentabstractandinterface.RemoteControlSystem;

public class StereoRemote implements RemoteControl  {
    @Override
    public void powerOn() {
        System.out.println("Stereo powering on....");
    }

    @Override
    public void powerOff() {
        System.out.println("Stereo powering off....");
    }

    @Override
    public void volumeUp() {
        System.out.println("Stereo volume increases...");
    }

    @Override
    public void volumeDown() {
        System.out.println("Stereo volume decreases...");
    }
}
