package com.example.demo.servlets;

import java.io.*;
import java.sql.SQLException;

import com.example.demo.models.User;
import com.example.demo.models.repository.Repository;
import com.example.demo.models.repository.UserRepositoryimpl;

import jakarta.servlet.http.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;

@WebServlet("/UserRegister")
public class SvRegister extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Repository<User> repository = new UserRepositoryimpl();

        String userName = req.getParameter("UserName");
        String userLastName = req.getParameter("UserLastName");
        String userEmail = req.getParameter("UserEmail");
        String userPass = req.getParameter("UserPass");

        User userInsert = new User();

        userInsert.setUser_firtsname(userName);
        userInsert.setUser_lastname(userLastName);
        userInsert.setUser_email(userEmail);
        userInsert.setUser_password(userPass);
        
        try {
            repository.saveObj(userInsert);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
