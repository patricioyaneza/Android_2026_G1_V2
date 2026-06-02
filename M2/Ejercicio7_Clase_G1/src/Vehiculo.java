
public class Vehiculo {

	//1.- Atributos
    private String patente;
    private String marca;
    private String modelo;
    private String color;
    private int cantidadPuertas;
    private boolean tieneAireAcondicionado;
    
  
    //2.- Constructores
    // new Vehiculo();
    public Vehiculo() {
		this.patente = "";
		this.marca = "";
		this.modelo = "";
		this.color = "";
		this.cantidadPuertas = 3;
		this.tieneAireAcondicionado = false;
	}
    
    // new Vehiculo("ABC123", "Toyota", "Corolla", "Rojo", 4, true);
    public Vehiculo(String patente, String marca, String modelo, String color, int cantidadPuertas, boolean tieneAireAcondicionado) {
    
    	this.patente = patente;
    	this.marca = marca;
    	this.modelo = modelo;
    	this.color = color;
    	this.cantidadPuertas = cantidadPuertas;
    	this.tieneAireAcondicionado = tieneAireAcondicionado;
    }
    
    //3.- Getters y Setters (get y set)  v1.setPatente("ABC123");
    public void setPatente(String patente) {
    	this.patente = patente;
	}
	public String getPatente() {
		return this.patente;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMarca() {
		return this.marca;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return this.modelo;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return this.color;
	}
	public void setCantidadPuertas(int cantidadPuertas) {
		this.cantidadPuertas = cantidadPuertas;
	}
	public int getCantidadPuertas() {
		return this.cantidadPuertas;
	}
	public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
		this.tieneAireAcondicionado = tieneAireAcondicionado;
	}
	public boolean isTieneAireAcondicionado() {
		return this.tieneAireAcondicionado;
	}
	
	//4.- Métodos personalizados o customer  
	public void mostrarInformacion() {
		System.out.println("Patente: " + this.patente);
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Color: " + this.color);
		System.out.println("Cantidad de puertas: " + this.cantidadPuertas);
		System.out.println("Tiene aire acondicionado: " + this.tieneAireAcondicionado);
	}
		

} // cierra clase Vehiculo
