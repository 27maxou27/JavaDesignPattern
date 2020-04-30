package com.company;

import com.company.decorator.OptionA;
import com.company.decorator.OptionB;
import com.company.engine.Engine;
import com.company.engine.Metric;
import com.company.factory.AbstractFactory;
import com.company.factory.EngineFactory;
import com.company.factory.VehicleFactory;
import com.company.vehicle.Color;
import com.company.vehicle.Vehicle;

public class GarageFacade {

    private final AbstractFactory vehicleFactory;
    private final AbstractFactory engineFactory;

    public GarageFacade() {
        this.vehicleFactory = new VehicleFactory();
        this.engineFactory = new EngineFactory();
    }

    public Vehicle createAutomobile(String model, float power, Engine.EngineType type, Color color, float trunkSize) {
        Metric metric = (type == Engine.EngineType.GAS) ? Metric.HORSEPOWER : Metric.KILOWATT;
        Engine engine = this.engineFactory.createEngine(power, type, metric);
        Vehicle automobile = this.vehicleFactory.createVehicle(Vehicle.VehicleType.AUTOMOBILE, model, engine, color, trunkSize);

        return automobile;
    }

    public Vehicle createScooter(String model, float power, Engine.EngineType type, Color color) {
        Metric metric = (type == Engine.EngineType.GAS) ? Metric.CUBIC_CM : Metric.KILOWATT;
        Engine engine = this.engineFactory.createEngine(power, type, metric);
        Vehicle scooter = this.vehicleFactory.createVehicle(Vehicle.VehicleType.SCOOTER, model, engine, color, 0);

        return scooter;
    }

    public Vehicle addOptionA(Vehicle vehicle) {
        return (new OptionA(vehicle));
    }

    public Vehicle addOptionB(Vehicle vehicle) {
        return (new OptionB(vehicle));
    }

    public Vehicle addAllOptions(Vehicle vehicle) {
        return (addOptionB(addOptionA(vehicle)));
    }
}
