package top.helianthus.round;


public class Circle extends Shape{
    protected double radius;  // 半径
    final double PI = Math.PI;   // π   3.14.....

    Circle(double radius) {
        this.radius = radius;
    }

    // 求圆的面积
    @Override
    public double getArea() {
        return PI * (this.radius * this.radius);
    }

    @Override
    public double getCircum() {
        return PI * (2 * this.radius);
    }
}
