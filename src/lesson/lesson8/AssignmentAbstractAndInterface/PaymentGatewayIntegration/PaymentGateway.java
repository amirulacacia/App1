package lesson.lesson8.assignmentabstractandinterface.PaymentGatewayIntegration;

public interface PaymentGateway {
    void processPayment(double amount);
    boolean isPaymentSuccessful();
}
