package decorator;

import decorators.BasketDecorator;
import decorators.Decorator;
import decorators.PaperDecorator;
import decorators.RibbonDecorator;
import flowers.Flower;
import flowers.Item;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecoratorTest {
    Flower flower1 = new Flower();
    Item[] item = {flower1};
    Decorator decoratorBasket = new BasketDecorator(item[0]);
    Decorator decoratorRibbon = new RibbonDecorator(item[0]);
    Decorator decoratorPaper = new PaperDecorator(item[0]);
    @org.junit.jupiter.api.Test
    void testRibbon() {
        flower1.setPrice(6);
        assertEquals(decoratorRibbon.getPrice(), 46);
    }
    @org.junit.jupiter.api.Test
    void testPaper() {
        flower1.setPrice(6);
        assertEquals(decoratorBasket.getPrice(), 10);
    }
    @org.junit.jupiter.api.Test
    void testBasket() {
        flower1.setPrice(6);
        assertEquals(decoratorPaper.getPrice(), 19);
    }
}