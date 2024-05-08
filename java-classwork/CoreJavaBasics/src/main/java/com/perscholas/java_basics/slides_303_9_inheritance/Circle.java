package com.perscholas.java_basics.slides_303_9_inheritance;

public class Circle extends Shape {


    private double diameter;

    public double calculateArea() {
        area = 456;
        return Math.PI * (diameter / 2) * (diameter / 2);
    }


    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
}