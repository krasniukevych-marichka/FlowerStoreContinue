package ua.edu.ucu.lab_7.flower;

import java.util.LinkedList;

import ua.edu.ucu.lab_7.delievery.Delievery;
import ua.edu.ucu.lab_7.payment.Payment;

public class Order {

    private LinkedList<Item> items;
    private Delievery delievery;
    private Payment payment;

    public Order() {
        this.items = new LinkedList<>();
    }

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDelieveryStrategy(Delievery delievery) {
        this.delievery = delievery;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Item item : items) {
            total += item.price();
        }
        return total;
    }

    public void processOrder() {
        payment.pay(calculateTotalPrice());
        delievery.deliever(items);
    }
    
}
