import java.util.Scanner;

public class Principal { 

	// metodo main, es el punto de entrada del programa, 
	// es donde se inicia la ejecución del programa
	public static void main(String[] args) { // metodo (funcion)
		// TODO Auto-generated method stub
		// imprime en la consola el mensaje "Hola Mundo"
		
		System.out.print("Hola Mundo");
		System.out.println("Hola Mundo");
		
		// creación de variables		
		int numero = 100;
		String nombre = "Juan";
		
		int numero2; // se crea la variable pero no se le asigna un valor
		numero2 = 200; // se asigna un valor a la variable numero2
		
		int valor = 999999999;
		long valor2 = 9999999999999999L; // se debe agregar la letra L al final del número para indicar que es un valor de tipo long
		// error de compilación, no se puede asignar un valor de tipo String a una variable de tipo int
		// numero2 = "dfasdf"; 
		
		// mostrar al usuario el valor de la variable
		System.out.println(numero);
		System.out.println(nombre);
		System.out.println(numero2);
		
		float nota = 6.5f; 
		double nota2 = 6.5; 
	
// Leer teclado
		Scanner leerTeclado = new Scanner(System.in);
		
		System.out.print("Ingrese su nombre: ");
		String nombreUsuario = leerTeclado.nextLine(); 
//		System.out.println("Hola " + nombreUsuario);
		
		// ejercicio 2: pedir apellido y edad
		System.out.print("Ingrese su apellido: ");
		String apellidoUsuario = leerTeclado.next();
		
		System.out.print("Ingrese su edad: ");
		int edadUsuario = leerTeclado.nextInt(); // permite leer numero entero
		
		System.out.println("Hola " + nombreUsuario + " " + 
							apellidoUsuario + ", tienes " + 
							edadUsuario + " años.");
		
		

	}
}
