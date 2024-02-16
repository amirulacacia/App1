package lesson.lesson8.AssignmentAbstractAndInterface.PaymentGatewayIntegration;

public class Stripe implements PaymentGateway {
    private boolean paymentSuccess;

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of RM " + amount + " via Stripe");
        paymentSuccess = true;
    }

    @Override
    public boolean isPaymentSuccessful() {
        return paymentSuccess;
    }
}
