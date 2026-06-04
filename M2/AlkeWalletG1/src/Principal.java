import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		
		Cuenta billetera1 = new Cuenta(123456, "Katherinne Solís", 50000.0);
		billetera1.mostrarDatos();

		
		Cuenta billetera2 = new Cuenta(1321, "Juan Pérez", 25000.0);
		billetera2.mostrarDatos();
		
		// Ejericio 1: Solicitar los datos por teclado para 1 billetera 
		// y mostrar los datos de la cuenta
		
		Scanner leerTeclado = new Scanner(System.in);
		Cuenta billetera3 = new Cuenta();
		
		System.out.print("\nIngrese el número de cuenta: ");
		int numeroCuenta = leerTeclado.nextInt();
		
		System.out.print("Ingrese el titular de la cuenta: ");
		leerTeclado.nextLine();
		String titular = leerTeclado.nextLine();
		
		System.out.print("Ingrese el saldo de la cuenta: ");
		double saldo = leerTeclado.nextDouble();
		
		billetera3.setNumeroCuenta(numeroCuenta);
		billetera3.setTitular(titular);
		billetera3.setSaldo(saldo);
		
		billetera3.mostrarDatos();
		
	}

}
