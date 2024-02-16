package lesson.lesson8.assignmentabstractandinterface.musicstreamingservice;

public class Main {
    public static void main(String[] args) {
        MP3Player mp3Player = new MP3Player("Old Love");
        mp3Player.play();
        mp3Player.pause();
        mp3Player.next();
        mp3Player.previous();

        StreamingServicePlayer streamingServicePlayer = new StreamingServicePlayer("Angkasa");
        streamingServicePlayer.play();
        streamingServicePlayer.pause();
        streamingServicePlayer.next();
        streamingServicePlayer.previous();
    }
}
