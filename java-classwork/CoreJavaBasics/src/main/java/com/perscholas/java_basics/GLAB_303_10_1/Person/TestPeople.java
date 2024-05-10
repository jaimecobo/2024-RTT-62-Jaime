package com.perscholas.java_basics.GLAB_303_10_1.Person;

public class TestPeople {

    /*
    Lab Overview:
    In this lab, we will demonstrate more in-depth how to use Object type-casting and inheritance using Java.
    Objective:
    By the end of this lab, learners will be able to:
    Describe inheritance in Java
    Identify the object Type casting in Java
    Utilize Inheritance and Object Type Casting
     */
    public static void main(String args[]) {
        Person aPerson;
        Boy jimmy;
        Girl betty;
        aPerson = new Person("Fred");
        jimmy = new Boy();
        betty = new Girl("Betty");

        // Boy b = new Person();  // Throw Error
        // Girl g = new Person()  // Throw Error
        System.out.println(aPerson);
        System.out.println(aPerson.talk());
        System.out.println(aPerson.walk());
        System.out.println();

        System.out.println(jimmy);
        System.out.println(jimmy.talk());
        System.out.println(jimmy.walk());
        System.out.println();

        System.out.println(betty);
        System.out.println(betty.talk());
        System.out.println(betty.walk());
        System.out.println();

        System.out.println((Person)jimmy);
        System.out.println(((Person)jimmy).talk());
        System.out.println(((Person)jimmy).walk());
        System.out.println();

        System.out.println((Person)betty);
        System.out.println(((Person)betty).talk());
        System.out.println(((Person)betty).walk());
        System.out.println();

        System.out.println(Person.lifeSpan());
        System.out.println(Boy.lifeSpan());
        System.out.println(Girl.lifeSpan());

//        System.out.println(((Boy)aPerson).talk());     // Exception: Person cannot be cast to class Boy
    }

}
/*
The lifespan() method did not work in the way expected. That is because for class methods, method look-ups occur at compile time.
The lifeSpan() method in the Person class is used by both the Boy and Person classes.
In this case, since the method is static and is declared in the Person class, the ageFactor from the Person class is used.
However, the Girl class has its own lifeSpan() method, so the ageFactor within the Girl class is used in that case.
 */
