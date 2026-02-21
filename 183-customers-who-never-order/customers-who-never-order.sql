# Write your MySQL query statement below
SELECT name AS Customers 
FROM Customers 
WHERE id NOT IN (
    SELECT t1.id 
    FROM Customers t1
    JOIN Orders t2
    ON t1.id = t2.customerId
)