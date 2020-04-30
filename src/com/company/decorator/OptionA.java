package com.company.decorator;

import com.company.vehicle.Vehicle;

public class OptionA extends VehicleDecorator {

    public OptionA(Vehicle decoratedVehicle) {
        super(decoratedVehicle);
        //addOption("Option A");
    }

    @Override
    public void display() {
        super.display();
        addOption("Option A");
    }

    @Override
    public void addOption(String option) {
        super.addOption(option);
    }
}
