package com.company.decorator;

import com.company.engine.Engine;
import com.company.vehicle.Color;
import com.company.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public abstract class VehicleDecorator extends Vehicle {

    protected Vehicle decoratedVehicle;
    //protected ArrayList<String> options;

    public VehicleDecorator(Vehicle decoratedVehicle) {
        this.decoratedVehicle = decoratedVehicle;
        //this.options = new ArrayList<>();
    }

    @Override
    public void display() {
        decoratedVehicle.display();
    }

    public void addOption(String option) {
        System.out.println(option);
    }
}
