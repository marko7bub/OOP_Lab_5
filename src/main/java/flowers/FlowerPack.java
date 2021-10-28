package flowers;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FlowerPack extends Item {
    private Flower flower;
    private int amount;
    public double price() {
        return flower.getPrice()*amount;
    }

    @Override
    public double getPrice() {
        return this.price();
    }

    @Override
    public String getDescription() {
        return flower.toString();
    }
}
