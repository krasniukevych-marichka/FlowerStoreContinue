package ua.edu.ucu.lab_7.flower;

public class PaperDecorator extends ItemDecorator {

    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public double price() {
        return 13 + item.price();
    }

    @Override
    public String getDescription() {
        return item.getDescription() + " + Paper";
    }
    
}
