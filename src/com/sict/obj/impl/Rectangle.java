package com.sict.obj.impl;

import com.sict.obj.Shape;

public class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 2;
        this.width = 1;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    // area 矩形的面积
    @Override
    public double area() {
        return this.length * this.width;
    }
}
