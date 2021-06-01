package com.sict.obj.impl;

import com.sict.obj.Shape;

public class Circle implements Shape {
    private double radius;

    public Circle() {
        this.radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }


    // area 圆的面积
    @Override
    public double area() {
        return Math.PI * (this.radius * this.radius);
    }
}
