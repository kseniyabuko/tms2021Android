package com.home;

public class LightLandTransport extends LandTransport {

    private String bodyType;
    private int numberOfPassengers;

    public LightLandTransport(int horsePower, int maximumSpeed, int weight, String brand, int numberOfWheels, double fuelConsumption, String bodyType, int numberOfPassengers) {
        super(horsePower, maximumSpeed, weight, brand, numberOfWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.numberOfPassengers = numberOfPassengers;
    }

    public void info() {
        super.info();
        System.out.println(", тип кузова: " + this.bodyType + ", количество пассажиров: " +
                this.numberOfPassengers);
    }


    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public void calculateTrip(double timeOfTrip) {
        double distanceKm = timeOfTrip * getMaximumSpeed();
        double tripFuelConsumption = calculateTripFuelConsumption(distanceKm);
        System.out.println("За время " + timeOfTrip + " ч." + " автомобиль " + getBrand() +
                ", двигаясь с максимальной скоростью " + getMaximumSpeed() + " км/ч проедет " +
                distanceKm + " км и израсходует " + tripFuelConsumption + " литров топлива");
    }

    private double calculateTripFuelConsumption(double distanceKm) {
        return distanceKm * getFuelConsumption() / 100;

    }

}
