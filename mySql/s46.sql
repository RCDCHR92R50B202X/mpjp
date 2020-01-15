-- Salary: maggiore, minore, somma, media
Select max(salary), min(salary), sum(salary), avg(salary)
from employees; 

-- Salary: maggiore, minore, somma, media per ogni job_id
select job_id, max(salary), min(salary), sum(salary), avg(salary)
from employees
group by JOB_ID;

-- Quanti dipendenti per ogni job_id
select JOB_ID, count(employee_id) 
from employees
group by JOB_ID; 

-- Quanti sono gli IT_PROG
select count(employee_id)
from employees
where JOB_ID like 'it_prog';

-- Quanti sono i manager
select count(distinct manager_id)
from employees;  

-- Nome dei dipendenti che non sono manager
select last_name, FIRST_NAME
from employees
where EMPLOYEE_ID not in (select distinct manager_id from employees where MANAGER_ID is not null); 

-- Qual è la differenza tra il salario maggiore e il minore
select max(salary) - min(salary) as differenza
from employees;

-- Come sopra, ma per ogni job_id, non considerando dove non c’è differenza
select max(salary) - min(salary) as differenza
from employees
group by job_id
having (max(salary) - min(salary)) != 0; 

-- Qual è il salario minimo con i dipendenti raggruppati per manager, non considerare chi non ha manager, né i gruppi con salario minimo inferiore a 6.000€ 
select min(salary) 
from employees 
where MANAGER_ID is not null
group by manager_id
having (min(salary)) >= 6000; 