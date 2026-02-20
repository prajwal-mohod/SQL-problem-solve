# Write your MySQL query statement below
SELECT T1.name AS Employee
FROM Employee T1
JOIN Employee T2
ON T1.managerId = t2.id
    AND T1.salary > T2.salary