-- GLAB 304.4.1
/* The following query selects the order line items from the orderdetails table.
   It calculates the subtotal for each line item, and sorts the result based on the subtotal. */
SELECT order_id, order_line_number, quantity_ordered * price_each
FROM orderdetails
ORDER BY quantity_ordered * price_each DESC;

/* To make the query more readable, you can assign an alias to a column in the SELECT statement and use that column alias in the ORDER BY clause:
   In this example, we use subtotal as the column alias for the expression quantity_ordered * price_each, and sort the result set by the subtotal alias. */
SELECT order_id,
       order_line_number,
       quantity_ordered * price_each AS Subtotal
FROM orderdetails
ORDER BY Subtotal DESC;

/* MySQL ORDER BY and NULL Values
   In SQL, NULL comes before non-NULL values.
   Therefore, when you use the ORDER BY clause with the ASC option, NULLs appear first in the result set.
   For example, the following query uses the ORDER BY clause to sort employees by values in the reportsTo column: */
SELECT    firstName, lastName, reports_to
FROM    employees
ORDER BY reports_to;

/* However, if you use the ORDER BY clause with the DESC option, NULLs will appear last in the result set. For example: */
SELECT    firstName, lastName, reports_to
FROM    employees
ORDER BY reports_to DESC;
