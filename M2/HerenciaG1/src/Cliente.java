
public class Cliente extends Persona {
	private String tipo;
	private Double descuento;
	
	public Cliente(String rut, String nombre, String tipo, Double descuento) {
		super(rut, nombre);
		this.tipo = tipo;
		this.descuento = descuento;
	}
}
