package order;

import delivery.DHLDeliveryStrategy;
import delivery.Delivery;
import delivery.PostDeliverStrategy;
import flowers.*;
import payment.CreditCardPaymentStrategy;
import payment.PayPalPaymentStrategy;
import payment.Payment;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<User> users = new ArrayList<>();
    private final List<Item> cart = new ArrayList<>();
    private Delivery deliverymethod = new PostDeliverStrategy(); //default delivery unless changed
    private Payment paymentmethod = new CreditCardPaymentStrategy(); //default payment unless changed
    private String deliveryString = "post";
    private String paymentString = "card";

    public void addUser (User user) {
        this.users.add(user);
    }

    public void removeUser(User user) {
        this.users.remove(user);
    }

    public void addtoCart(Item item) {
        this.cart.add(item);
    }

    public void chooseDelivery (Delivery deliverymethod) {
        this.deliverymethod = deliverymethod;
        if (this.deliverymethod instanceof DHLDeliveryStrategy) {
            this.deliveryString = "DHL";
        }
    }

    public void choosePayment (Payment paymentmethod) {
        this.paymentmethod = paymentmethod;
        if (this.paymentmethod instanceof PayPalPaymentStrategy) {
            this.paymentString = "PayPal";
        }
    }

    public String updateText() {
        return "Your order of " + this.cart.toString() + " is ready! You chose to pay using " + this.paymentString + " and your order will be delivered via " + this.deliveryString + ".";
    }

    public void notifyUsers() {
        for (User user : this.users) {
            user.update(this.updateText());
        }
    }

    public static Order QuickOrder() {
        return new Order();
    }

    public void order() {
        this.notifyUsers();
    }
}
