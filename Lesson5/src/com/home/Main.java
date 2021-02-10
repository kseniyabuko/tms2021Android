package com.home;

import com.home.model.CivilAirTransport;
import com.home.model.FreightLandTransport;
import com.home.model.LightLandTransport;
import com.home.model.MilitaryAirTransport;

public class Main {

    public static void main(String[] args) {

// testing LightLandTransport class
        LightLandTransport kseniyasCar = new LightLandTransport(120, 210, 1500, "Szkoda", 4, 5, "sedan", 4);
        double timeOfTrip = 2.5;
        kseniyasCar.calculateTrip(timeOfTrip);
        kseniyasCar.info();

// testing FreightLandTransport
        FreightLandTransport truck = new FreightLandTransport(320, 150, 11500, "Belaz", 32, 15.0, 15000);
        double cargo = 4.9;
        truck.checkCargoCapacity(cargo);
        truck.info();

// testing CivilAirTransport
        CivilAirTransport boeing777 = new CivilAirTransport(10000, 900, 75500, "Boeing", 120, 2500, 400, true);
        boeing777.info();
        int numberOfRegisteredPassengers = 201;
        boeing777.checkCapacity(numberOfRegisteredPassengers);

// testing MilitaryAirTransport
        MilitaryAirTransport f22 = new MilitaryAirTransport(12000, 1500, 33500, "Lockheed", 32, 1200, true, 10);
        f22.info();
        f22.eject();
        while (f22.getNumberOfRockets() >= 0) {
            f22.shoot();
        }
    }
}

