package com.perscholas.module305.JDBCDemo;

import com.perscholas.module305.JDBCDemo.database.dao.CustomerDAO;
import com.perscholas.module305.JDBCDemo.database.entity.Customer;

import java.util.List;

public class CustomerHibernateDemo {

    public static void main(String[] args) {
        CustomerDAO customerDAO = new CustomerDAO();
//        createCustomer(customerDAO);

    }


    public static void createCustomer(CustomerDAO customerDAO){
        // Let's create a new employee in the database
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


    public static void searchByName(String name){
        CustomerDAO customerDAO = new CustomerDAO();
        System.out.println(customerDAO.findByCustomerName(name));

    }

}
