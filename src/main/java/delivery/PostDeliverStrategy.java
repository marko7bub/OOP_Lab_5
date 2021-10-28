package delivery;

import flowers.Item;

public class PostDeliverStrategy implements Delivery {
    @Override
    public boolean deliver(Item[] items) {
        System.out.println("Items successfully delivered via post");
        return true;
    }
}
