package com.company.factory;

import com.company.engine.Engine;
import com.company.vehicle.Color;
import com.company.engine.Metric;
import com.company.vehicle.Vehicle;

public abstract class AbstractFactory {

    public static AbstractFactory getFactory(String choice) {

        if (choice.equalsIgnoreCase("VEHICLE")) {
            return (new VehicleFactory());
        }
        else if (choice.equalsIgnoreCase("ENGINE")) {
            return (new EngineFactory());
        }
        else {
            return (null);
        }
    }

    public abstract Engine createEngine(float power, Engine.EngineType type, Metric metric);
    public abstract Vehicle createVehicle(Vehicle.VehicleType type, String model, Engine engine, Color color, float trunkSize);
}
