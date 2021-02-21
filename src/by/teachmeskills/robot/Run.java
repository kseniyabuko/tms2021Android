package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.SamsungHand;
import by.teachmeskills.robot.hands.SonyHand;
import by.teachmeskills.robot.hands.ToshibaHand;
import by.teachmeskills.robot.heads.SamsungHead;
import by.teachmeskills.robot.heads.SonyHead;
import by.teachmeskills.robot.heads.ToshibaHead;
import by.teachmeskills.robot.legs.SamsungLeg;
import by.teachmeskills.robot.legs.SonyLeg;
import by.teachmeskills.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

        SamsungHand samsungHand1 = new SamsungHand(140);
        SonyHand sonyHand1 = new SonyHand(115);
        ToshibaHand toshibaHand1 = new ToshibaHand(130);

        SamsungHead samsungHead1 = new SamsungHead(220);
        SonyHead sonyHead1 = new SonyHead(210);
        ToshibaHead toshibaHead1 = new ToshibaHead(290);

        SamsungLeg samsungLeg1 = new SamsungLeg(310);
        SonyLeg sonyLeg1 = new SonyLeg(380);
        ToshibaLeg toshibaLeg1 = new ToshibaLeg(340);

        Robot robot1 = new Robot(samsungHead1, toshibaHand1, toshibaLeg1);
        robot1.action();
        int robot1Price = robot1.getPrice();
        System.out.println(robot1Price);

        Robot robot2 = new Robot(toshibaHead1, sonyHand1, samsungLeg1);
        robot2.action();
        int robot2Price = robot2.getPrice();
        System.out.println(robot2Price);

        Robot robot3 = new Robot(sonyHead1, samsungHand1, sonyLeg1);
        robot3.action();
        int robot3Price = robot3.getPrice();
        System.out.println(robot3Price);


        if (robot1Price > robot2Price && robot1Price > robot3Price) {
            System.out.println("Price of Robot1 is max");
        } else if (robot2Price > robot1Price && robot2Price > robot3Price) {
            System.out.println("Price of Robot2 is max");
        } else
            System.out.println("Price of Robot3 is max");
    }


}
