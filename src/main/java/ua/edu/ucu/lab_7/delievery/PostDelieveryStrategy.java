package ua.edu.ucu.lab_7.delievery;

import java.util.LinkedList;

import ua.edu.ucu.lab_7.flower.Item;

public class PostDelieveryStrategy implements Delievery {
    
    @Override
    public void deliever(LinkedList<Item> items) {
        System.out.println("Delivering order via Post:");
        for (Item item : items) {
            System.out.println("- " + item.getDescription());
        }
        System.out.println("Order delivered by Post!");
    }
}
