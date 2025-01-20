# Write your MySQL query statement below
SELECT Employee.name, Bonus.bonus FROM Employee LEFT JOIN Bonus ON Bonus.empId = Employee.empId WHERE Bonus.bonus < 1000 or Bonus.bonus is null ;