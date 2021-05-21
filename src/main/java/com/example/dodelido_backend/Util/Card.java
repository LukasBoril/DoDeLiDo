package com.example.dodelido_backend.Util;

import com.example.dodelido_backend.Model.Animal;

public class Card {

    private final Color color;
    private final Animal animal;

    public Card(Animal animal_input, Color color_input) {
        animal = animal_input;
        color = color_input;
    }

    public String getColor(){
        String output;
        switch(color) {
            case BLUE:
                output = "blue";
                break;
            case YELLOW:
                output = "yellow";
                break;
            case GREEN:
                output = "green";
                break;
            case PINK:
                output = "pink";
                break;
            case WHITE:
                output = "white";
                break;
            default:
                System.out.println("Color not supported");
                output = null;
                break;
        }
        return output;
    }

    public String getAnimal(){
        String output;
        switch(animal) {
            case ZEBRA:
                output = "zebra";
                break;
            case PENGUIN:
                output = "penguin";
                break;
            case FLAMINGO:
                output = "flamingo";
                break;
            case TURTLE:
                output = "turtle";
                break;
            case CAMEL:
                output = "camel";
                break;
            default:
                System.out.println("Animal not supported");
                output = null;
                break;
        }
        return output;
    }
}


