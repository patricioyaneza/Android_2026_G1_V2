
public class Empleado extends Persona {
	private String cargo;
	private int sueldo;
	public Empleado(String rut, String nombre, String cargo) {
		super(rut, nombre);
		this.cargo = cargo;
	}	
}
