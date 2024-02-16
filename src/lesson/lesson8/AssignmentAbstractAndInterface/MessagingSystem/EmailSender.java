package lesson.lesson8.assignmentabstractandinterface.MessagingSystem;

public class EmailSender implements MessageSender{

    @Override
    public void sendMessage(String message) throws InterruptedException {
        System.out.println("Message: " + message);
        System.out.println("Sending the email....");
        Thread.sleep(1000);
        System.out.println("Sent!");
    }
    
}
