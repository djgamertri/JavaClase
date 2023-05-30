package com.example.demo.models.repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.models.Category;
import com.example.demo.utils.ConnectionPool;

public class CategoryRepositoryimpl implements Repository<Category> {
    private String sql = null;

    @Override
    public Category createObj(ResultSet rs) throws SQLException {
        Category category = new Category();

        category.setCategory_id(rs.getInt("category_id"));
        category.setCategory_name(rs.getString("category_name"));
        return category;
    }

    @Override
    public List<Category> listAllObj() throws SQLException {
        sql = "select category_id, category_name from categories;";
        List<Category> categories = new ArrayList<>();
        try (Connection conn = ConnectionPool.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {
                while (rs.next()) {
                    Category u = createObj(rs);
                    categories.add(u);
                }
        }
        return categories;
    }

    @Override
    public Category byIdObj(Integer id) throws SQLException {
        sql = "select category_id, category_name from categories where category_id = ?;";
        Category category = null;

        try (
            Connection conn = ConnectionPool.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)
            ) {
                ps.setInt(1, id);
                try(ResultSet rs = ps.executeQuery()){
                    if(rs.next()){
                        category = createObj(rs);
                    }
                }
        }
        return category;
    }

    @Override
    public Integer saveObj(Category category) throws SQLException {
        int rowsAffected = 0;

        if(category.getCategory_id() != null && category.getCategory_id() > 0){
            sql = "update categories set category_name = ? where category_id = ?";
        } else{
            sql = "insert into categories (category_name) values (lower(?));";
        }

        try(Connection conn = ConnectionPool.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, category.getCategory_name());
            if(category.getCategory_id() != null && category.getCategory_id() > 0){
                ps.setInt(2, category.getCategory_id());
            }

            rowsAffected = ps.executeUpdate();
        }

        return rowsAffected;
    }

    @Override
    public void deleteObj(Integer id) throws SQLException {
        sql = "delete from categories where category_id = ?";
        try(Connection conn = ConnectionPool.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }
}
