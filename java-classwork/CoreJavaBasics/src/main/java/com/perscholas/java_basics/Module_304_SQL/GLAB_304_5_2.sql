-- GLAB 304.5.2
-- “OR” Operator
-- To get the customers who are located in the USA or France, you can use the OR operator in the WHERE clause as follows:
SELECT    customer_name, country
FROM    customers
WHERE    country = 'USA' OR country = 'France';

-- “AND” Operator Examples
/* The AND operator is a logical operator that combines two or more Boolean expressions,
   and returns true only if both expressions evaluate as true.
   The AND operator returns false if one of the two expressions evaluates as false. */

-- The following query will return the customer's records who are located in the USA or France and have credit limits greater than 100,000.
SELECT customer_name, country, credit_limit
FROM    customers
WHERE (country = 'USA' OR country = 'France') AND credit_limit > 100000;

-- The below query will return the customers who are located in the USA or the customers who are located
-- in France with a credit limit greater than 10000.
-- Note: We did not use the parentheses.
SELECT customer_name, country, credit_limit
FROM customers
WHERE country = 'USA' OR country = 'France' AND credit_limit > 100000;


-- BETWEEN and NOT BETWEEN
-- The BETWEEN operator selects values within a given range. The values can be numbers, text, or dates.
-- The BETWEEN operator is inclusive: Begin and End values are included.
-- Suppose you want to find products whose buy prices are within the ranges of 90 and 100.
-- You can use the BETWEEN operator, as in the following query:
SELECT product_code,  product_name,  buy_price
FROM products
WHERE buy_price BETWEEN 90 AND 100;

-- You can achieve the same effect by using the greater than or equal to (>=) and the less than or equal to ( <= ) operators,
-- as in the following query:
SELECT product_code, product_name, buy_price
FROM products
WHERE  buy_price >= 90 AND buy_price <= 100;

-- To find the product whose buy price is not between $20 and $100, you can combine the BETWEEN operator with the NOT operator as follows:
SELECT product_code, product_name, buy_price
FROM products
WHERE buy_price NOT BETWEEN 20 AND 100;

-- You can rewrite the query above using the less than (>), greater than (>), and logical operator (AND) as the following query.
SELECT product_code, product_name, buy_price
FROM products
WHERE buy_price < 20 OR buy_price > 100;


-- “IS NULL” Operator
-- The following query uses the IS NULL operator to find customers who do not have a sales representative:
SELECT customer_name, country, sales_rep_employee_id
FROM customers
WHERE sales_rep_employee_id IS NULL
ORDER BY  customer_name;

-- The below query uses the IS NOT NULL operator to get the customers who have a sales representative:
SELECT customer_name, country, sales_rep_employee_id
FROM  customers
WHERE  sales_rep_employee_id IS NOT NULL
ORDER BY customer_name;

-- The following query uses the LEFT JOIN predicate and the IS NULL operator to find customers who have no order:
SELECT c.id, c.customer_name, o.id, o.status
FROM customers c
         LEFT JOIN orders o
                   ON c.id = o.id
WHERE  o.id IS NULL;
