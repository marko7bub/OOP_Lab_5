package order;

import delivery.DHLDeliveryStrategy;
import flowers.*;
import payment.PayPalPaymentStrategy;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    Order order1 = Order.QuickOrder();
    User user1 = new Receiver();
    User user2 = new Sender();
    User user3 = new Receiver();
    User user4 = new Receiver();
    FlowerPack fp1 = new FlowerPack();
    Flower flower1 = new Flower();

    @org.junit.jupiter.api.Test
    void staticFactoryTest() {
        FlowerPack fp1 = new FlowerPack();
        Flower flower1 = new Flower();
        flower1.setFlowerType(FlowerType.ROSE);
        fp1.setFlower(flower1);
        fp1.setAmount(5);
        order1.addtoCart(fp1);
        order1.addUser(user1);
        order1.addUser(user2);
        order1.addUser(user3);
        order1.addUser(user4);
        order1.removeUser(user2);
        assertEquals(order1.updateText(), "Your order of [" + fp1.toString() + "] is ready! You chose to pay using card and your order will be delivered via post.");
    }

    @org.junit.jupiter.api.Test
    void changeDeliveryTest() {
        FlowerPack fp1 = new FlowerPack();
        Flower flower1 = new Flower();
        flower1.setFlowerType(FlowerType.ROSE);
        fp1.setFlower(flower1);
        fp1.setAmount(5);
        order1.addtoCart(fp1);
        order1.addUser(user1);
        order1.addUser(user2);
        order1.addUser(user3);
        order1.addUser(user4);
        order1.chooseDelivery(new DHLDeliveryStrategy());
        assertEquals(order1.updateText(), "Your order of [" + fp1.toString() + "] is ready! You chose to pay using card and your order will be delivered via DHL.");
    }

    @org.junit.jupiter.api.Test
    void changePaymentTest() {
        FlowerPack fp1 = new FlowerPack();
        Flower flower1 = new Flower();
        flower1.setFlowerType(FlowerType.ROSE);
        fp1.setFlower(flower1);
        fp1.setAmount(5);
        order1.addtoCart(fp1);
        order1.addUser(user1);
        order1.addUser(user2);
        order1.addUser(user3);
        order1.addUser(user4);
        order1.choosePayment(new PayPalPaymentStrategy());
        assertEquals(order1.updateText(), "Your order of [" + fp1.toString() + "] is ready! You chose to pay using PayPal and your order will be delivered via post.");
    }
}