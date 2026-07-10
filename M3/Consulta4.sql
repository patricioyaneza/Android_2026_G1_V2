set autocommit = 0;

insert into marca (nombre) values ('Super pollo');
select * from marca;
rollback;
commit;