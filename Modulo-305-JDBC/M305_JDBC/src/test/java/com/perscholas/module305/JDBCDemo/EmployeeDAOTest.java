package com.perscholas.module305.JDBCDemo;

import com.perscholas.module305.JDBCDemo.database.dao.EmployeeDAO;
import com.perscholas.module305.JDBCDemo.database.entity.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class EmployeeDAOTest {

    private static EmployeeDAO employeeDAO = new EmployeeDAO();

        @Test
    public void findByIdTest(){
        // Given
        Integer employeeId = 1002;
        // When
        Employee employee = employeeDAO.findById(employeeId);
        // Then
        Assertions.assertNotNull(employee);
        Assertions.assertEquals(employeeId, employee.getId());
        Assertions.assertEquals("Murphy", employee.getLastname());
        Assertions.assertEquals("dmurphy@classicmodelcars.com", employee.getEmail());

    }

    @Test
    public void findByInvalidIdTest(){
        // Given
        Integer employeeId = 10021002;
        // When
        Employee employee = employeeDAO.findById(employeeId);
        // Then
        Assertions.assertNull(employee);

    }

}
