package com.home;

public class CivilAirTransport extends AirTransport {

    private int numberOfPassengers;
    private boolean isBusinessClass;

    public CivilAirTransport(int horsePower, int maximumSpeed, int weight, String brand, int wingsPan, int minimumRunwayLength, int numberOfPassengers, boolean isBusinessClass) {
        super(horsePower, maximumSpeed, weight, brand, wingsPan, minimumRunwayLength);
        this.numberOfPassengers = numberOfPassengers;
        this.isBusinessClass = isBusinessClass;
    }

    public void info() {
        super.info();
        System.out.println(", количество пассажжиров: " + this.numberOfPassengers + ", бизнесс класс: " + this.isBusinessClass);
    }

    public void checkCapacity(int numberOfRegisteredPassengers) {
        if (numberOfRegisteredPassengers <= this.numberOfPassengers) {
            System.out.println("Самолет готов к вылету");
        } else {
            System.out.println("Самолет перегружен");
        }
    }


    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public boolean isBusinessClass() {
        return isBusinessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        isBusinessClass = businessClass;
    }
}