
public class Perro extends Animal {
	private String raza;

	public Perro() {
		super();
		this.raza = "";
	}

	public Perro(String nombre, double peso, String raza) {
		super(nombre, peso);
		this.raza = raza;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public void imprimir() {
		super.imprimir();
		//System.out.println("Nombre	: " + this.nombre);		
		//System.out.println("Peso	: " + this.peso);
		System.out.println("Raza	: " + this.raza);
	}
	
	
	
	
}
