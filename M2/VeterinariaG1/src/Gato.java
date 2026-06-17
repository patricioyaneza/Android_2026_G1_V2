public class Gato extends Animal implements Operaciones{

	private boolean tieneVisionNocturna;

	public Gato() {
		super();
		this.tieneVisionNocturna = true;
	}

	public Gato(String nombre, double peso, boolean tieneVisionNocturna) {
		super(nombre, peso);
		this.tieneVisionNocturna = tieneVisionNocturna;
	}

	public boolean isTieneVisionNocturna() {
		return tieneVisionNocturna;
	}

	public void setTieneVisionNocturna(boolean tieneVisionNocturna) {
		this.tieneVisionNocturna = tieneVisionNocturna;
	}

	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Tiene visión nocturna : " + this.tieneVisionNocturna);
	}
	@Override
	public void emitirSonido()
	{
		System.out.println("miau");
	}

	@Override
	public boolean grabar() {
		// TODO Auto-generated method stub
		int total = 5000 * IVA;
		System.out.println("Cobro total : " + total);
		System.out.println("Datos guardados");
		return true;
	}

	@Override
	public boolean modificar() {
		// TODO Auto-generated method stub
		System.out.println("Datos modificados");
		return true;
	}
}