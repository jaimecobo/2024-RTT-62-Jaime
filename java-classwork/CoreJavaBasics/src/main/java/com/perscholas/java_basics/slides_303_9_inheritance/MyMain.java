package com.perscholas.java_basics.slides_303_9_inheritance;

import java.util.ArrayList;
import java.util.List;

public class MyMain {
    public static double PI = 3.14159;

    public static void main(String[] args ) {
        List<Shape> shapes = new ArrayList<>();

        Circle c = new Circle();
        c.setName("Circle");
        c.setDiameter(10.0);

        shapes.add(c);

        Rectangle r = new Rectangle("ReCtAnGlE");
        r.setLength(10);
        r.setWidth(5);

        shapes.add(r);


        for ( Shape shape : shapes ) {
            System.out.println("The area of " + shape.getName() + " equals " + shape.calculateArea());
        }

    }

}
