package com.home.model;

public class Transport {

    private int horsePower;
    private int maximumSpeed;
    private int weight;
    private String brand;

    public Transport() {
    }

    public Transport(int horsePower, int maximumSpeed, int weight, String brand) {
        this.horsePower = horsePower;
        this.maximumSpeed = maximumSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    public void info (){
        System.out.print("Характеристики: мощность: " + this.horsePower + ", максимальная скорость: " + this.maximumSpeed + ", масса: " + this.weight + ", марка: " + this.brand);
    }


    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(int maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
