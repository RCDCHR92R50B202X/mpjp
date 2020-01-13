select first_name, last_name 
from employees
where  hire_date like '2005%'; 



select distinct job_id 
from employees
order by job_id asc; 



select first_name, last_name 
from employees 
where COMMISSION_PCT is not null; 



select first_name, last_name 
from employees
where (FIRST_NAME like '%a%') or (LAST_NAME like '%a%'); 



select DEPARTMENT_NAME
from departments
order by DEPARTMENT_NAME asc; 



select street_address
from locations
where COUNTRY_ID = 'IT'; 


select first_name, last_name, HIRE_DATE
from employees
where LAST_NAME like 'mc%'; 

select first_name, last_name, HIRE_DATE
from employees
order by hire_date desc; 

select first_name, last_name
from employees
where (first_NAME like '_h%') or (last_NAME like '_h%'); 