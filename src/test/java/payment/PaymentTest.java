package payment;

import delivery.DHLDeliveryStrategy;
import delivery.Delivery;
import delivery.PostDeliverStrategy;
import flowers.Flower;
import flowers.Item;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentTest {
    Item[] item = {new Flower()};
    Payment payment1 = new CreditCardPaymentStrategy();
    Payment payment2 = new PayPalPaymentStrategy();
    @org.junit.jupiter.api.Test
    void testDHL() {
        assertEquals(payment1.pay(item[0].getPrice()), true);
    }
    @org.junit.jupiter.api.Test
    void testPost() {
        assertEquals(payment2.pay(item[0].getPrice()), true);
    }
}
