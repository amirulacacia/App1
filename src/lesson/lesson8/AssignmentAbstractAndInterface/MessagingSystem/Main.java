package lesson.lesson8.AssignmentAbstractAndInterface.MessagingSystem;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        EmailSender emailSender = new EmailSender();
        emailSender.sendMessage("Hi, apa khabar di sana?");

        SMSSender smsSender = new  SMSSender();
        smsSender.sendMessage("Hi, buat apa tu?");
    }
}
