package com.example.demo.connectionBD;

import java.sql.*;

public class BasicConnection {
    public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3306/JavaClass?serverTimezone=America/Bogota";
    String username = "UserDataBase";
    String password = "C0d1g034_";
    String sql = null;
    Connection conn = null;
    Statement stm = null;
    ResultSet rs = null;

    try {
        sql = "SELECT * FROM users_tbl";
        conn = DriverManager.getConnection(url, username, password);
        stm = conn.createStatement();
        rs = stm.executeQuery(sql);  // stm.executeUpdate(sql) Para consultas tipo update, delete
        while (rs.next()) {
            System.out.print(rs.getString("user_firtsname"));
            System.out.print(" | ");
            System.out.println(rs.getString("user_lastname"));
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        try {
            rs.close();
            stm.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }// end try-catch
    } // main

   } // BasicConnection
