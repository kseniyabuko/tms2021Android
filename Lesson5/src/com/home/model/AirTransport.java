package com.home.model;

public class AirTransport extends Transport{

    private int wingsPan;
    private int minimumRunwayLength;

    public AirTransport(int horsePower, int maximumSpeed, int weight, String brand, int wingsPan, int minimumRunwayLength) {
        super(horsePower, maximumSpeed, weight, brand);
        this.wingsPan = wingsPan;
        this.minimumRunwayLength = minimumRunwayLength;
    }

    public void info (){
        super.info();
        System.out.print(" , размах крыльев: " + this.wingsPan + ", минимальная длина полосы: " + this.minimumRunwayLength);
    }

    public int getWingsPan() {
        return wingsPan;
    }

    public void setWingsPan(int wingsPan) {
        this.wingsPan = wingsPan;
    }

    public int getMinimumRunwayLength() {
        return minimumRunwayLength;
    }

    public void setMinimumRunwayLength(int minimumRunwayLength) {
        this.minimumRunwayLength = minimumRunwayLength;
    }
}
