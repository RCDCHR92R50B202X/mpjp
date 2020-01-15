select last_name, salary, truncate(salary/100*8.5,2) as delta, truncate (salary + salary/100*8.5,2)  as 'salary+8.5%'
from employees;


select datediff (curdate(), hire_date) 
from employees; 


select last_name as employee, ifnull(commission_pct, 'no value') as commission
from employees
order by LAST_NAME;