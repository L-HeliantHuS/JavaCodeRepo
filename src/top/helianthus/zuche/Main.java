package top.helianthus.zuche;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("大巴", "黑色", "正常");
        bus.getDescription();
        bus.rental();

        System.out.println();

        Train train = new Train("火车", "绿色", "正常", 500, 2000);
        train.getDescription();
        train.rental();
    }

}
