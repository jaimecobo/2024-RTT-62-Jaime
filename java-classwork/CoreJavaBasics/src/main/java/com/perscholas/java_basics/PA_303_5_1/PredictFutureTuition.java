package com.perscholas.java_basics.PA_303_5_1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PredictFutureTuition {
    /*
    Predict Future Tuition
    Suppose the tuition for a university is $10,000 for the current year and increases by 7 percent every year.
    In how many years will the tuition be doubled?
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your tuition:");
        double tuition = sc.nextDouble();
        double tuition2 = tuition * 2;
        int yearsCounter = 0;
        while(tuition < tuition2){
            tuition += tuition * 0.07;
            yearsCounter++;
        }
        System.out.println(" Your tuition will be doubled in " + (yearsCounter-1) +"-ish years.");
        System.out.println("===============================================");

        System.out.print("Regardless of the initial tuition, the number of years it will take to double it at a rate of 7 percent, " +
                "will always be: ");
        double years = 72.0/7.0;
        System.out.println(String.format("%.2f", years) + " years.");




    }
}
