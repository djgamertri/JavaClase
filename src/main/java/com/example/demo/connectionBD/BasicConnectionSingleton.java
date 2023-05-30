package com.example.demo.connectionBD;

import java.sql.*;

public class BasicConnectionSingleton {
    private static String url = "jdbc:mysql://localhost:3306/JavaClass?serverTimezone=America/Bogota";
    private static String user = "UserDataBase";
    private static String pass = "C0d1g034_";
    private static Connection conn;
    
    public static Connection getInstance() throws SQLException {
        if (conn == null) {
        conn = DriverManager.getConnection(url, user, pass);
        }
        return conn;
    }
} // BasicConnectionSingleto