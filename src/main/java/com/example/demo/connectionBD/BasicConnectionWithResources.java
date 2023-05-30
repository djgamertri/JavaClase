package com.example.demo.connectionBD;

import java.sql.*;

public class BasicConnectionWithResources {
    public static void main(String[] args) {
        String url ="jdbc:mysql://localhost:3306/JavaClass?serverTimezone=America/Bogota";
        String username = "UserDataBase";
        String password = "C0d1g034_";
        String sql = "SELECT * FROM users_tbl ";
        try (Connection conn =
            DriverManager.getConnection(url,username, password); 
            Statement stmt = conn.createStatement(); 
            ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(rs.getString("user_firtsname"));
                System.out.println(rs.getString("user_lastname"));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        } // end try-catch
    } // main
} // BasicConnectionWithResource