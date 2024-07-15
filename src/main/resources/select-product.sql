SELECT product_name
FROM netology.CUSTOMERS C
         LEFT JOIN netology.ORDERS O
                   ON C.id = O.customer_id
WHERE upper(C.name) = upper(:name);