package com.perscholas.module305.JDBCDemo;

import com.perscholas.module305.JDBCDemo.database.dao.OrderDAO;
import com.perscholas.module305.JDBCDemo.database.dao.OrderDetailDAO;
import com.perscholas.module305.JDBCDemo.database.dao.ProductDAO;
import com.perscholas.module305.JDBCDemo.database.entity.Customer;
import com.perscholas.module305.JDBCDemo.database.entity.Order;
import com.perscholas.module305.JDBCDemo.database.entity.OrderDetail;
import com.perscholas.module305.JDBCDemo.database.entity.Product;

public class AddProductToOrderMain {

    // I want to be able to add a product to an order with the quantity 100

    // 1) Load an order from the database by id
    // 2) Load a product from the database by id
    // 3) Create a new OrderDetail object and add the order and the product
    // 4) Save the OrderDetail object to the database

    private OrderDAO orderDAO = new OrderDAO();
    private ProductDAO productDAO = new ProductDAO();
    private OrderDetailDAO orderDetailDAO = new OrderDetailDAO();

    public void run() {
        // read the order from the database
        Order order = orderDAO.findById(10100);
        System.out.println(order);

//        Customer customer = new CustomerDAO().findById(order.getCustomerId());
        Customer customer = order.getCustomer();    // Commented previous line and wrote this one to later be able to directly query the customers table

//        System.out.println("This order is for customer with an id = " + order.getCustomer().getId() + " and name = " + order.getCustomer().getCustomerName());
        // Instead of printing using the line above is better to print directly querying the corresponding table
        System.out.println("This order is for customer with an id = " + customer.getId() + " and name = " + customer.getCustomerName());


        // Prints the products that are already part of this order
        System.out.println("\t Product Name \t\t|\t Quantity Ordered \t\t|\t Price Each");
        System.out.println("================================================================================");
        for(OrderDetail od : order.getOrderDetails()){
            System.out.println(od.getProduct().getProductName() + " \t\t|\t " + od.getQuantityOrdered() + " \t\t|\t " + od.getPriceEach());
        }

        // read the product from the database
//        Product product = productDAO.findById(77);
        Product product = productDAO.findById(10);
        System.out.println(product);

        // INCREMENT BY 1 SECTION
        // Here we increment the quantityOrdered of the orderDetail + 1, instead of creating a new OrderDetail as we were doing before
        OrderDetail orderDetail = orderDetailDAO.findByOrderIdAndProductId(order.getId(), product.getId());
        if(orderDetail == null){
            orderDetail = new OrderDetail();
        }
        if(orderDetail.getQuantityOrdered() == null){
            orderDetail.setQuantityOrdered(1);
        }else {
            orderDetail.setQuantityOrdered(orderDetail.getQuantityOrdered() + 1);
        }

        // setup the order details object with the values I want to save to the database
//        OrderDetail orderDetail = new OrderDetail();          // Commented after adding INCREMENT BY 1 SECTION

        // we can just set the product and order objects we just queried on the order detail
        orderDetail.setProduct(product);
        orderDetail.setOrder(order);
//        orderDetail.setQuantityOrdered(100);                  // Commented after adding INCREMENT BY 1 SECTION
        orderDetail.setPriceEach(product.getMsrp());
        orderDetail.setOrderLineNumber(10);

        // save the order details to the database
        orderDetailDAO.insert(orderDetail);
    }


    public static void main( String[] args ) {
        AddProductToOrderMain apto = new AddProductToOrderMain();
        apto.run();
    }

}
