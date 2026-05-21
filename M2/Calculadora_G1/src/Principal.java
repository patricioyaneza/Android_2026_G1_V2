import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// muestra mensajes al usuario
		System.out.println("****** Calculadora ******");
		/*
			int numero1 = 2;
			int numero2 = 3;
		*/
		
		Scanner leerTeclado = new Scanner(System.in);
		
		System.out.print("Ingrese el primer número: ");
		int numero1 = leerTeclado.nextInt();
		System.out.print("Ingrese el segundo número: ");
		int numero2 = leerTeclado.nextInt();
		
		
		// muestra el resultado de la suma
		System.out.println("Suma: " + (numero1 + numero2));
		int resultadoResta = numero1 - numero2;
		// muestra el resultado de la resta
		System.out.println("Resta: " + resultadoResta);
		// muestra el resultado de la multiplicación
		System.out.println("Multiplicación: " + (numero1 * numero2));
		// muestra el resultado de la división
		double resultadoDivision = (double)numero1 / numero2;
		System.out.println("División: " + resultadoDivision);
		
		
		
		// Ejercicio 3: Solicitar los 2 numeros al usuario.
		
	}

}
