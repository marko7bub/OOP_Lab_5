package flowers;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private List<FlowerPack> flowerPackList = new ArrayList<FlowerPack>();
    public double price() {
        double sum = 0;
        for (int i = 0; i < flowerPackList.size(); i++) {
            sum += flowerPackList.get(i).price();
        }
        return sum;
    }
    public void addFlowerPack(FlowerPack flowerPack) {
        flowerPackList.add(flowerPack);
    }
}
