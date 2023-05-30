package com.example.demo.servlets;

import java.io.IOException;
import java.sql.SQLException;

import com.example.demo.models.Category;
import com.example.demo.models.repository.CategoryRepositoryimpl;
import com.example.demo.models.repository.Repository;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@WebServlet("/CategoryRegister")
public class CategoryRegister extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Repository<Category> repository = new CategoryRepositoryimpl();
        
        String NameCategory = req.getParameter("NameCategory");

        Category categoryInsert = new Category();

        categoryInsert.setCategory_name(NameCategory);
        
        try {
            repository.saveObj(categoryInsert);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
