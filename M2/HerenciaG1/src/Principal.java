
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Empleado empleado1 = new Empleado("123", "Juan", "Gerente");
		// Persona empleado2 = new Empleado("456", "Maria", "Vendodora"); // permitido
		//Empleado empleado3 = new Persona("789", "Pedro");// no se permite
		// Cliente cliente1 = new Empleado("321", "Ana", "Premium");// no se permite
		//
		
		Cliente cliente1 = new Cliente("2000", "Diego", "Frecuente", 2.5);
		cliente1.imprimirDatos(); // syso
		
		System.out.println("\n********* Datos de empleados ***********");
		Empleado empleado1 = new Empleado("1000", "Pedro", "Vendedor", 550000);	
		empleado1.imprimirDatos();
		
	}

}
