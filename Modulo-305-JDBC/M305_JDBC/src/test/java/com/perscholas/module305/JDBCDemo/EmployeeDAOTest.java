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

    @Test
    public void findByFirstNameTest(){
        // Given
        String firstName = "Diane";

        // When
        List<Employee> employees = employeeDAO.findByFirstName(firstName);

        // Then
        Assertions.assertNotNull(employees);
        Assertions.assertEquals(1, employees.size());
        Assertions.assertEquals("Murphy", employees.get(0).getLastname());
        Assertions.assertEquals("dmurphy@classicmodelcars.com", employees.get(0).getEmail());

    }

    @Test
    public void findByInvalidFirstNameTest(){
        // Given
        String firstName = "Ermenegildo";
        // When
        List<Employee> employeesByFirstName = employeeDAO.findByFirstName(firstName);
        // Then
        Assertions.assertEquals(0, employeesByFirstName.size());

    }


    @Test
    public void createAndDeleteEmployeeTest(){
        // Given
        Employee given = new Employee();
        given.setOfficeId(1);
        given.setFirstname("Test Employee");
        given.setLastname("LastName");
        given.setEmail("test@classicmodels.com");
        given.setExtension("x8081");
        given.setJobTitle("Test_employee");

        // When
        employeeDAO.insert(given);

        // Then
        Employee actual = employeeDAO.findById(given.getId());
        Assertions.assertEquals(given.getLastname(), actual.getLastname());
        Assertions.assertEquals(given.getEmail(), actual.getEmail());

        employeeDAO.delete(given);
        Assertions.assertNull(employeeDAO.findById(actual.getId()));

    }

    @Test
    public void deleteEmployeeByIdTest(){
        // Given
        Integer employeeId = 1718;
        // When
        employeeDAO.deleteById(employeeId);
        // Then
        Assertions.assertNull(employeeDAO.findById(employeeId));

    }

}
