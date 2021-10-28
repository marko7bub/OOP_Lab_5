package payment;

public class CreditCardPaymentStrategy implements Payment{
    @Override
    public boolean pay(double price) {
        System.out.println("Successfully paid " + price + "$ by card!");
        return true;
    }
}
