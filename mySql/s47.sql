-- Indirizzi completi, tra locations e countries
select street_address, city, country_name 
from locations join countries
using (country_id); 


-- Nome di tutti i dipendenti e nome del loro department
select last_name, first_name, department_name
from employees join departments
using (department_id); 


-- Come sopra, ma solo per chi è basato a Toronto
select last_name, first_name, department_name
from employees join departments using (department_id)
join locations using (location_id)
where city like 'Toronto'; 


select count(EMPLOYEE_ID)
from employees
where LAST_NAME = 'lee';


-- Chi è stato assunto dopo David Lee
select last_name, first_name
from employees
where HIRE_DATE > (select hire_date from employees where last_name = 'lee'); 


-- Chi è stato assunto prima del proprio manager
select e.first_name, e.last_name
from employees e join employees m
on (e.manager_id = m.employee_id)
where e.HIRE_DATE < m.HIRE_DATE; 


-- Chi ha lo stesso manager di Lisa Ozer
select last_name, first_name
from employees
where manager_id = (select manager_id from employees where LAST_NAME = 'ozer'); 
 

-- Chi lavora in un department in cui c’è almeno un employee con una ‘u’ nel cognome
select last_name, first_name
from employees
where DEPARTMENT_ID 
in (select distinct DEPARTMENT_ID from employees where LAST_NAME like '%u%');


-- Chi lavora nel department Shipping
select last_name, first_name
from employees join departments
using (department_id) 
where DEPARTMENT_name = 'shipping'; 


-- Chi ha come manager Steven King
select first_name, last_name
from employees
where manager_id in (select EMPLOYEE_ID from employees where LAST_NAME like 'King' and first_name like 'Steven'); 