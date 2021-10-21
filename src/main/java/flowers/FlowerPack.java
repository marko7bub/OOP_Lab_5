package flowers;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FlowerPack {
    private Flower flower;
    private int amount;
    public double price() {
        return flower.getPrice()*amount;
    }
}
