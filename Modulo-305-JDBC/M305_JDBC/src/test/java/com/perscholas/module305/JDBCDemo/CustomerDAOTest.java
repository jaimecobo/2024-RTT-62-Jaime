package com.perscholas.module305.JDBCDemo;

import com.perscholas.module305.JDBCDemo.database.dao.CustomerDAO;
import com.perscholas.module305.JDBCDemo.database.entity.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CustomerDAOTest {

    private CustomerDAO customerDAO =  new CustomerDAO();

    @BeforeAll
    public static void beforeAll(){
        // We could write some code to delete any customer from the database that has the "Test Customer" as the name

        //Another example of something we could do here in the @BeforeAll
        // If we were doing an old school JDBC connection we could create the actual database connection here
        // so that all the methods in the test case already have a database connection they could use
        // then in an @AfterAll you can close the database connection and release the resources

    }

    @Test
    public void findByIdTest(){
        // Given
        Integer userId = 103;

        // When
        Customer customer = customerDAO.findById(userId);

        // Then
        Assertions.assertNotNull(customer);
        Assertions.assertEquals(userId, customer.getId());
        Assertions.assertEquals("Atelier graphique", customer.getCustomerName());
        Assertions.assertEquals("Schmitt", customer.getContactLastname());
    }


    @Test
    public void findByInvalidIdTest(){
        // Given
        Integer userId = 103033;

        // When
        Customer customer = customerDAO.findById(userId);

        // Then
        Assertions.assertNull(customer);

    }

    @Test
    public void createCustomerTest(){
        // Given
        Customer customerTest1 = new Customer();

        customerTest1.setCustomerName("Test Customer");
        customerTest1.setContactLastname("Last Name");
        customerTest1.setContactFirstname("First Name");
        customerTest1.setAddressLine1("Address 1");
        customerTest1.setCity("Somewhere");
        customerTest1.setCountry("USA");
        customerTest1.setPhone("2342342345");

        // When
        customerDAO.insert(customerTest1);

        // Then
        Customer customerTest2 = customerDAO.findById(customerTest1.getId());
        Assertions.assertEquals(customerTest1.getCustomerName(), customerTest2.getCustomerName());
        Assertions.assertEquals(customerTest1.getContactFirstname(), customerTest2.getContactFirstname());

    }
}
