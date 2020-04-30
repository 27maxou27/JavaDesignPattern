package com.company.vehicle;

import com.company.engine.Engine;

import java.util.ArrayList;

public abstract class Vehicle {

    public Vehicle() {}

    public Vehicle(String model, Engine engine, Color color) {
        this.model = model;
        this.engine = engine;
        this.color = color;
    }

    protected String model;
    protected Engine engine;
    protected Color color;

    public void display() {
        System.out.println("\n--- Vehicle Info ---");
        System.out.println("Type:\t" + this.getClass().getSimpleName());
        System.out.println("Model:\t" + this.model);
        System.out.println("Color:\t" + this.color.getText());
        this.engine.display();
    };

    public enum VehicleType {
        AUTOMOBILE("Automobile"),
        SCOOTER("Scooter");

        private String txt;

        VehicleType(String txt) {
            this.txt = txt;
        }

        public String getText() {
            return txt;
        }
    }
}
