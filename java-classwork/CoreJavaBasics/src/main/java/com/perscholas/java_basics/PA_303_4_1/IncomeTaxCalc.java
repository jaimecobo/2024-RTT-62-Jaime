package com.perscholas.java_basics.PA_303_4_1;

import java.util.Scanner;

public class IncomeTaxCalc {
    /*
    7. Create a program that lets the users input their filing status and income. Display how much tax the user would have to pay according to status and income.
    The U.S. federal personal income tax is calculated based on the filing status and taxable income.
    There are four filing statuses: Single, Married Filing Jointly, Married Filing Separately, and Head of Household.
    The tax rates for 2009 are shown below.
     */
    public static void main(String[] args) {
        double income = 1000000;
        double incomeTax = 0;
        int status = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number corresponding to your status, as described bellow." +
                "\n 1) Single" +
                "\n 2) Married Filing Jointly or Qualifying Widow(er)" +
                "\n 3) Married Filing Separately" +
                "\n 4) Head of Household");

        status = sc.nextInt();
        if(status < 1 || status > 4) {
            System.out.println("Invalid status, please exit and try again!");
        }
        System.out.println("Enter your total income: ");
        income = sc.nextDouble();
        if (income < 0) {
            System.out.println("Income can't be negative");
        }
        else {
                if (status == 1) {
                    if (income <= 8350) {
                        incomeTax = income * 0.1;
                    } else if (income <= 33950) {
                        incomeTax = income * 0.15;
                    } else if (income <= 82250) {
                        incomeTax = income * 0.25;
                    } else if (income <= 171550) {
                        incomeTax = income * 0.28;
                    } else if (income <= 372950) {
                        incomeTax = income * 0.33;
                    } else {
                        incomeTax = income * 0.35;
                    }
                    System.out.println("As single with a total income of " + String.format("%.2f", income) +
                            ", your income tax is " + String.format("%.2f", incomeTax));
                }

        }
    }
}

