package com.example.demo.models.repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.models.Product;
import com.example.demo.utils.ConnectionPool;

public class ProductRepositoryimpl implements Repository<Product>{
    private String sql = null;

    @Override
    public Product createObj(ResultSet rs) throws SQLException {
        Product product = new Product();

        product.setProduct_id(rs.getInt("product_id"));
        product.setProduct_name(rs.getString("product_name"));
        product.setProduct_values(rs.getInt("product_values"));
        product.setCategory_id(rs.getInt("category_id"));
        return product;
    }

    @Override
    public List<Product> listAllObj() throws SQLException {
        sql = "select product_id, product_name, product_values, category_id from products;";
        List<Product> products = new ArrayList<>();
        try (Connection conn = ConnectionPool.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {
                while (rs.next()) {
                    Product u = createObj(rs);
                    products.add(u);
                }
        }
        return products;
    }

    @Override
    public Product byIdObj(Integer id) throws SQLException {
        sql = "select product_id, product_name, product_values, category_id from products where product_id = ?;";
        Product product = null;

        try (
            Connection conn = ConnectionPool.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)
            ) {
                ps.setInt(1, id);
                try(ResultSet rs = ps.executeQuery()){
                    if(rs.next()){
                        product = createObj(rs);
                    }
                }
        }
        return product;
    }

    @Override
    public Integer saveObj(Product product) throws SQLException {
        int rowsAffected = 0;

        if(product.getProduct_id() != null && product.getProduct_id() > 0){
            sql = "update products set product_name = ?, product_values = ?, category_id = ? where category_id = ?";
        } else{
            sql = "insert into products (product_name,product_values,category_id) values (lower(?),?,?);";
        }

        try(Connection conn = ConnectionPool.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, product.getProduct_name());
            ps.setInt(2, product.getProduct_values());
            ps.setInt(3, product.getCategory_id());

            if(product.getProduct_id() != null && product.getProduct_id() > 0){
                ps.setInt(4, product.getProduct_id());
            }

            rowsAffected = ps.executeUpdate();
        }

        return rowsAffected;
    }

    @Override
    public void deleteObj(Integer id) throws SQLException {
        sql = "delete from products where category_id = ?";
        try(Connection conn = ConnectionPool.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }
}
