package ua.edu.ucu.lab_7;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

import ua.edu.ucu.lab_7.delievery.DHLDelieveryStrategy;
import ua.edu.ucu.lab_7.delievery.PostDelieveryStrategy;
import ua.edu.ucu.lab_7.flower.Flower;
import ua.edu.ucu.lab_7.flower.FlowerPack;
import ua.edu.ucu.lab_7.flower.Item;

public class DelieveryTests {
    @Test
    void testPostDelivery() {
        PostDelieveryStrategy postDelivery = new PostDelieveryStrategy();
        LinkedList<Item> items = new LinkedList<>();
        items.add(new Flower());
        assertDoesNotThrow(() -> postDelivery.deliever(items));
    }

    @Test
    void testDHLDelivery() {
        DHLDelieveryStrategy dhlDelivery = new DHLDelieveryStrategy();
        LinkedList<Item> items = new LinkedList<>();
        items.add(new Flower());
        assertDoesNotThrow(() -> dhlDelivery.deliever(items));
    }
}
