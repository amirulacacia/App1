package lesson.lesson8.assignmentabstractandinterface.paymentgatewayintegration;

public class Main {
    public static void main(String[] args) {
        Paypal paypal = new Paypal();
        System.out.println("Payment process via Paypal: " +
                (paypal.isPaymentSuccessful() ? "Success" : "Failed"));
        paypal.processPayment(1000);
        System.out.println("Payment process via Paypal: " +
                (paypal.isPaymentSuccessful() ? "Success" : "Failed"));

        Stripe stripe = new Stripe();
        stripe.processPayment(500);
        System.out.println("Payment process via Paypal: " +
                (stripe.isPaymentSuccessful() ? "Success" : "Failed"));
    }
}
