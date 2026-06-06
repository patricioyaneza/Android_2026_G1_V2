
public class Empleado extends Persona {
	String cargo;
	int sueldo;
	public Empleado(String rut, String nombre, String cargo) {
		super(rut, nombre);
		this.cargo = cargo;
	}	
}
