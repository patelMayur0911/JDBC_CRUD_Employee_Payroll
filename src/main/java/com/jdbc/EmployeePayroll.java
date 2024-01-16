package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeePayroll {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/studentDatabase";
        String username = "root";
        String password = "PM@0911";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {

            create a table

            try (Statement statement = connection.createStatement()) {
                String createTableQuery = "create table student(id int primary key,name varchar(20),age int)";
                statement.executeUpdate(createTableQuery);
                System.out.println("Table is created successfully");
            }
        }
        catch (SQLException ex) {
            System.out.println("Some error");
            ex.printStackTrace();
        }
    }
}