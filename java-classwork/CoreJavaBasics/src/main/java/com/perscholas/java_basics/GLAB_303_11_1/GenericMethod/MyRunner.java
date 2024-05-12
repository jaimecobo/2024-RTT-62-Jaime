package com.perscholas.java_basics.GLAB_303_11_1.GenericMethod;

public class MyRunner {
    /*
    Java Generics Method
    We can create a method that can be used with any type of data. That method is known as the Generics Method.
    */
    public static void main(String[] args) {
        // initialize the class with Integer data
        GenericMethod dObj = new GenericMethod();
        dObj.genericsMethod(25); // passing int
        dObj.genericsMethod("Per Scholas"); // passing String
        dObj.genericsMethod(2563.5); // passing float
        dObj.genericsMethod('H'); // passing Char
    }
}
/*
In the above example, we have created a generic method named genericsMethod.
public <T> void genericMethod(T data) {...}
Here, the type parameter <T> is inserted after the public modifier and before the return type void.
We can call the generics method by placing the actual type <String> and <Integer> inside the bracket before the method name.
 */