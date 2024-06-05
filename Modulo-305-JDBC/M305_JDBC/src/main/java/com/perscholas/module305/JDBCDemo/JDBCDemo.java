package com.perscholas.module305.JDBCDemo;

import java.sql.*;
import java.util.Scanner;

public class JDBCDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        String dburl = "jdbc:mysql://localhost:3307/classic_models";
        String user = "root";
        String password = "Sesame24$";
        System.out.println("-------- MySQL JDBC Connection Demo ------------");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(dburl, user, password);
//            String selectSQL = "SELECT * FROM employees";
//            String selectSQL = "SELECT * FROM employees WHERE firstname = 'Leslie'";
//            String selectSQL = "SELECT * FROM employees WHERE firstname = \"Leslie\"";

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the first name of the employee you want to search for: ");
            String input = scanner.nextLine();
            String lastnameInput = "Doe";
            int emp_id = 1002;
//            String selectSQL = "SELECT * FROM employees WHERE firstname = '" + input +"'";
//            Statement stmt = connection.createStatement();
//            ResultSet result =  stmt.executeQuery(selectSQL);

            // ########## NOTE THAT THE EXAMPLE ABOVE IS SUBJECT TO SQL INJECTION ATTACKS ##########
            // To add a layer of security and avoid SQL INJECTION ATTACKS, we can use PreparedStatement
            String selectSQL = "SELECT * FROM employees WHERE firstname = ? or lastname = ? or id = ?";
            PreparedStatement pstmt = connection.prepareStatement(selectSQL);
            pstmt.setString(1, input);
            pstmt.setString(2, lastnameInput);
            pstmt.setInt(3, emp_id);
            ResultSet result = pstmt.executeQuery();


            while(result.next())
            {
                String EmployeeID  = result.getString("id");
                String fname = result.getString("firstName");
                String lname  = result.getString("lastName");
                String email  = result.getString("email");
                String jobTitle  = result.getString("job_title");
                System.out.println(EmployeeID + " | " + fname + " | " + lname + " | " + email + " | " + jobTitle );
            }
            connection.close();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
