package lesson.lesson8.assignmentabstractandinterface.messagingsystem;

public interface MessageSender {
    void sendMessage(String message) throws InterruptedException;
}
