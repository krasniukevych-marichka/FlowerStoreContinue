package ua.edu.ucu.lab_7.flower;

public abstract class ItemDecorator extends Item {
    protected Item item;

    public ItemDecorator(Item item) {
        this.item = item;
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }

    @Override
    public abstract double price();
    
}
