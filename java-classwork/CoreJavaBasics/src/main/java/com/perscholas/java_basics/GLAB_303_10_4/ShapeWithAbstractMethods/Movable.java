package com.perscholas.java_basics.GLAB_303_10_4.ShapeWithAbstractMethods;

public interface Movable {
    // An interface defines a list of public abstract methods to be implemented by the subclasses
    void moveUp();    // "public" and "abstract" by default
    void moveDown();
    void moveLeft();
    void moveRight();
    String getCoordinate();
}
/*
Similar to an abstract class, an Interface cannot be instantiated because it is incomplete (the abstract method’s body is missing).
To use an interface, you must derive subclasses and provide implementation to all of the abstract methods declared in the interface.
The subclasses are now complete and can be instantiated.
To derive subclasses from an interface, a new keyboard "implement" is to be used instead of "extends" for deriving subclasses from an ordinary class
or an abstract class. It is important to note that the subclass implementing an interface needs to override ALL abstract methods defined in the interface;
otherwise, the subclass cannot be compiled.
 */