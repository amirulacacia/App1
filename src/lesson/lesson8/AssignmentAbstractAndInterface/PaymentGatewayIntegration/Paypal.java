package lesson.lesson8.assignmentabstractandinterface.paymentgatewayintegration;

public class Paypal implements PaymentGateway{
    private boolean paymentSuccess;

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of RM " + amount + " via Paypal");
        paymentSuccess = true;
    }

    @Override
    public boolean isPaymentSuccessful() {
        return paymentSuccess;
    }
    
}
