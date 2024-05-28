select * from employees;
select * from customers;
select * from employees where firstname = 'Diane';
select * from employees where job_title = 'Sales Rep';
select * from employees where job_title = 'Sales Rep' order by lastname;
select * from employees where job_title = 'Sales Rep' order by lastname desc limit 5;
select * from employees where job_title = 'Sales Rep' order by firstname asc limit 5;
select count(*) from offices;
select count(*) from offices where country = 'USA';
select distinct firstname from employees order by firstname;
select count(distinct country ) from offices;
select count(*) as 'Offices count' from offices;
select count(*) as 'Offices #' from offices o where o.country = 'USA';
select * from payments;
select count(*) as 'Payments count'  from payments p where p.customer_id = 103;
select * from offices;
insert into offices (city, phone, address_line1, state, country, postal_code, territory) value ('Denver', '555-1212', '123 Main St', 'CO', 'USA', '80203', 'MW');
-- delete from offices where id= '8';
update offices set  address_line2 ='line2' where id = '9';

-- I want to see all the employees that work in an office in the US
select * from employees e, offices o where e.office_id = o.id and o.country = 'USA';
select e.*, o.city from employees e, offices o where e.office_id = o.id and o.country = 'USA';
select e.firstname, e.lastname, e.job_title, o.city from employees e, offices o where e.office_id = o.id and o.country = 'USA';

-- lets start looking what there is in each table
select * from orders;
select * from orderdetails;
select * from orderdetails where order_id = 10103 order by order_line_number;

-- Calculate the total price for each line item in the order 10103
select od.*, (quantity_ordered * price_each) as total_price from orderdetails od where order_id = 10103 order by order_line_number;
-- The FLOOR() function in SQL is used to return the largest integer that is less than or equal to a given numeric expression.
-- Essentially, it rounds down the input value to the nearest integer value. The syntax for the FLOOR() function is as follows:
-- FLOOR(numeric_expression)
select od.*, floor(quantity_ordered * price_each) as total_price from orderdetails od where order_id = 10103 order by order_line_number;

-- Add the product name to this query result
select od.*, (quantity_ordered * price_each) as total_price, p.product_name
from orderdetails od, products p
where order_id = 10103 and p.id = od.product_id
order by order_line_number;

-- Add the date of the order
select * from orders where id = 10103;	-- This only returns a single record
-- However when we join against the order table the order date is duplicated because each line time in the order details was
-- essentially ordered on the same day
select od.*, (quantity_ordered * price_each) as total_price, p.product_name, o.order_date
from orderdetails od, products p, orders o
where order_id = 10103
  and p.id = od.product_id
  and o.id = od.order_id
order by order_line_number;

-- Add customer name to the query
select od.*, (quantity_ordered * price_each) as total_price, p.product_name, o.order_date, c.customer_name
from orderdetails od, products p, orders o, customers c
where order_id = 10103
  and p.id = od.product_id
  and o.id = od.order_id
  and o.customer_id = c.id
order by order_line_number;

-- The sum of total cost for all line items for order 10103
-- the sum() function is called as aggregator fucntion
select sum(quantity_ordered * price_each)
from orderdetails od
where order_id = 10103;

select od.*, (quantity_ordered * price_each) as total_price
from orderdetails od
where order_id = 10103;

select sum(quantity_ordered * price_each) as total_order_cost,
       max(quantity_ordered) as max_quantity_order,
       min(quantity_ordered) as min_quantity_order,
       avg(quantity_ordered * price_each) as average_line_item_cost,
       avg(quantity_ordered) as average_quantity_ordered
from orderdetails od
where order_id = 10103;


-- Display the total cost of each order for all orders
select *  from orderdetails;

select order_id, sum(quantity_ordered * price_each) as total_order_cost
from orderdetails
group by order_id;

select order_id, sum(quantity_ordered * price_each) as total_order_cost,
       min(quantity_ordered) as min_quantity_ordered,
       count(*) as number_of_products
from orderdetails
group by order_id;

select order_id, sum(quantity_ordered * price_each) as total_order_cost
from orderdetails
where order_id in (10101, 10103, 10104)
group by order_id;

-- Display the total amount each customer has spent
-- step 1 was to join the customers table and orders table
-- we limited our columns in the result set so the data was a bit more consumable by human's brain
-- put an order by on this so we can see all the customers order together
select c.customer_name, o.id as order_id
from customers c, orders o
where c.id = o.customer_id
order by c.customer_name;

-- step 2 we need to continue joining over to the order details table
select c.customer_name, o.id as order_id, od.product_id
from customers c, orders o, orderdetails od
where c.id = o.customer_id
  and o.id = od.order_id
order by customer_name, order_id;

-- step 3
select c.id, c.customer_name, o.id as order_id, od.product_id, quantity_ordered, price_each, (quantity_ordered * price_each) as line_item_cost
from customers c, orders o, orderdetails od
where c.id = o.customer_id
  and o.id = od.order_id
order by customer_name, order_id;

-- step 4 Add the group by
select c.id, c.customer_name, sum(quantity_ordered * price_each) as total_customer_spend
from customers c, orders o, orderdetails od
where c.id = o.customer_id
  and o.id = od.order_id
group by c.id
order by total_customer_spend desc;

-- To expand the original queston to see the sum of each order for each customer
-- addes an order by for the order_id so we can see the total cost for each order for all customers
select c.id, c.customer_name, o.id, sum(quantity_ordered * price_each) as total_order_cost
from customers c, orders o, orderdetails od
where c.id = o.customer_id
  and o.id = od.order_id
group by c.id, o.id
order by c.customer_name;

--
select c.id, c.customer_name, o.id as order_id, sum(quantity_ordered * price_each) as total_order_cost
from customers c, orders o, orderdetails od
where c.id = o.customer_id
  and o.id = od.order_id
group by c.id, o.id
having total_order_cost > 50000
order by c.customer_name;

