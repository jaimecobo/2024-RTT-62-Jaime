package com.perscholas.java_basics.slides_303_9_inheritance;

public class Rectangle extends Shape {

    private int length;
    private int width;

    public Rectangle() {

    }

    @Override
    public double calculateArea() {
        super.printName();
        area = 123;
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return (2*length) + (2*width);
    }

    public Rectangle(String name) {
        super(name);
    }

    protected void printName() {
        System.out.println("Rectangle is named rectangle ... rectangle mcrectface");
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

}