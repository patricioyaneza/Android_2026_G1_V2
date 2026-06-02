import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Vehiculo 1:");
		Vehiculo v1 = new Vehiculo();		
		v1.mostrarInformacion();
		
		System.out.println("\nVehiculo 2:");
		Vehiculo v2 = new Vehiculo("ABC123", "Toyota", "Corolla", "Rojo", 5 , true);
		v2.mostrarInformacion();		
		// v2.setPatente("DEF123");
		
		
		System.out.println("\nModificando patente del Vehiculo 1...");
		v1.setPatente("XYZ789"); //permite modificar el valor del atributo patente del objeto v1
		System.out.println("Patente modificada");
		
		// muestra el valor del atributo patente del objeto v1
		System.out.println("La patente de V1 es: " + v1.getPatente() );
		
		// Ejercicio 1: crear un 3er vehiculo, completar datos y mostrar.
		
		System.out.println("\nVehiculo 3:");
		Vehiculo v3 = new Vehiculo("XXTT68","Mazda", "M2","Verde",4, true);
		v3.mostrarInformacion();
		
		System.out.println("\nVehiculo 4:");
		Vehiculo v4 = new Vehiculo();
		v4.setPatente("ZZZ999");
		v4.setMarca("Ford");
		v4.setModelo("Fiesta");
		v4.setColor("Azul");
		v4.setCantidadPuertas(5);
		v4.setTieneAireAcondicionado(true);
		v4.mostrarInformacion();
		
	}
}
