package com.chalapathi.test1;


import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    static Connection connection;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "password");
            System.out.println("Database connection established.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("started...");
    }
}