package lesson.lesson8.assignmentabstractandinterface.paymentgatewayintegration;

public interface PaymentGateway {
    void processPayment(double amount);
    boolean isPaymentSuccessful();
}
