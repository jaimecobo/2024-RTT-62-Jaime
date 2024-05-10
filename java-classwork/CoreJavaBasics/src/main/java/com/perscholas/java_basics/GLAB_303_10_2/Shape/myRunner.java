package com.perscholas.java_basics.GLAB_303_10_2.Shape;

public class myRunner {
    /*
    Introduction:
    In this lab, we will demonstrate how to achieve Polymorphism using Inheritance, Overriding, Object Type Casting, Encapsulation, and instanceOF objects.
    Objective:
    By the end of this lab, learners will be able to use Polymorphism concepts using Inheritance, Encapsulation, and instanceOF objects.
    One of the key features of Inheritance is that a reference variable (Object) of a superclass type can point to an object of its subclass.
    Polymorphism is the art of taking advantage of this simple but powerful and versatile feature.
    Consider the following illustration:
    Suppose that our program uses many kinds of Shapes, such as triangles, rectangles, and so on.
    We should design a superclass called ShapeAbstract, which defines the public (common) behaviors of all the shapes.
    For example, we would like all shapes to have a method called getArea(), which returns the area of that particular shape.
     */
    public static void main(String[] args) {
        Circle c = new Circle(100);
        System.out.println("Area of Circle " + c.getArea());

        // Example of Object type casting
        // declaration of object variable obj of the ShapeAbstract class

        // ShapeAbstract sObj ; // object creation of the ShapeAbstract class
        Shape sObj = new Shape();
        sObj.displayshapName();
        System.out.println(sObj instanceof Shape); // true


        // object creation of the Circle class
        System.out.println("+++++++++");

        // it’s fine because a Circle is a ShapeAbstract by inheritance
        Shape shapeCircleObj = new Circle(100);  // UpCasting
        shapeCircleObj.displayshapName();
        System.out.println("Area of Circle " + shapeCircleObj.getArea());
        System.out.println(shapeCircleObj);  // Run circle's toString()
        // Use instanceof operator for Validation
        System.out.println(shapeCircleObj instanceof Circle); // true
        System.out.println(sObj instanceof Circle); // false because ShapeAbstract is not a Circle

        System.out.println("--------------------");
        Shape shapeRectangleObj = new Rectangle("Red"); //UpCasting
        shapeRectangleObj.displayshapName();
        shapeRectangleObj.setHeight(2);
        shapeRectangleObj.setWidth(2);
        System.out.println("Area of Rectangle is " + shapeRectangleObj.getArea());
        System.out.println(shapeRectangleObj);  // Run Rectangle's toString()
        // Use instanceof operator for Validation
        System.out.println(shapeRectangleObj instanceof Rectangle); // true
        System.out.println(sObj instanceof Rectangle); // false because ShapeAbstract is not a Rectangle
        System.out.println("--------------------");
        Shape shapeTriangleObj = new Triangle("Blue"); //UpCasting
        shapeTriangleObj.displayshapName();
        shapeTriangleObj.setHeight(2);
        shapeTriangleObj.setBase(3);
        System.out.println("Area of Triangle is " + shapeTriangleObj.getArea());
        System.out.println(shapeTriangleObj);  // Run Triangle's toString()

        // Use instanceof operator for Validation
        System.out.println(shapeTriangleObj instanceof Triangle); // true
        System.out.println(sObj instanceof Triangle); // false because ShapeAbstract is not a Triangle
        System.out.println("--------------------");

        Cylinder cylinderShape = new Cylinder(3); //UpCasting
        cylinderShape.displayshapName();
        cylinderShape.setHeight(3);
        System.out.println("Area of Cylinder is " + cylinderShape.getVolumne());
        System.out.println(cylinderShape);  // Run cylinderShape's toString()
    }

}

/*
In the above example, we have created objects of the ShapeAbstract class:  sObj, shapeCircleObj, shapeRectangleObj, and shapeTriangleObj.
These objects are polymorphic variables.
We can summarize this by stating that Superclass reference variables are polymorphic reference variables.
They can refer to objects of their own class or objects of the subclasses inherited from their class.
The instanceof operator is a Boolean operator that tests whether an object belongs to a given class.
 */
