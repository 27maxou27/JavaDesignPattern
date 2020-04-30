package com.company.factory;

import com.company.engine.Engine;
import com.company.vehicle.Color;
import com.company.engine.Metric;
import com.company.vehicle.Automobile;
import com.company.vehicle.Scooter;
import com.company.vehicle.Vehicle;

public class VehicleFactory extends AbstractFactory {

    @Override
    public Vehicle createVehicle(Vehicle.VehicleType type, String model, Engine engine, Color color, float trunkSize) {
        if (type == null) {
            return null;
        }

        switch (type) {
            case AUTOMOBILE:
                return (new Automobile(model, engine, color, trunkSize));
            case SCOOTER:
                return (new Scooter(model, engine, color));
            default:
                return null;
        }
    }

    @Override
    public Engine createEngine(float power, Engine.EngineType type, Metric metric) {
        return null;
    }
}
