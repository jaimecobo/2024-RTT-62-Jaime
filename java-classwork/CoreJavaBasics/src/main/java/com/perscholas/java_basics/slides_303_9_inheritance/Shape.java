package com.perscholas.java_basics.slides_303_9_inheritance;

//public class ShapeAbstract {
public abstract class Shape implements Perimeter{

    public static double area;
    private String name;

    // Abstract method has no implementation
    public abstract double calculateArea();       // if ShapeAbstract is not abstract and does not override abstract method calculateArea()
//    public double calculateArea(){
//        return 0;
//    };

    public Shape() {

    }

    public Shape(String name) {
        this.name = name;
    }

    protected void printName() {
        System.out.println("The name of the shape is " + name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
