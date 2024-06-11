package com.perscholas.module305.JDBCDemo;

import com.perscholas.module305.JDBCDemo.database.dao.CustomerDAO;
import com.perscholas.module305.JDBCDemo.database.entity.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CustomerDAOTest {

    private CustomerDAO customerDAO =  new CustomerDAO();

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

}
