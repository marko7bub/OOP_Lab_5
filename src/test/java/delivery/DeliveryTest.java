package delivery;

import flowers.Flower;
import flowers.FlowerBucket;
import flowers.Item;

import static org.junit.jupiter.api.Assertions.*;



public class DeliveryTest {
    Item[] item = {new Flower()};
    Delivery delivery1 = new DHLDeliveryStrategy();
    Delivery delivery2 = new PostDeliverStrategy();
    @org.junit.jupiter.api.Test
    void testDHL() {
        assertEquals(delivery1.deliver(item), true);
    }
    @org.junit.jupiter.api.Test
    void testPost() {
        assertEquals(delivery2.deliver(item), true);
    }
}
