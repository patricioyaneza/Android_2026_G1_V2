
public class Empleado extends Persona {
	private String cargo;
	private int sueldo;
	public Empleado() {
		super();
		this.cargo = "";
		this.sueldo= 0;
	}
	public Empleado(String rut, String nombre, String cargo, int sueldo) {
		super(rut, nombre);
		this.cargo = cargo;
		this.sueldo = sueldo;
	}
	

	// agregar constructor sin parametros, getter and setter, y sobre escribir
	// metodo imprimirDatos()
    // GETTER CARGO
    public String getCargo() {
    	return cargo;
    }
    
    // SETTER DE CARGO    
    public void setCargo(String cargo) {
    	this.cargo = cargo;
    }
    
    // GETTER SUELDO
    public int getSueldo() {
    	return sueldo;
    }
    
    // SETTER SUELDO
	public void setSueldo(int sueldo) {
    	this.sueldo = sueldo;
    }
    
	 @Override
     public void imprimirDatos() {
         super.imprimirDatos();
         System.out.println("Cargo  : "+ this.cargo);
         System.out.println("Descuento  : "+ this.sueldo);                     
     }
}
