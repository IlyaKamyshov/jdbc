INSERT INTO netology.CUSTOMERS (NAME, surname, age, phone_number)
VALUES ('Ivan', 'Ivanov', 50, '+79160000000'),
       ('Petr', 'Petrov', 40, '+79161111111'),
       ('Sidor', 'Sidorov', 20, NULL),
       ('Maxim', 'Maximov', 27, '+79162222222'),
       ('Alexey', 'Maximov', 29, '+79162222222'),
       ('Alexey', 'Vasechkin', 36, NULL);

INSERT INTO netology.ORDERS (date, customer_id, product_name, amount)
VALUES ('2024-01-01', 1, 'Bread', 1),
       ('2024-01-02', 2, 'Meat', 2),
       ('2024-01-03', 3, 'Milk', 1),
       ('2024-01-03', 3, 'Sugar', 4),
       ('2024-01-04', 4, 'Water', 2),
       ('2024-01-05', 5, 'Juice', 1),
       ('2024-01-05', 6, 'Cheese', 5),
       ('2024-01-05', 6, 'Butter', 3);