package com.perscholas.java_basics.slides_303_9_inheritance;
public class Shape {
    public static double area;

    private String name;

    public Shape() {

    }

    public Shape(String name) {
        this.name = name;
    }

    protected void printName() {
        System.out.println("The name of the shape is " + name);
    }

    //public abstract double calculateArea();       Shape is not abstract and does not override abstract method calculateArea()
    public double calculateArea(){
        return 0;
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
