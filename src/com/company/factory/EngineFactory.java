package com.company.factory;

import com.company.engine.ElectricEngine;
import com.company.engine.GasEngine;
import com.company.engine.Engine;
import com.company.vehicle.Color;
import com.company.engine.Metric;
import com.company.vehicle.Vehicle;

public class EngineFactory extends AbstractFactory {

    @Override
    public Engine createEngine(float power, Engine.EngineType type, Metric metric) {

        if (type == null) {
            return null;
        }

        switch (type) {
            case ELECTRIC:
                return new ElectricEngine(power, type, metric);
            case GAS:
                return new GasEngine(power, type, metric);
            default:
                return null;
        }
    }

    @Override
    public Vehicle createVehicle(Vehicle.VehicleType type, String model, Engine engine, Color color, float trunkSize) {
        return null;
    }
}
