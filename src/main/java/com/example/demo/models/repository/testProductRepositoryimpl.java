package com.example.demo.models.repository;

import java.sql.SQLException;

import com.example.demo.models.Product;

public class testProductRepositoryimpl {

    public static void main(String[] args) throws SQLException{

        Repository<Product> repository = new ProductRepositoryimpl();

        System.out.println("---------------- SaveOBJ Insert------------------");
        Product productInsert = new Product();

        productInsert.setProduct_name("Leche Alqueria");
        productInsert.setProduct_values(1500);
        productInsert.setCategory_id(1);

        repository.saveObj(productInsert);

        productInsert.setProduct_name("Alverjas");
        productInsert.setProduct_values(2500);
        productInsert.setCategory_id(2);

        repository.saveObj(productInsert);

        System.out.println("---------------- ListAllObj------------------");

        repository.listAllObj().forEach((System.out::println));
        System.out.println();

        System.out.println("---------------- ByIdObj ------------------");

        System.out.println(repository.byIdObj(1));
        System.out.println();

        System.out.println("---------------- saveObj ------------------");

        Product productUpdate = new Product();

        productUpdate.setProduct_id(2);
        productUpdate.setProduct_name("Yogurt");
        productUpdate.setProduct_values(1200);
        productUpdate.setCategory_id(1);
        
        repository.saveObj(productUpdate);

        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("---------------- DeleteObj ------------------");

        repository.deleteObj(2);
        repository.listAllObj().forEach(System.out::println);
    }
}