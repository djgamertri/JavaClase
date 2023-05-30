package com.example.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import org.w3c.dom.TypeInfo;

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
        Integer ValueProduct = Integer.valueOf(req.getParameter("ValueProduct"));
        Integer CategoryProduct = Integer.valueOf(req.getParameter("CategoryProduct"));

        Product productInsert = new Product();

        productInsert.setProduct_name(NameProduct);
        productInsert.setProduct_values(ValueProduct);
        productInsert.setCategory_id(CategoryProduct);
        

        int rows = 0;
        try {
           rows = repository.saveObj(productInsert);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if(rows == 0){
            System.out.println("Ocurrio un error");
        }else{
            req.getRequestDispatcher("./Successful.jsp").forward(req, resp);
        }
    }
}
