package com.company.decorator;

import com.company.vehicle.Vehicle;

public class OptionB extends VehicleDecorator {

    public OptionB(Vehicle decoratedVehicle) {
        super(decoratedVehicle);
        //addOption("Option B");
    }

    @Override
    public void display() {
        super.display();
        addOption("Option B");
    }

    @Override
    public void addOption(String option) {
        super.addOption(option);
    }
}
