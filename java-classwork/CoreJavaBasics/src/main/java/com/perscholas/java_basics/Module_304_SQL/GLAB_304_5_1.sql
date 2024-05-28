-- GLAB 304.5.1
/* The following statement finds whether the quantity of products, which customers ordered, is odd or even.
	First, we used the SUM() function to get the total quantity of products by the sales order.
	Then we used the MOD() function to find the remainder of the total quantity divided by two.
    This results in zero or one, depending on where the total quantity is (even or odd).
	Finally, we used the IF() function to display the Odd and Even string based on the result of the MOD() function. */
SELECT order_id, SUM(quantity_ordered) as Qty,
       IF(MOD(SUM(quantity_ordered),2),'Odd', 'Even') as oddOrEven
FROM    orderdetails
GROUP BY    order_id
ORDER BY    order_id;

-- TRUNCATE() Function
-- Let’s review some examples of using the TRUNCATE() function, using SQL TRUNCATE() with a positive number of decimal places.
SELECT TRUNCATE(1.555,1);
-- Because the number of decimal places argument is 1, the TRUNCATE() function keeps only one decimal place in the return value.

-- ROUND() function
-- The following query finds the average order line item values by product ids:
SELECT product_id, AVG(quantity_ordered * price_each) as avg_order_value
FROM orderDetails
GROUP BY product_id;
/* The average order values of products are not quite readable because they contain many numbers after the decimal points.
	For the average values, the number after the decimal point may not be important.
    Therefore, you can use the ROUND() function to round them to zero decimal places, as shown in the following query: */
SELECT product_id,
       ROUND(AVG(quantity_ordered * price_each)) as avg_order_item_value
FROM orderDetails
GROUP BY product_id;

-- SQL TRUNCATE() vs. ROUND()
-- The following example uses both TRUNCATE() and ROUND() function for comparison:
SELECT   TRUNCATE(1.999,1),  ROUND(1.999,1);
-- As clearly shown in the output, the TRUNCATE() function only trims the decimal places while the ROUND() function performs the rounding.


/* REPLACE() Function
   The syntax of using the REPLACE() function in an UPDATE statement is as follows:
	UPDATE tbl_name SET
		field_name = REPLACE(field_name, string_to_find, string_to_replace)
	WHERE conditions;
Note that when searching for text to replace, SQL uses the case-sensitive match to perform a search for a string to be replaced.
For example:
if you want to correct the spelling mistake in the products table in the sample database, you can use the REPLACE() function as follows: */
UPDATE products
SET product_description = REPLACE(product_description,'abuot','about');
/* The above query will find all occurrences of a spelling mistake ’abuot,’
   and replaces it by the correct word ‘about’ in the productDescription column of the products table. */


-- DATEDIFF() function
-- Let’s take a look at some examples of using the DATEDIFF()  function.
SELECT DATEDIFF('2011-08-17','2011-08-17');
-- #Result  :   0 day
SELECT DATEDIFF('2011-08-17','2011-08-08');
-- #Result:  9 days
SELECT DATEDIFF('2011-08-08','2011-08-17');
-- #Result:  -9 days

-- To calculate the number of days between the required date and shipped date of the orders, we can use the DATEDIFF() function as follows:
SELECT id, DATEDIFF(required_date, shipped_date) as  daysLeft
FROM     orders
ORDER BY  daysLeft DESC;

/* The following statement gets all orders whose status is “In Process,”
   and calculates the number of days between the ordered date and the required date: */
SELECT id, DATEDIFF(required_date, order_date) as remaining_days
FROM    orders
WHERE    status = 'In Process'
ORDER BY remaining_days;

/* For calculating an interval in week or month, you can divide the returned value of the DATEDIFF() function
   by 7 or 30 as the following query:
   Note that the ROUND() function is used to round the results. */
SELECT id,
       ROUND(DATEDIFF(required_date, order_date) / 7, 2),
       ROUND(DATEDIFF(required_date, order_date) / 30,2)
FROM     orders
WHERE    status = 'In Process';


-- DATE_FORMAT() Function
-- We can format the order date, required date, and shipped date of each order based on different date formats specified by the format strings.
SELECT id,
       DATE_FORMAT(order_date, '%Y-%m-%d') Order_date,
       DATE_FORMAT(required_date, '%a %D %b %Y') Required_date,
       DATE_FORMAT(shipped_date, '%W %D %M %Y') Shipped_date
FROM orders;


-- Using DATE_FORMAT() with the ORDER BY clause:
SELECT id,
       DATE_FORMAT(shipped_date, '%W %D %M %Y')  as 'Shipped date'
FROM orders
ORDER BY shipped_date;


-- LPAD(str, len, padstr)
/* The LPAD() function left-pads a string with another string to a certain length.
   LPAD() function returns the string str, left-padded with the string padstr to a length of len characters.
   If str is longer than len, the return value is shortened to len characters. */
SELECT firstname, LPAD(firstname,10,'kk'), LPAD(firstname,5,'kk'), LPAD(firstname,4,'kk') FROM employees;


-- SQL TRIM() Function
/* The data from the user's input is typically not what we expected.
   Sometimes, it is not well-formed (e.g., wrong cases; those containing leading and trailing spaces and other unwanted characters).
   To keep the data in the correct format, before inserting or updating data in the database, you need to clean it up.
   One of the most important tasks in data cleansing is to remove unwanted leading and trailing characters.
   SQL provides a very useful string function named TRIM to help you clean up the data.
   The following illustrates the syntax of the TRIM function.

TRIM([{BOTH|LEADING|TRAILING} [removed_str]] FROM str);

   The TRIM function provides several options
   You can use the LEADING, TRAILING, or BOTH option to explicitly instruct the TRIM function to remove
   leading, trailing, or both leading and trailing unwanted characters from a string.
   If you do not specify anything, the TRIM function uses the BOTH options by default.
   The [removed_str] is the string that you want to remove. By default, it is a space.
   It means that if you do not specify a particular string, the TRIM function removes spaces only.
   The TRIM function returns a string that has unwanted characters removed.
   The following statement removes both leading and trailing spaces from a string. */

SELECT TRIM(' SQL TRIM Function ');


-- SQL LTRIM and RTRIM function
-- If you want to remove only leading or trailing spaces, you can use other string functions such as LTRIM and RTRIM.
-- The following statement uses the LTRIM function to remove the leading spaces of a string.
SELECT LTRIM('  SQL LTRIM function');


-- The following statement uses the RTRIM function to remove the trailing spaces of a string.
SELECT RTRIM('SQL RTRIM function   ');


-- YEAR() Function
/* The YEAR() function takes a date argument and returns the year of the date.
   The YEAR() function returns a year value in the range 1000 to 9999. If the date is zero, the YEAR() function returns 0.
   The following example returns the year January 1st, 2022, which is 2022. */
SELECT YEAR('2002-01-01');

-- The following query uses the YEAR() function to get the number of orders shipped per year.
/* YEAR() function to extracts year information out of the shipped date,
   COUNT() function counts the number of delivered orders,
   and GROUP BY clause groups the number of orders by year. */
SELECT YEAR(shipped_date) as year,  COUNT(id) as orderQty
FROM    orders
GROUP BY YEAR(shipped_date)
ORDER BY YEAR(shipped_date);


-- DAY() Function
/* The DAY() function returns the day of the month of a given date.
   The DAY() function accepts one argument, which is a date value for which you want to get the day of the month.
   If the date argument is zero e.g., '0000-00-00', the DAY() function returns 0.
   If the date is NULL, the DAY() function returns NULL.
   Note that the DAY() function is the synonym of the DAYOFMONTH() function.
   The following example returns the day of the month of 2022-01-15: */
SELECT DAY('2022-01-15');

-- The following statement uses the DAY() function to return the number of orders by day in 2004.
SELECT DAY(order_date) as dayofmonth, COUNT(*)
FROM orders WHERE YEAR(order_date) = 2004
GROUP BY dayofmonth
ORDER BY dayofmonth;
