package flowers;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    Flower flower = new Flower();
    @org.junit.jupiter.api.Test
    void getPrice() {
        flower.setPrice(10);
        assertEquals(flower.getPrice(), 10);
    }

    @org.junit.jupiter.api.Test
    void getFlowerType() {
        flower.setFlowerType(FlowerType.ROSE);
        assertEquals(flower.getFlowerType(), FlowerType.ROSE);
    }
}