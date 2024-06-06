package com.perscholas.module305.JDBCDemo;

import com.perscholas.module305.JDBCDemo.database.dao.CustomerDAO;
import com.perscholas.module305.JDBCDemo.database.dao.OrderDAO;
import com.perscholas.module305.JDBCDemo.database.entity.Customer;
import com.perscholas.module305.JDBCDemo.database.entity.Order;

import java.util.List;
import java.util.Scanner;

public class CustomerHibernateDemo {

    public static void main(String[] args) {
        CustomerDAO customerDAO = new CustomerDAO();
//        createCustomer(customerDAO);
//        searchByName("Per Scholas");
//        searchById(520);

//        modifyCustomerById(customerDAO, 520);

//        printOrdersByCustomerId();

    }


    public static void createCustomer(CustomerDAO customerDAO){
        // Let's create a new customer in the database
        Customer newCustomer = new Customer();
        newCustomer.setCustomerName("Per Scholas");
        newCustomer.setContactFirstname("Eric");
        newCustomer.setContactLastname("Heilig");
        newCustomer.setPhone("7189918400");
        newCustomer.setAddressLine1("804 E 138th St");
        newCustomer.setAddressLine2(null);
        newCustomer.setCity("Bronx");
        newCustomer.setState("NY");
        newCustomer.setPostalCode("10454");
        newCustomer.setCountry("USA");
        newCustomer.setSalesRepEmployeeId(1188);
        newCustomer.setCreditLimit(null);

        customerDAO.insert(newCustomer);

        List<Customer> customerList = customerDAO.findByContactFirstName("Eric");
        for(Customer customer : customerList){
            System.out.println(customer);
        }

    }


    public static void searchById(int id){
        CustomerDAO customerDAO = new CustomerDAO();
        System.out.println(customerDAO.findById(id));

    }


    public static void searchByName(String name){
        CustomerDAO customerDAO = new CustomerDAO();
        System.out.println(customerDAO.findByCustomerName(name));

    }


    public static void modifyCustomerById(CustomerDAO customerDAO, int id){
        Customer customer = new Customer();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the firstname of the customer");
        String firstname = scanner.nextLine();
        System.out.println("Please enter the lastname of the customer");
        String lastname = scanner.nextLine();

        customer = customerDAO.findById(id);
        customer .setContactFirstname(firstname);
        customer.setContactLastname(lastname);

        customerDAO.update(customer);

    }


    public static void printOrdersByCustomerId(){
        OrderDAO orderDAO = new OrderDAO();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the customer ID, to print out their orders: ");
        int customerId = scanner.nextInt();
//        System.out.println(orderDAO.findOrdersByCustomerId(customerId));
        List<Order> orders = orderDAO.findOrdersByCustomerId(customerId);
        System.out.println(" Order id \t|\t Order date \t|\t Required date \t|\t Shipped date \t|\t Status \t|\t Comments" );
        System.out.println("=========================================================================================================");
        for(Order order : orders){
            System.out.println("\t" + order.getId() + " \t|\t " + order.getOrderDate() + " \t|\t " + order.getRequiredDate()  + " \t|\t " +
                    order.getShippedDate()  + " \t|\t " + order.getStatus() + " \t|\t " + order.getComments());
        }

    }

}
