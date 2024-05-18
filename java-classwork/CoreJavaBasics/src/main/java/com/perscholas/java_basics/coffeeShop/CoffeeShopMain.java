package com.perscholas.java_basics.coffeeShop;

import java.util.Scanner;

public class CoffeeShopMain {
    private CoffeeShop coffeeShop;
    private Scanner scanner = new Scanner(System.in);


    public int printMenu() {
        System.out.println();
        System.out.println("0) Exit");
        System.out.println("1) Print the list of products");
        System.out.println("2) Print the list of products under $3");
        System.out.println("4) Order a product");
        System.out.println("5) Checkout");

        System.out.print("Enter your choice ");
        int option = scanner.nextInt();

        return option;
    }

    public void runCoffeeShop() {
        coffeeShop = new CoffeeShop();
        coffeeShop.initProducts();
//        coffeeShop.printProducts();

        while(true) {
            boolean value = true;
            int option = printMenu();

            if ( option == 0 ) {
                System.exit(0);
            } else if ( option == 1 ) {
                coffeeShop.printProducts();
            }else if( option == 2 ) {
                coffeeShop.printProductsUnder3();
            }
        }
    }

    // we only have 1 public static void main for the whole coffee shop project
    // this will be the way the program starts up
    public static void main(String[] args) {
        CoffeeShopMain coffeeShopMain = new CoffeeShopMain();
        coffeeShopMain.runCoffeeShop();
    }

}
