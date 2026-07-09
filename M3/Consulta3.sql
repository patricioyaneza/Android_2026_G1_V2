select * from marca;
-- guardamos datos en la tabla
INSERT INTO MARCA (nombre) values ('IDEAL');
INSERT INTO MARCA (id_marca, nombre) values (9, 'Costa');
INSERT INTO MARCA (id_marca, nombre) values (null, 'incacola');

-- modifcar valores en una tabla
UPDATE MARCA SET NOMBRE = 'INCA COLA' WHERE ID_MARCA = 11;

-- Ejercicio 3: modificar las marcas IDEAL y INCA COLA por Ideal e Inca Cola
select * from marca where id_marca in (7, 11) ; -- id_marca = 7 or id_marca = 11
update marca set nombre = 'Inca Cola' where id_marca = 11;
update marca set nombre = 'Ideal' where id_marca = 7;


-- eliminar filas de una tabla
DELETE FROM MARCA WHERE ID_MARCA = 11;
DELETE FROM MARCA WHERE ID_MARCA = 1;
select * from producto; 
select * from marca where id_marca = 11 ;

