package by.teachmeskills.robot.heads;

public class SamsungHead implements IHead {
    private int price;

    public SamsungHead(int price) {
        this.price = price;
    }

    public SamsungHead() {
    }

    @Override
    public void speak() {
        System.out.println("Samsung head is speaking");
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
