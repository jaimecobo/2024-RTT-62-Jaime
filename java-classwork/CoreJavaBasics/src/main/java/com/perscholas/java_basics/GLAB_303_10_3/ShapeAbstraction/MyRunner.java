package com.perscholas.java_basics.GLAB_303_10_1.ShapeAbstraction;

public class MyRunner {
    /*
    Lab Objective:
    In this lab, you will demonstrate the Java Abstraction and we will utilize the previous lab,
    By the end of this lab, learners will be able to use Java Abstraction in Java applications.
    Introduction:
    In the previous lab, we used examples of Shapes. We created Circle, Rectangle, and Triangle objects.
    The Shape class can only be used as a superclass for Inheritance and Polymorphism purposes; it cannot be used for objects.
    The class that is not used for creating objects is known as abstract.
    Using an abstract class, you can improve the Shape class that was shown in the previous lab.
    Since there is no meaningful concept of area for an undefined two-dimensional shape, the following version of the program declares getArea( )
    as an abstract method inside the Shape class. This means that all classes derived from the Shape class must override getArea( ).
    Remember that we cannot instantiate the Abstract class; so there is no need to create a Constructor in the Abstract class.
    We will remove the constructor from the Shape class and make a few changes in all subclasses accordingly.
    */
    public static void main(String[] args) {

        Circle c = new Circle(100);
        System.out.println("Area of Circle " + c.getArea());

        // ShapeAbstract sObj = new ShapeAbstract(); // This will give Error, we can not instantiate Abstract class

        // object creation of the Circle class
        System.out.println("+++++++++++++++++");
        // it’s fine because a Circle is a ShapeAbstract by inheritance
        ShapeAbstract shapeAbstractCircleObj = new Circle(100);  // UpCasting
        shapeAbstractCircleObj.displayshapName();
        System.out.println("Area of Circle " + shapeAbstractCircleObj.getArea());
        System.out.println(shapeAbstractCircleObj);  // Run circle's toString()
        // Use instanceof operator for Validation
        System.out.println(shapeAbstractCircleObj instanceof Circle); // true

        System.out.println("+++++++++++++++++");
        ShapeAbstract shapeAbstractRectangleObj = new Rectangle("Red"); //UpCasting
        shapeAbstractRectangleObj.displayshapName();
        shapeAbstractRectangleObj.setHeight(2);
        shapeAbstractRectangleObj.setWidth(4);
        System.out.println("Area of Rectangle is " + shapeAbstractRectangleObj.getArea());
        System.out.println(shapeAbstractRectangleObj);  // Run Rectangle's toString()
        // Use instanceof operator for Validation
        System.out.println(shapeAbstractRectangleObj instanceof Rectangle); // true

        System.out.println("--------------------");
        ShapeAbstract shapeAbstractTriangleObj = new Triangle("Blue"); //UpCasting
        shapeAbstractTriangleObj.displayshapName();
        shapeAbstractTriangleObj.setHeight(10);
        shapeAbstractTriangleObj.setBase(15);
        System.out.println("Area of Triangle is " + shapeAbstractTriangleObj.getArea());
        System.out.println(shapeAbstractTriangleObj);  // Run Triangle's toString()
    }

}
