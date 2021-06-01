package top.helianthus.round;

// Square 正方形
public class Square extends Shape {
    // 正方形需要定义
    protected double sideLength;

    Square(double sideLength) {
        this.sideLength = sideLength;
    }

    // 求正方形面积
    @Override
    public double getArea() {
        return this.sideLength * this.sideLength;
    }

    // 求正方形周长
    @Override
    public double getCircum() {
        return this.sideLength * 4;
    }
}
