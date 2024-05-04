package com.perscholas.java_basics;

public class UsingEnumExample {
    public static void main(String args[]) {
        // Declaring Enum variable
        Cars c;
        c = Cars.AUDI;
        // Switch keyword
        switch (c) {
            // Case statements
            case BMW:
                System.out.println("You choose BMW !");
                break;
            case JEEP:
                System.out.println("You choose JEEP !");
                break;
            case AUDI:
                System.out.println("You choose AUDI !");
                break;
            case VOLKSWAGON:
                System.out.println("You choose VOLKSWAGON !");
                break;
            case NANO:
                System.out.println("You choose NANO !");
                break;
            case FIAT:
                System.out.println("You choose FIAT !");
            default:
                System.out.println("NEW BRAND'S CAR.");
                break;
        }

    }
}
