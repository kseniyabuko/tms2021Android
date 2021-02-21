package by.teachmeskills.robot.heads;

public class ToshibaHead implements IHead {
    private int price;

    public ToshibaHead(int price) {
        this.price = price;
    }

    public ToshibaHead() {
    }

    @java.lang.Override
    public void speak() {
        System.out.println("Toshiba head is speaking");
    }

    @java.lang.Override
    public int getPrice() {
        return this.price;
    }
}
