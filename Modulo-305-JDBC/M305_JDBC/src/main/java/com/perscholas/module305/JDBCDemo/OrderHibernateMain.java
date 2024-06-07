package com.perscholas.module305.JDBCDemo;

import com.perscholas.module305.JDBCDemo.database.dao.OrderDAO;
import com.perscholas.module305.JDBCDemo.database.entity.Order;

import java.util.List;
import java.util.Scanner;

public class OrderHibernateMain {
    private OrderDAO orderDAO = new OrderDAO();
    Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        OrderHibernateMain orderHibernateMain = new OrderHibernateMain();
        orderHibernateMain.run();

    }


    public void run(){
        // Calls printOrdersByCustomerId from CustomerHibernateMain to get the List of orders of a customer
        CustomerHibernateMain customerHibernateMain = new CustomerHibernateMain();
        List<Order> orders = customerHibernateMain.printOrdersByCustomerId();
        System.out.println(" Order id \t|\t Order date \t|\t Required date \t|\t Shipped date \t|\t Status \t|\t Comments" );
        System.out.println("=========================================================================================================");
        for(Order order : orders){
            System.out.println("\t" + order.getId() + " \t|\t " + order.getOrderDate() + " \t|\t " + order.getRequiredDate()  + " \t|\t " +
                    order.getShippedDate()  + " \t|\t " + order.getStatus() + " \t|\t " + order.getComments());
        }


        // This piece of code allows you to enter any valid order id and looks for it in the entire orders table
//        int orderId = 0;
//        Order selectedOrderNullHandling = null;
//        while(selectedOrderNullHandling == null){
//            orderId = promptForOrderId();
//            selectedOrderNullHandling = orderDAO.findById(orderId);
//            if(selectedOrderNullHandling == null) {
//                System.out.println("You have entered a nonexistent id number, please try again!");
//            }
//        }

        // This piece of code limits the order id input to the orders in to List of orders of the specific customer queried before
        int orderId = 0;
        Order selectedOrderNullHandling = null;
        while(selectedOrderNullHandling == null){
            orderId = promptForOrderId();
            for(Order order : orders) {
                if (order.getId() == orderId) {
                    selectedOrderNullHandling = orderDAO.findById(orderId);
                }
            }
            if(selectedOrderNullHandling == null) {
                System.out.println("You have entered a nonexistent id number, please try again!");
            }
        }

        // After having a valid order id input, the user is asked to type in the comment for the order
        System.out.println("Please type in the comment you want to add to order " + orderId + ": ");
        String commentToAdd = scanner.nextLine();

        // Having the order and the comment this line of code updates the database table
        updateCommentsInOrder(selectedOrderNullHandling, commentToAdd);

        // Then we print out the order that we just merged into the table, to allow the user to visualize the changes
        System.out.println(" Order id \t|\t Order date \t|\t Required date \t|\t Shipped date \t|\t Status \t|\t Comments" );
        System.out.println("=========================================================================================================");
        System.out.println("\t" + selectedOrderNullHandling.getId() + " \t|\t " + selectedOrderNullHandling.getOrderDate() + " \t|\t " +
                selectedOrderNullHandling.getRequiredDate()  + " \t|\t " + selectedOrderNullHandling.getShippedDate()  + " \t|\t " +
                selectedOrderNullHandling.getStatus() + " \t|\t " + selectedOrderNullHandling.getComments());

    }


    public void updateCommentsInOrder(Order order, String comment){
        order.setComments(comment);
        orderDAO.update(order);
    }


    public int promptForOrderId() {
        while(true) {
            try {
                System.out.print("Enter the order id to modify: ");
                int id = Integer.parseInt(scanner.nextLine());
                return id;
            } catch (Exception e) {
                System.out.print("Please enter a valid id number: ");
                scanner.nextLine();
            }
        }
    }

}
