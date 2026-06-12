
public class Animal {
	// atributo 
	protected String nombre;
	protected double peso;
	
	// metodo constructor con y sin parametros

	public Animal() {
		this.nombre = "";
		this.peso = 0.0;		
	}
	
	public Animal(String nombre, double peso) {
		this.nombre = nombre;
		this.peso = peso;
	}

	// getter and setter accesor y mutador
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
/*		if(nombre.length() == 0)
			System.out.println("Escriba nombre del animal");
		else
*/			
			this.nombre = nombre;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	// metodos personalizados (customer)
	
	public void imprimir() // mostrar los datos de los atributos de la clase
	{
		System.out.println("Nombre	: " + this.nombre);		
		System.out.println("Peso	: " + this.peso);
	}
	
	public void emitirSonido()
	{
		System.out.println("El animal hace ruido");
	}
	
}
