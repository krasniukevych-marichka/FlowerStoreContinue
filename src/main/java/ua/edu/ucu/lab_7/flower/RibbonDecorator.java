package ua.edu.ucu.lab_7.flower;

public class RibbonDecorator extends ItemDecorator {

    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public double price() {
        return 40 + item.price();
    }

    @Override
    public String getDescription() {
        return item.getDescription() + " + Ribbon";
    }
}
