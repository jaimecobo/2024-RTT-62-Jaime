package com.perscholas.java_basics.GLAB_303_11_1.GenericMethod;

public class GenericMethod {
    // create a generics method
    public <T> void genericsMethod(T data) {
        System.out.println("Generics Method:");
        System.out.println("Data Passed: " + data);
    }
}
