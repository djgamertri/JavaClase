//Este es para usar el connection Singleton

package com.example.demo.connectionBD;

import java.sql.*;

public class UseBasicConnectionSingleton {
    public static void main(String[] args) throws 
    SQLException {
        try (Connection conn = BasicConnectionSingleton.getInstance();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM users_tbl")) {
            while (rs.next()) {
                System.out.print(rs.getString("user_firtsname"));
                System.out.print(" | ");
                System.out.println(rs.getString("user_lastname"));
            }
        } // end try
    }
} // UseBasicConnectionSingleton