-- Homework 1
-- Question 0.1
-- I want to see the count of the number of products in each product line
SELECT p.productline_id, pl.product_line, COUNT(*) AS product_count
FROM products p, productlines pl
WHERE p.productline_id = pl.id
GROUP BY p.productline_id;

SELECT pl.product_line, COUNT(*) AS product_count
FROM products p, productlines pl
WHERE p.productline_id = pl.id
GROUP BY pl.product_line;


-- question 0.2
-- I want to see a list of employees and all of the customers for that employee.   Employee name will be duplicated in the result set.
-- I want to see the employee first and last name
-- and the customer contact first and last name as well as the customer name
SELECT CONCAT(e.firstname, ' ', + e.lastname) AS Employee,
       CONCAT(c.contact_firstname, ' ', c.contact_lastname, ' (', c.customer_name, ')') AS Customer
FROM employees e, customers c
WHERE e.id = c.sales_rep_employee_id
ORDER BY Employee;


-- question 0.3
-- I want to see a list of employees in each office.   Show the office name and the employee name
SELECT o.city AS Office, CONCAT(e.firstname, ' ', + e.lastname) AS Employee
FROM offices o, employees e
WHERE o.id = e.office_id
ORDER BY Office;


-- question 0.4
-- I want to see the total number of each employee type based on job title.
-- result should the job title and the number of employess with that job title.
SELECT job_title, COUNT(*) AS Employees_count
FROM employees
GROUP By job_title;


-- question 0.5
-- I want to see a list of all payments each customer has made.
-- Order the list by customer name ascending, then by the payment amount descending
SELECT c.customer_name AS Customer, p.amount AS Payments
FROM customers c, payments p
WHERE c.id = p.customer_id
ORDER BY Customer, Payments DESC;


-- question 0.6
-- I want to see a list of products that have never been sold.   use ... not in ( select product_id from order_details ) in your where clause
SELECT product_name
FROM products
WHERE id
NOT IN ( SELECT product_id FROM orderdetails );


-- question 0.7
-- Are there any customers that have never made an order
SELECT DISTINCT customer_name
FROM customers
WHERE id
NOT IN (SELECT customer_id FROM payments);

-- Question 1
-- How many customer are handled by each office.  I want to see the office name and the count of the number of customers in that office.
SELECT o.city AS Office, COUNT(c.customer_name) AS Num_Customers
FROM offices o, employees e, customers c
WHERE o.id = e.office_id AND e.id = c.sales_rep_employee_id
GROUP BY Office;

-- Question 2
-- I want to see the products with the most margin at the top of the table.
-- Include the product name, buy price, msrp, and margin in the results.  Margin is calculated (MSPR - buy_price)
SELECT product_name, buy_price, msrp, (msrp - buy_price) AS Margin
FROM products
ORDER BY Margin DESC;


-- Question 2.5
-- I want to see the top 5 customers in each state based on margin
SELECT customer_name, state, profit_margin
FROM ( SELECT  c.customer_name, c.state, SUM(od.quantity_ordered * (p.msrp - p.buy_price)) AS profit_margin,
               (ROW_NUMBER() OVER (PARTITION BY state ORDER BY SUM(od.quantity_ordered * p.msrp - p.buy_price) DESC)) AS rows_count
       FROM customers c, orders o, orderdetails od, products p
       WHERE c.id = o.customer_id
         AND  o.id = od.order_id
         AND od.product_id = p.id
         AND c.country = "USA"
         AND c.state IS NOT NULL
       GROUP BY c.id , c.state
       ORDER BY c.state , profit_margin DESC
     ) AS SubQuery
WHERE rows_count <= 5;


SELECT customer_name, state, profit_margin
FROM ( SELECT  c.customer_name, c.state, SUM(od.quantity_ordered * (p.msrp - p.buy_price)) AS profit_margin,
               (ROW_NUMBER() OVER (PARTITION BY state ORDER BY SUM(p.msrp - p.buy_price) DESC)) AS rows_count
       FROM customers c
                INNER JOIN orders o ON c.id = o.customer_id
                INNER JOIN orderdetails od ON o.id = od.order_id
                INNER JOIN products p ON p.id = od.product_id
       WHERE c.state IS NOT NULL
         AND c.country = 'USA'
       GROUP BY c.id , c.state
       ORDER BY c.state , profit_margin DESC
     ) AS SubQuery
WHERE rows_count <= 5;


-- Question 3
--  I want to see the top 5 salesmen in the company based on the total amount sold
SELECT CONCAT(firstname, ' ', + lastname) AS Employee, SUM(pay.amount) total_sales
FROM employees e, customers c, payments pay
WHERE e.id = c.sales_rep_employee_id
  AND c.id = pay.customer_id
GROUP BY e.id
ORDER BY total_sales DESC
LIMIT 5;

-- Question 4
-- I want to see the top 5 salesmen based on overall profit (margin)

-- Question 5
-- I want to see all of the orders that happened in 2004.   You can use a function called year(order_date) = 2004

-- Question 6
-- I want to see the total amount of all orders grouped by the year

-- Question 7
-- I want to see the top 5 products based on quantity sold across all orders

-- question 7.5
-- how many times has each product appeared in an order reguardless of how many were purchased.

-- question 7.6
-- how many products would be out of stock baed on the amount sold acrosss tiem.  -- not sure if the data will spoort this .. basically
-- looking for any product where the sum of the quantity sold is greater than the quantity in stock

-- question 7.9
-- I want to see the distinct order status ordered alphabetically

-- Question 8
-- I want to see the office name and the distinct product lines that have been sold in that office.  This will require joining almost all of the tables.
select distinct o.name as office_name, pl.productlines as product_line_name  ....