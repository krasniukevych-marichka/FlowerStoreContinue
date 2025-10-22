package ua.edu.ucu.lab_7.flower;

public abstract class Item {
    protected String description;

    public String getDescription() {
        return description;
    }

    public abstract double price();

    
}
