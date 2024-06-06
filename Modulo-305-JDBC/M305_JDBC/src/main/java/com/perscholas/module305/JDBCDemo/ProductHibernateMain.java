package com.perscholas.module305.JDBCDemo;

import com.perscholas.module305.JDBCDemo.database.dao.ProductDAO;
import com.perscholas.module305.JDBCDemo.database.entity.Product;

import java.util.List;
import java.util.Scanner;

public class ProductHibernateMain {
    // I Want to be able to search for a product and then change the quantity in stock to reflect current inventory levels.
    // 1) I need to be able to prompt the user for which product to search for
    // 2) I need to be able to show the products and allow the user to select a product to modify
    // 2.5) Use the id of the product the user just entered to do a query on the database
    // 3) I need to prompt the user to enter the new value quantity in stock
    // 4) I need to set the new quantity in stock on the product and save it to the database


    private ProductDAO productDAO = new ProductDAO();
    private Scanner sc = new Scanner(System.in);


    public void run(){
        String productName = inputProductSearch();
        List<Product> productsList = productDAO.findLikeName(productName);

        // #2 Prints the List of products
//        for(Product product : productList){
//            System.out.println(product);
//        }
//        printProducts(productsList);
        int productId = printProductsAndPromptForProductId(productsList);

        // #2.5
//        Product selectedProduct = productDAO.findById(productId);
//        System.out.println(selectedProduct);

        // #2.5.1 Same as 2.5 but handling null returns
        Product selectedProductNullHandling = null;
        while(selectedProductNullHandling == null){
            productId = promptForProductId();
            selectedProductNullHandling = productDAO.findById(productId);
            if(selectedProductNullHandling == null) {
                System.out.println("You have entered a nonexistent id number, please try again!");
            }

        }


        // #3
        int quantity = promptQuantityInStock();
        System.out.println(quantity);


        // #4
//        updateQuantityInStock(selectedProduct, quantity);

        // #4.1
        updateQuantityInStock(selectedProductNullHandling, quantity);


    }


    public void updateQuantityInStock(Product product, int quantity){
        product.setQuantityInStock(quantity);
        productDAO.update(product);
    }


    public int promptQuantityInStock(){
        while(true) {
            try {
                System.out.println("Enter the value for quantity in stock: ");
                int quantity = sc.nextInt();
                return quantity;
            }catch (Exception e){
                System.out.println("Please enter a valid number: ");
                sc.nextLine();
            }
        }
    }


    public void printProducts(List<Product> products){
        System.out.println("          Product name          |           Quantity in stock" );
        System.out.println("================================================================================");
        for(Product product : products){
            System.out.println(product.getProductName() + " | " + product.getQuantityInStock());
        }

    }


    public int printProductsAndPromptForProductId(List<Product> products){
        System.out.println(" Product id \t|\t Product name \t\t|\t Quantity in stock" );
        System.out.println("====================================================================================");
        for(Product product : products){
            System.out.println(product.getId() + " \t|\t " + product.getProductName() + " \t\t|\t " + product.getQuantityInStock());
        }

        while(true){
            try {
                System.out.println("Enter the product id to modify: ");
                int id = sc.nextInt();
                return id;
            }catch(Exception e){
                System.out.println("Please enter a valid id number: ");
                sc.nextLine();
            }
        }

    }


    public String inputProductSearch(){
        System.out.println("Please enter the product name you are looking for: ");
        String productName = sc.nextLine();
        return productName;

    }

    // # To be used by #2.5.1
    public int promptForProductId() {
        while(true) {
            try {
                System.out.print("Enter the product id to modify: ");
                int id = sc.nextInt();
                return id;
            } catch (Exception e) {
                System.out.println("Please enter a valid id number: ");
                sc.nextLine();
            }
        }
    }


    public static void main(String[] args) {
        ProductHibernateMain phm = new ProductHibernateMain();
        phm.run();

    }

}
