select first_name, last_name, department_name 
from employees join departments
using(department_id);

select first_name, last_name, JOB_TITLE
from employees join jobs
using (job_id);

select first_name, last_name, job_title
from employees e join jobs j
on (e.salary = j.min_salary) or (e.salary = j.max_salary)
where(e.job_id = j.job_id);

select first_name, last_name
from employees join departments 
using (department_id) join locations 
using (location_id)
where COUNTRY_ID = 'uk'; 

select DEPARTMENT_NAME, FIRST_NAME, LAST_NAME
from departments d join employees 
on (d.manager_id  = employee_id); 