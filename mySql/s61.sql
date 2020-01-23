-- Inserire come assunti oggi:
-- 201, Maria Rossi, 5000€ e 202, Franco Bianchi, 4500€

insert into coders (coder_id, first_name, last_name, hire_date, salary)
values (201, 'Maria', 'Rossi', current_date(), '5000'); 

insert into coders (coder_id, first_name, last_name, hire_date, salary)
values (202, 'Franco', 'Bianchi', current_date(), '4500'); 

-- Cambiare il nome da Maria a Mariangela
update coders
set first_name = 'Mariangela'
where first_name = 'Maria'; 

-- Aumentare di 500€ i salari minori di 6000€
update coders
set salary = (salary + 500)
where salary < 6000; 

-- Eliminare Franco Bianchi
delete from coders
where first_name = 'Franco' and last_name = 'Bianchi';
 
delete from coders
where coder_id = 201;

commit; 

select * from coders; 
