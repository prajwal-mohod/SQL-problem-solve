-- Exclude them.
SELECT name
FROM SalesPerson
WHERE sales_id NOT IN (
    -- Find salespersons who sold to RED.
    SELECT o.sales_id 
    FROM Orders o
    JOIN Company c
    ON o.com_id = c.com_id
    WHERE c.name = 'RED'
)
