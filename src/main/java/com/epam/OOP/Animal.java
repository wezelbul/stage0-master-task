package com.epam.OOP;

public class Animal {

    private String color;
    private  int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String paw;
        String yesNo;
        if (numberOfPaws == 1) {
            paw = "paw";
        } else {
            paw = "paws";
        }
        if (hasFur) {
            yesNo = "a";
        } else {
            yesNo = "no";
        }
        return  "This animal is mostly " + color + ". It has " + numberOfPaws + " " + paw + " and " + yesNo + " fur.";
    }
}
