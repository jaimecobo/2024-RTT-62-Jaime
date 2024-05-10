package com.perscholas.java_basics.GLAB_303_10_1.Shape.Abstraction;

public class MyRunner {
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
