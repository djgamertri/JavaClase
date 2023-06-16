create database JavaClass;
use JavaClass;

create table users_tbl (
user_id int primary key auto_increment,
    user_firtsname varchar(40) not null,
    user_lastname varchar(40) not null,
    user_email varchar(60) not null,
    user_password varbinary(40)
);

create table categories (
category_id int primary key auto_increment,
category_name varchar (40) not null
);

create table products (
product_id int primary key auto_increment,
product_name varchar (40) not null,
product_values int not null,
category_id int,
Foreign key (category_id) References categories (category_id)
);

select * from users_tbl;
select * from categories;
select * from products;