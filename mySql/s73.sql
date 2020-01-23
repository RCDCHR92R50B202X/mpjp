-- Scrivere e invocare la procedura tomorrow() che stampa la data di domani

drop procedure if exists tomorrow;


delimiter //
create procedure tomorrow()
begin
      select date_add(curdate(), interval 1 day) as 'tomorrowdate';
end;

// delimiter ;

call tomorrow();


-- Modificare tomorrow() per fargli accettare come parametro un nome da stampare

drop procedure if exists p_name;


delimiter //

create procedure p_name(in p_name varchar(20))
    
 begin
	select date_add(curdate(), interval 1 day) as 'tomorrowdate', p_name; 
end;

// delimiter ;

call p_name('tm'); 


-- -- Scrivere e invocare la procedura get_coder() che ritorna nome e cognome di un coder identificato via id

drop procedure if exists get_coder;


delimiter //
create procedure get_coder(in p_coder_id integer, 
out p_last_name varchar(20),
out p_first_name varchar(20)
) begin 

select coder_id, last_name, first_name
into p_coder_id, p_last_name, p_first_name

from coders
where coder_id = p_coder_id;
end; 

// delimiter ; 

call get_coder(104, @last, @first); 
select @last, @first; 






