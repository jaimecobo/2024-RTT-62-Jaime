package com.perscholas.java_basics.GLAB_303_10_3.ShapeAbstraction;

public  class Rectangle extends ShapeAbstract {

    public Rectangle(String color) {
        super.color = color;
    }

    public Rectangle() {
    }
    public Rectangle(String color, double width, double height) {
        super.height = height;
        super.width = width;
        super.color = color;
    }
    @Override
    public double getArea() {
        return super.width *  super.height;
    }
    //Overriding method of base class with different implementation
    @Override
    public void displayshapName() {
        System.out.println("I am a Rectangle"  );
    }
    @Override
    public String toString() {
        return "Rectangle[height=" + height + ",width=" + width + "," + super.toString() + "]";
    }
}

