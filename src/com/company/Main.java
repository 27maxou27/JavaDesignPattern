package com.company;

import com.company.decorator.OptionA;
import com.company.decorator.OptionB;
import com.company.engine.Engine;
import com.company.vehicle.Color;
import com.company.engine.Metric;
import com.company.factory.AbstractFactory;
import com.company.vehicle.Vehicle;

public class Main {

    public static void main(String[] args) {
        // Test de la partie 1 du TP
        AbstractFactory vehicleFactory = AbstractFactory.getFactory("VEHICLE");
        AbstractFactory engineFactory = AbstractFactory.getFactory("ENGINE");

        assert engineFactory != null;
        assert vehicleFactory != null;

        // Création des moteurs
        Engine gasEngine = engineFactory.createEngine(120, Engine.EngineType.GAS, Metric.HORSEPOWER);
        Engine electricEngine = engineFactory.createEngine(45, Engine.EngineType.ELECTRIC, Metric.KILOWATT);

        // Création des véhicules
        Vehicle automobile = vehicleFactory.createVehicle(Vehicle.VehicleType.AUTOMOBILE, "Tesla Cybertruck", electricEngine, Color.GREY, 420);
        Vehicle scooter = vehicleFactory.createVehicle(Vehicle.VehicleType.SCOOTER, "KYMCO Agility", gasEngine, Color.BLACK, 0);

        // Ajout d'options
        Vehicle autoWithOptions = new OptionA(new OptionB(vehicleFactory.createVehicle(Vehicle.VehicleType.AUTOMOBILE, "Test", electricEngine, Color.RED, 300)));

        automobile.display();
        scooter.display();
        autoWithOptions.display();
        // Fin partie 1

        // -------------------------------------------------------------------------------------

        // Test de la partie 2 du TP
        GarageFacade garage = new GarageFacade();

        // Creation des véhicules
        Vehicle auto = garage.createAutomobile("Tesla CyberTruck", 75, Engine.EngineType.ELECTRIC, Color.GREY, 350);
        Vehicle scoot = garage.createScooter("Kymco Agility", 50, Engine.EngineType.GAS, Color.WHITE);

        // Affichage
        auto.display();
        scoot.display();

        // Ajout d'options
        auto = garage.addOptionB(auto);
        scoot = garage.addAllOptions(scoot);

        auto.display();
        scoot.display();
        // Fin partie 2
    }
}
