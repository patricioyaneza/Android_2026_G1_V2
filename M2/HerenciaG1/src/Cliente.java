
public class Cliente extends Persona {
	String tipo;
	Double comision;
	public Cliente(String rut, String nombre, String tipo) {
		super(rut, nombre);
		this.tipo = tipo;
	}
}
