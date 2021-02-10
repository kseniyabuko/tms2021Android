package com.home.model;

public class FreightLandTransport extends LandTransport {

    private double cargoCapacity;

    public FreightLandTransport(int horsePower, int maximumSpeed, int weight, String brand, int numberOfWheels, double fuelConsumption, double cargoCapacity) {
        super(horsePower, maximumSpeed, weight, brand, numberOfWheels, fuelConsumption);
        this.cargoCapacity = cargoCapacity;
    }

    public void info (){
        super.info();
        System.out.println(", грузоподъемность: " + this.cargoCapacity);
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public void checkCargoCapacity(double cargo) {
        if (cargo <= this.cargoCapacity) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }

}