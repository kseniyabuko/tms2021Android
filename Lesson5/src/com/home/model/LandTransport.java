package com.home.model;

public class LandTransport extends Transport {

    private int numberOfWheels;
    private double fuelConsumption;

    public LandTransport(int horsePower, int maximumSpeed, int weight, String brand, int numberOfWheels, double fuelConsumption) {
        super(horsePower, maximumSpeed, weight, brand);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public void info (){
        super.info();
        System.out.print(", количество колес: " + this.numberOfWheels + ", расход топлива: " + this.fuelConsumption);
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}