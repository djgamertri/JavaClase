package com.example.demo.servlets;

import java.io.IOException;
import java.sql.SQLException;

import com.example.demo.models.Product;
import com.example.demo.models.repository.ProductRepositoryimpl;
import com.example.demo.models.repository.Repository;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;


@WebServlet("/ProductRegister")
public class ProductRegister extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Repository<Product> repository = new ProductRepositoryimpl();

        String NameProduct = req.getParameter("NameProduct");
        String ValueProduct = req.getParameter("ValueProduct");
        String CategoryProduct = req.getParameter("CategoryProduct");
        
        int intValueProduct = Integer.parseInt(ValueProduct);
        int intCategoryProduct = Integer.parseInt(CategoryProduct);

        Product productInsert = new Product();

        productInsert.setProduct_name(NameProduct);
        productInsert.setProduct_values(intValueProduct);
        productInsert.setCategory_id(intCategoryProduct);

        try {
            repository.saveObj(productInsert);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
