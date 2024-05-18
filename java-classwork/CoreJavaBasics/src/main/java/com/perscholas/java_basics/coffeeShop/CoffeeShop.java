package com.perscholas.java_basics.coffeeShop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CoffeeShop {
    private List<Product> products = new ArrayList<>();

    // building the menu of products for sale at the coffee shop
    public void initProducts() {
        Product p1 = new Product();
        p1.setPrice(5.46);
        p1.setName("Small Coffee");
        p1.setBeverage(true);
        products.add(p1);

        Product largeCoffee = new Product();
        largeCoffee.setPrice(9.46);
        largeCoffee.setName("Large Coffee");
        largeCoffee.setBeverage(true);
        products.add(largeCoffee);

        Product cakePop = new Product();
        cakePop.setPrice(4.89);
        cakePop.setName("Cake Pop");
        cakePop.setBeverage(false);
        products.add(cakePop);

        Product eggSandwich = new Product(7.89, "Egg Sandwich", false, 50);
        products.add(eggSandwich);

        // Builds the menu of products for sale at the coffee shop, creating a list of products from products.csv file
            ProductReader02 pr = new ProductReader02();
            List<Product> productsFromFile = pr.readProducts();
            products.addAll(productsFromFile);

        }

    public void printProductsUnder3() {
        // this code filters all products that are less than 3$
        List<Product> cheapProducts = products.stream().filter(product -> product.getPrice() < 3).collect(Collectors.toList());
        // this code prints each of the products that is less than 3$
        cheapProducts.forEach(product -> System.out.println(product.getName() + "\t" + product.getPrice()));
    }

    public void printProductsUnder4() {
        // the same 2 lines the code above written as a for loop
        int count = 1;
        for ( Product product : products ) {
            if ( product.getPrice() < 4 ) {
                System.out.println(count + ") " + product.getName() + "\t" + product.getPrice());
                    count++;
            }
        }
    }



    // print the list of products available for sale
    public void printProducts() {
        for ( int pos = 0 ; pos < products.size() ; pos++ ) {
            Product product = products.get(pos);
            System.out.println((pos+1) + ") " + product.getName() + "\t" + product.getPrice() );
        }
    }
}
