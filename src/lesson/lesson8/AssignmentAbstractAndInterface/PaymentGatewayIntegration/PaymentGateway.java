package lesson.lesson8.AssignmentAbstractAndInterface.PaymentGatewayIntegration;

public interface PaymentGateway {
    void processPayment(double amount);
    boolean isPaymentSuccessful();
}
