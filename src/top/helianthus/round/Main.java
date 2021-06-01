package top.helianthus.round;

public class Main {
    public static void main(String[] args) {
        // 正方形
        Square square = new Square(20);
        // 周长
        System.out.println(square.getCircum());
        // 面积
        System.out.println(square.getArea());


        // 原形
        Circle circle = new Circle(15);
        // 周长
        System.out.println(circle.getCircum());
        // 面积
        System.out.println(circle.getArea());

    }
}
