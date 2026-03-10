# Write your MySQL query statement below

-- now select the max number from this
SELECT MAX(num) AS num
FROM MyNumbers
WHERE num IN (
    -- this are the singles numbers in table
    SELECT num
    FROM MyNumbers
    GROUP BY num
    HAVING COUNT(num) = 1
)