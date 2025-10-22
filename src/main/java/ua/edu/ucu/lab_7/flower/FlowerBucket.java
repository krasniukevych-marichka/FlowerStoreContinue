package ua.edu.ucu.lab_7.flower;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket extends Item{

    private List<FlowerPack> flowerPacks;

    public FlowerBucket() {
        this.flowerPacks = new ArrayList<>();
        this.description = "Flower bucket";
    }

    public void add(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public double price() {
        return flowerPacks.stream()
        .mapToDouble(pack -> pack.getPrice())
        .sum();
    }

    public boolean searchFLower(Flower sampFlower) {
        for (FlowerPack flowerPack: flowerPacks) {
            Flower flower = flowerPack.getFlower();
            if (flower.equals(sampFlower)) {
                return true;
            }
        }
        return false;
    }
}
