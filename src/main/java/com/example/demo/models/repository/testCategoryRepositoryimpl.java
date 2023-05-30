package com.example.demo.models.repository;

import java.sql.SQLException;

import com.example.demo.models.Category;

public class testCategoryRepositoryimpl {
    public static void main(String[] args) throws SQLException{
        Repository<Category> repository = new CategoryRepositoryimpl();

        System.out.println("---------------- SaveOBJ Insert------------------");
        Category categoryInsert = new Category();

        categoryInsert.setCategory_name("Lacteos");
        repository.saveObj(categoryInsert);

        categoryInsert.setCategory_name("Granos");
        repository.saveObj(categoryInsert);

        System.out.println("---------------- ListAllObj------------------");

        repository.listAllObj().forEach((System.out::println));
        System.out.println();

        System.out.println("---------------- ByIdObj ------------------");

        System.out.println(repository.byIdObj(1));
        System.out.println();

        System.out.println("---------------- saveObj ------------------");

        Category categoryUpdate = new Category();

        categoryUpdate.setCategory_id(2);
        categoryUpdate.setCategory_name("Jugos");
        
        repository.saveObj(categoryUpdate);

        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("---------------- DeleteObj ------------------");

        repository.deleteObj(2);
        repository.listAllObj().forEach(System.out::println);
    }
}
