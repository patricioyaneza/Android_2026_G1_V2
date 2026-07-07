select * from producto;

SELECT id_producto, nombre, descripcion, precio 
FROM PRODUCTO;

select * from producto order by nombre;
select * from producto order by nombre desc;

select * from producto order by id_categoria;
select * from producto order by id_categoria, nombre desc;

select upper(nombre), lower(descripcion),
	length(nombre), precio + 100
from producto;

select upper(nombre) as Nombre, 
		lower(descripcion)  Descripción,
		length(nombre) as "Otro Nombre",
        precio, precio + 100
from producto;

select count(id_producto) from producto; -- contar filas
select sum(stock) from producto; -- sumar valores
select avg(precio) from producto; -- promediar valores
select min(stock) from producto;
select max(stock) from producto;
select * from producto;

SELECT id_producto, nombre, descripcion, precio 
FROM PRODUCTO;

select * from producto order by nombre;
select * from producto order by nombre desc;

select * from producto order by id_categoria;
select * from producto order by id_categoria, nombre desc;

select upper(nombre), lower(descripcion),
	length(nombre), precio + 100
from producto;

select upper(nombre) as Nombre, 
		lower(descripcion)  Descripción,
		length(nombre) as "Otro Nombre",
        precio, precio + 100
from producto;

select count(id_producto) from producto; -- contar filas
select sum(stock) from producto; -- sumar valores
select avg(precio) from producto; -- promediar valores
select min(stock) from producto;
select max(stock) from producto;

select id_categoria, min(stock), max(stock) 
from producto group by id_categoria;

select count(id_producto), sum(stock), avg(precio)
from producto;

-- where permite filtrar información
select * from producto where id_producto < 5;

-- Ejercicio 1: mostrar los 5 producto 
-- que tienen el mayor precio

