package com.perscholas.module305.JDBCDemo;

import com.perscholas.module305.JDBCDemo.database.dao.EmployeeDAO;
import com.perscholas.module305.JDBCDemo.database.entity.Employee;

import java.util.List;

public class FirstHibernateDemo {
    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAO();

//        List<Employee> employees = employeeDAO.findByFirstName("Leslie");
//        List<Employee> employees = employeeDAO.findByLastName("Doe");
//        for(Employee employee : employees){
//            System.out.println(employee.getId() + " | " + employee.getFirstname() + " | " + employee.getLastname() + " | " +
//                    employee.getEmail() + " | " + employee.getJobTitle());
            // After adding @ToString annotation in Employee Class it is possible to print out easily
//            System.out.println(employee);
//        }


//        searchByFirstname(employeeDAO, "Leslie");
//        searchByLastname(employeeDAO, "Doe");

    }

    public static void searchByFirstname(EmployeeDAO employeeDAO, String firstname) {
        List<Employee> employees = employeeDAO.findByFirstName(firstname);
        for(Employee employee : employees){
            System.out.println(employee.getId() + " | " + employee.getFirstname() + " | " + employee.getLastname() + " | " +
                    employee.getEmail() + " | " + employee.getJobTitle());
        }

    }


    public static void searchByLastname(EmployeeDAO employeeDAO, String lastname) {
        List<Employee> employees = employeeDAO.findByLastName(lastname);
        // After adding @ToString annotation in Employee Class it is possible to print out easily
        for(Employee employee : employees){
            System.out.println(employee);
        }

    }


        public static void createEmployee(EmployeeDAO employeeDAO){
        // Let's create a new employee in the database
        Employee newEmployee = new Employee();
        newEmployee.setFirstname("Yoda");
        newEmployee.setLastname("Jedi");
        newEmployee.setOfficeId(1);
        newEmployee.setExtension("x8080");
        newEmployee.setEmail("yoda@classic_models.com");
        newEmployee.setJobTitle("Master Jedi");
        newEmployee.setVacationHours(0);

        employeeDAO.insert(newEmployee);

        List<Employee> employeesList = employeeDAO.findByLastName("Jedi");
        for(Employee employee : employeesList){
            System.out.println(employee);
        }
    }

}
