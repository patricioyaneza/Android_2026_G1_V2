
public class Persona { // definir atributos que tienen en común los clientes y empleados
	protected String rut;
	protected String nombre;	

	public Persona()
	{
		this.rut = "";
		this.nombre = "";
	}
	
	public Persona(String rut, String nombre) {
		this.rut = rut;
		this.nombre = nombre;
	}
	

	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	

	public void imprimirDatos() {
		System.out.println("Rut	: " + this.rut);
		System.out.println("Nombre	: " + this.nombre);
	}
		
}
