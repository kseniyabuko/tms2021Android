package by.teachmeskills.robot.hands;

public class SamsungHand implements IHand {
    private int price;

    public SamsungHand(int price) {
        this.price = price;
    }

    public SamsungHand() {
    }

    public void upHand() {
        System.out.println("Samsung hand is up");
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
