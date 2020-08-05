/*to drop the procedure in database DROP PROCEDURE <procedure name>*/
create procedure recinus2(name in emp1.name%type,salary in emp.salary%type)as begin
insert into emp1
values(name,salary);
end;
/