package com.perscholas.java_basics.coffeeShop;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductReader01 {

    public List<Product> readProducts() throws IOException {
        List<Product> products = new ArrayList<>();
            try{
                File file = new File("products.csv");
                FileReader reader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(reader);

//                String header = bufferedReader.readLine();
//                String product = bufferedReader.readLine();
//
//                System.out.println(header);
//                System.out.println(product);
//
//                Product product1 = parseProduct(product);



            } catch(Exception e){
                e.printStackTrace();
            }
            return products;
    }

    private Product parseProduct(String line){
        Product product =  new Product();
        String[] column  = line.split(",");
        product.setName(column[0]);

        double price = Double.parseDouble(column[1]);
        product.setPrice(price);

//        int quantity = Integer.parseInt(column[2]);
        product.setQuantityAvailable(Integer.parseInt(column[2]));

        product.setBeverage(Boolean.parseBoolean(column[3]));

        return product;
    }


    public static void main(String[] args) throws IOException {
        ProductReader01 productReader = new ProductReader01();
        productReader.readProducts();

    }
}