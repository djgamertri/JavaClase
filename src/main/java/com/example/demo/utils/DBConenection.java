package com.example.demo.utils;

import java.sql.Connection;
import java.sql.SQLException;
import org.apache.commons.dbcp2.BasicDataSource;

public class DBConenection {
    private static final String URL = "jdbc:mysql://aws.connect.psdb.cloud/javaclass?sslMode=VERIFY_IDENTITY";
    private static final String USER = "pb5s8msc3re2lri4hak9";
    private static final String PASS = "main-2023-apr-27-bkfupy";
    private static BasicDataSource pool;

    public static BasicDataSource getInstance() throws SQLException{
        if(pool == null){
            pool = new BasicDataSource();
            pool.setUrl(URL);
            pool.setUsername(USER);
            pool.setPassword(PASS);

            pool.setInitialSize(3);
            pool.setMinIdle(3);
            pool.setMaxIdle(8);
            pool.setMaxTotal(8);
        }

        return pool;
    }

    public static Connection getConnection() throws SQLException{
        return getInstance().getConnection();
    }
}

