package ua.edu.ucu.lab_7.flower;

public class BasketDecorator extends ItemDecorator {

    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public double price() {
        return 4 + item.price();
    }

    @Override
    public String getDescription() {
        return item.getDescription() + " + Basket";
    }
}
