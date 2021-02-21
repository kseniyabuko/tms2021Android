package com.home;

public class MilitaryAirTransport extends AirTransport {

    private boolean hasCatapult;
    private int numberOfRockets;

    public MilitaryAirTransport(int horsePower, int maximumSpeed, int weight, String brand, int wingsPan, int minimumRunwayLength, boolean hasCatapult, int numberOfRockets) {
        super(horsePower, maximumSpeed, weight, brand, wingsPan, minimumRunwayLength);
        this.hasCatapult = hasCatapult;
        this.numberOfRockets = numberOfRockets;
    }

    public void info() {
        super.info();
        System.out.println(", наличие системы катапультирования: " + this.hasCatapult + ", количество ракет на борту: " + this.numberOfRockets);
    }

    public void eject() {
        if (this.hasCatapult) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }

    public void shoot() {
        if (this.numberOfRockets > 0) {
            System.out.println("Ракета пошла");
            this.numberOfRockets--;
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }

    }

    public boolean isHasCatapult() {
        return hasCatapult;
    }

    public void setHasCatapult(boolean hasCatapult) {
        this.hasCatapult = hasCatapult;
    }

    public int getNumberOfRockets() {
        return numberOfRockets;
    }

    public void setNumberOfRockets(int numberOfRockets) {
        this.numberOfRockets = numberOfRockets;
    }
}