package ua.edu.ucu.lab_7.flower;

import lombok.NoArgsConstructor;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Flower extends Item{
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;

    public String getColor() {
        return color.toString();
    }

    public Flower(Flower other) {
        this.color = other.color;
        this.flowerType = other.flowerType;
        this.sepalLength = other.sepalLength;
        this.price = other.price;
        this.description = other.description;
    }

    @Override
    public double price() {
        return price;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
