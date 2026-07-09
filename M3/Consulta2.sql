select p.id_producto, 
		p.Nombre, 
        p.Descripcion as Descripción, 
        m.nombre as Marca,
        c.nombre as Categoría, 
        p.Stock, 
        p.Precio
from producto p
	inner join categoria c on c.id_categoria = p.id_categoria
	inner join marca m on m.id_marca = p.id_marca;
-- Ejercicio 1: agregar la marca del producto    
-- Ejercicio 2: mostrar todas las facturas junto con los datos de los clientes 


select f.Id_factura as Folio,
		f.Fecha,
		f.Total,
		f.Metodo_pago "Método de Pago",
		c.Nombre,
		c.Apellido,
		c.Correo, 
        c.direccion Dirección,
        c.telefono Teléfono        
from factura as f
	inner join cliente as c on f.id_cliente = c.id_cliente
where f.metodo_pago = "Efectivo"
-- and c.id_cliente = 3
and c.nombre like '%l%'
;