package com.company.vehicle;

import com.company.engine.Engine;

public class Automobile extends Vehicle {

    public Automobile (String model, Engine engine, Color color, float trunkSize) {
        super(model, engine, color);
        this.trunkSize = trunkSize;
    }

    private float trunkSize;

    @Override
    public void display() {
        super.display();
        System.out.println("Trunk Size: " + this.trunkSize + " liter");
    }
}
