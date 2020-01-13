SELECT * FROM me.employees;

select FIRST_NAME, LAST_NAME, email, PHONE_NUMBER, HIRE_DATE from employees
order by last_name, FIRST_NAME;


select FIRST_NAME, LAST_NAME, email, PHONE_NUMBER, HIRE_DATE from employees 
where first_name = 'David' or  first_name = 'Peter'; 


select FIRST_NAME, LAST_NAME, email, PHONE_NUMBER, HIRE_DATE from employees
where DEPARTMENT_ID in (30, 50, 60);


select FIRST_NAME, LAST_NAME, email, PHONE_NUMBER, HIRE_DATE from employees 
where SALARY > 10000;

 
select FIRST_NAME, LAST_NAME, email, PHONE_NUMBER, HIRE_DATE from employees
 where salary < 4000 and salary > 15000;
 
 
select FIRST_NAME, LAST_NAME, email, PHONE_NUMBER, HIRE_DATE from employees
where (salary < 4000 or salary > 15000) and (DEPARTMENT_ID in (50, 80));
 