package lesson.lesson8.assignmentabstractandinterface.musicstreamingservice;

public class MP3Player implements MusicPlayer {
    private String currentTrack;

    public MP3Player(String initialTrack){
        this.currentTrack = initialTrack;
    }

    @Override
    public void play() {
        System.out.println("Currently playing: " + currentTrack);
    }

    @Override
    public void pause() {
        System.out.println("Currently pause: " + currentTrack);
    }

    @Override
    public void next() {
        System.out.println("Playing next track...");
    }

    @Override
    public void previous() {
        System.out.println("Playing previous track...");
    }
}
