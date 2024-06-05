package com.perscholas.module305.JDBCDemo;

import com.perscholas.module305.JDBCDemo.database.dao.EmployeeDAO;
import com.perscholas.module305.JDBCDemo.database.entity.Employee;

import java.util.List;

public class FirstHibernateDemo {
    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAO();

        List<Employee> employees = employeeDAO.findByFirstName("Leslie");
        for(Employee employee : employees){
            System.out.println(employee.getId() + " | " + employee.getFirstname() + " | " + employee.getLastname() + " | " +
                    employee.getEmail() + " | " + employee.getJobTitle());
        }

    }

}
