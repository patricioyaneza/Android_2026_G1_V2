
public class Cuenta {
	// 1.- atributos (propiedades)
	private int numeroCuenta;
	private String titular;
	private double saldo;
	
	// 2.- Constructores
	public Cuenta()
	{
		this.numeroCuenta = 0;
		this.titular = "";
		this.saldo = 0.0;
	}
	public Cuenta(int numeroCuenta, String titular, double saldo) {
		this.numeroCuenta = numeroCuenta;
		this.titular = titular;
		this.saldo = saldo;
	}
	// 3.- getters y setters accesores y mutadores
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	// 4.- métodos personalizados o  customer
	public void mostrarDatos()
	{
		System.out.println("\n**** Datos de la cuenta ****");
		System.out.println("Número de cuenta	: " + this.numeroCuenta);
		System.out.println("Titular			: " + this.titular);
		System.out.println("Saldo			: " + this.saldo);
	}
	
	
}
