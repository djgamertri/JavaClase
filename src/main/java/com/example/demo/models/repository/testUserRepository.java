package com.example.demo.models.repository;

import java.sql.SQLException;

import com.example.demo.models.User;

public class testUserRepository {
    public static void main(String[] args) throws SQLException{
        Repository<User> repository = new UserRepositoryimpl();

        System.out.println("---------------- SaveOBJ Insert------------------");
        User userInsert = new User();

        userInsert.setUser_firtsname("carlos");
        userInsert.setUser_lastname("rojas");
        userInsert.setUser_email("carlos@gmail.com");
        userInsert.setUser_password("dasda21321");
        repository.saveObj(userInsert);

        userInsert.setUser_firtsname("PePe");
        userInsert.setUser_lastname("perez");
        userInsert.setUser_email("PEE@gmail.com");
        userInsert.setUser_password("qwqer123");
        repository.saveObj(userInsert);

        System.out.println("---------------- ListAllObj------------------");
        repository.listAllObj().forEach((System.out::println));
        System.out.println();

        System.out.println("---------------- ByIdObj ------------------");
        System.out.println(repository.byIdObj(1));
        System.out.println();

        System.out.println("---------------- saveObj ------------------");
        User userUpdate = new User();
        userUpdate.setUser_id(2);
        userUpdate.setUser_firtsname("jorge");
        userUpdate.setUser_lastname("palacios");
        userUpdate.setUser_email("jorge@gmail.com");
        userUpdate.setUser_password("dasda21321");
        repository.saveObj(userUpdate);
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("---------------- DeleteObj ------------------");
        repository.deleteObj(2);
        repository.listAllObj().forEach(System.out::println);
    }
}
