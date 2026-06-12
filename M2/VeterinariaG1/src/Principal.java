
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perro perro1 = new Perro();
		perro1.setNombre("firulais");
		perro1.setPeso(10.0);
		perro1.setRaza("Salchicha");
		
		perro1.imprimir();
		
		String numero = "";
		
		//  super clase = sub clase
		Animal animal1 = new Perro();
		Animal animal2 = perro1;
		// Perro perroX = new Animal(); Error
		Animal animal3 = new Animal("benji", 20.5);
		animal3.imprimir();
		
		System.out.println("\n\n");
		perro1.emitirSonido();
	}
}
