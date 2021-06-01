package com.sict.obj;

import com.sict.obj.impl.Circle;
import com.sict.obj.impl.Rectangle;

public class Test {
    public static void main(String[] args) {
        // 无参数圆
        Circle circle1 = new Circle();
        System.out.println("圆的半径为1时, 面积为" + circle1.area());

        // 有参数圆
        Circle circle2 = new Circle(5);
        System.out.println("圆的半径为5时, 面积为" + circle2.area());

        // 无参数矩形
        Rectangle rectangle1 = new Rectangle();
        System.out.println("矩形长为1, 宽为2时, 面积为" + rectangle1.area());

        // 有参数矩形
        Rectangle rectangle2 = new Rectangle(10, 20);
        System.out.println("矩形长为10, 宽为20时, 面积为" + rectangle2.area());

    }
}
