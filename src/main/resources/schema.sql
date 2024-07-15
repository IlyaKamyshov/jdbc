CREATE SCHEMA IF NOT EXISTS netology;

CREATE TABLE IF NOT EXISTS netology.CUSTOMERS
(
    id           INT PRIMARY KEY AUTO_INCREMENT,
    name         VARCHAR(50),
    surname      VARCHAR(50),
    age          SMALLINT CHECK (age >= 0 AND age < 150),
    phone_number VARCHAR(50)
    );

CREATE TABLE IF NOT EXISTS netology.ORDERS
(
    id           INT PRIMARY KEY AUTO_INCREMENT,
    date         DATETIME,
    customer_id  INT,
    product_name VARCHAR(255),
    amount       INT,
    FOREIGN KEY (customer_id) REFERENCES netology.CUSTOMERS (id)
);