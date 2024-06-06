package com.perscholas.module305.JDBCDemo;

import com.perscholas.module305.JDBCDemo.database.dao.OrderDAO;
import com.perscholas.module305.JDBCDemo.database.entity.Order;

import java.util.Scanner;

public class OrderHibernateMain {
    private OrderDAO orderDAO = new OrderDAO();
    Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        OrderHibernateMain orderHibernateMain = new OrderHibernateMain();
        orderHibernateMain.run();

    }


    public void run(){
        CustomerHibernateMain customerHibernateMain = new CustomerHibernateMain();
        customerHibernateMain.printOrdersByCustomerId();

        int orderId = 0;
        Order selectedOrderNullHandling = null;
        while(selectedOrderNullHandling == null){
            orderId = promptForOrderId();
            selectedOrderNullHandling = orderDAO.findById(orderId);
            if(selectedOrderNullHandling == null) {
                System.out.println("You have entered a nonexistent id number, please try again!");
            }
        }

        System.out.println("Please type in the comment you want to add to order " + orderId + ": ");
        String commentToAdd = scanner.nextLine();

        updateCommentsInOrder(selectedOrderNullHandling, commentToAdd);

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
                System.out.println("Please enter a valid id number: ");
                scanner.nextLine();
            }
        }
    }

}
