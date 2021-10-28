package payment;

public class PayPalPaymentStrategy implements Payment {
    @Override
    public boolean pay(double price) {
        System.out.println("Successfully paid " + price + "$ via PayPal!");
        return true;
    }
}
