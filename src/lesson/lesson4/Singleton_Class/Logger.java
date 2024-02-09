package lesson.lesson4.Singleton_Class;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static Logger instance = null;

    private Logger() {

    }

    public static Logger getInstance() {
        return instance == null ? (instance = new Logger()) : instance;
    }

    public void log(String message) {
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedTime = currentTime.format(formatter);
        System.out.println("[" + formattedTime + "]" + message);
    }
}
