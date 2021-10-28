package delivery;

import flowers.Item;

public class DHLDeliveryStrategy implements Delivery {
    @Override
    public boolean deliver(Item[] items) {
        System.out.println("Items successfully delivered via DHL");
        return true;
    }
}
