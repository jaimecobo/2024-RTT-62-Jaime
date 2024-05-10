package com.perscholas.java_basics.PA_303_10_1.GameApp;

/*
Inheritance: In the Java language, classes can be derived from other classes, thereby inheriting fields and methods from those classes.
A class that is derived from another class is called a subclass (also a derived class, extended class, or child class).
The class from which the subclass is derived is called a superclass (also a base class or a parent class).
Polymorphism: When a superclass reference is used to refer to a subclass object.
 */

public class Monster {
    private String name;

    public Monster(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String attack(){
       return "!^_&^$@+%$* I don't know how to attack!";
    }
}
