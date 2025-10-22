package ua.edu.ucu.lab_7.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.lab_7.flower.Flower;
import ua.edu.ucu.lab_7.flower.FlowerColor;
import ua.edu.ucu.lab_7.flower.FlowerType;

@RestController
@RequestMapping("/flowers")
public class FlowerController {

    @GetMapping
    public List<Flower> getFlowers() {
        return List.of(new Flower(100, FlowerColor.RED, 100, FlowerType.CHAMOMILE));
    }
    
}
