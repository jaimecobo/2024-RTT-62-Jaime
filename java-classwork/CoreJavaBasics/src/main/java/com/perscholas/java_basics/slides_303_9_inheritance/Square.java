package com.perscholas.java_basics.slides_303_9_inheritance;
public class Square extends Shape{
    private int width;

    @Override
    public double calculateArea() {
        return width * width;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

}
