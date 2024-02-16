package lesson.lesson8.assignmentabstractandinterface.RemoteControlSystem;

public class Main {
    public static void main(String[] args) {
        StereoRemote stereo = new StereoRemote();
        stereo.powerOn();
        stereo.powerOff();
        stereo.volumeDown();
        stereo.volumeUp();

        TVRemote tv = new TVRemote();
        tv.powerOn();
        tv.powerOff();
        tv.volumeDown();
        tv.volumeUp();
    }
}
