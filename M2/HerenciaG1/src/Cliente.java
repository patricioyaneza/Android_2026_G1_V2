
public class Cliente extends Persona {
	private String tipo;
	private Double descuento;
		
	
	public Cliente() {
		super();
		this.tipo = "";
		this.descuento = 0.0;		
	}

	public Cliente(String rut, String nombre, String tipo, Double descuento) {
		super(rut, nombre);
		this.tipo = tipo;
		this.descuento = descuento;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getDescuento() {
		return descuento;
	}

	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}
	
	@Override   // sobre escribir
	public void imprimirDatos() // imprimir, mostrarDatos, showInfo
	{
		//System.out.println("Rut		: " + this.rut);
		//System.out.println("Nombre		: " + this.nombre);
		super.imprimirDatos();		
		System.out.println("Tipo		: " + this.tipo);
		System.out.println("Descuento	: " + this.descuento);
	}

	
}
