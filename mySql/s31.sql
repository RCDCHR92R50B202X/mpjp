select DEPARTMENT_NAME, FIRST_NAME, LAST_NAME
from departments d left outer join employees 
on (d.manager_id  = employee_id)
order by DEPARTMENT_NAME;  


select DEPARTMENT_NAME
from departments 
where MANAGER_ID is null; 


select e.last_name as employee, m.last_name as manager
from employees e join employees m
on (e.manager_id = m.employee_id)
order by e.LAST_NAME; 