package flowers;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Flower extends Item{
    private double sepalLength;
    private double price;
    private FlowerType flowerType;
    private Color color;

    @Override
    public String getDescription() {
        return flowerType.toString();
    }
}
