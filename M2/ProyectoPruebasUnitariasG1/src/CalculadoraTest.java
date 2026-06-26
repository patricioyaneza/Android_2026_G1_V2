import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	private static Calculadora calculadora;
	
	@BeforeAll
	public static void configuracion()
	{
		System.out.println("Solo se ejecuta una vez por clase");
		calculadora = new Calculadora();
		System.out.println("La variable calculadora ya está creada.");
	}
	
	@BeforeEach
	void configuracionPorMetodo()
	{
		System.out.println("Se ejecuta automáticamente por cada test");
	}
	
	@Test
	void sumarAmbosValoresPositivos()
	{
		System.out.println("calculadora t1: " + calculadora.sumar(10, 10));
		Calculadora c = new Calculadora();
		int resultado = c.sumar(20, 10);
		assertEquals(30, resultado);
	}

	@Test
	void sumarAmbosValoresNegativos()
	{
		System.out.println("calculadora t2: " + calculadora.sumar(20, 20));
		Calculadora c = new Calculadora();
		int resultado = c.sumar(-20, -10);
		assertEquals(-30, resultado);
	}

	@Test
	void sumarPrimerValorPositivo()
	{
		Calculadora c = new Calculadora();
		int resultado = c.sumar(20, -10);
		assertEquals(10, resultado);
	}
	@Test
	void sumarSegundoValorPositivo()
	{
		Calculadora c = new Calculadora();
		int resultado = c.sumar(-20, 10);
		assertEquals(-10, resultado);
	}
	
	// Ejercicio	:
	// agregar 4 pruebas a cada una de 
	// estas operaciones
	

	@Test
	void restarAmbosValoresPositivos()
	{
		Calculadora c = new Calculadora();
		int resultado = c.restar(20, 10);
		assertEquals(10, resultado, "La resta de 10 a 20 debe ser +10");
	}

	@Test
	void restarAmbosValoresNegativos()
	{
		Calculadora c = new Calculadora();
		int resultado = c.restar(-20, -10);
		assertEquals(-10, resultado, "Valores entregados son negativos");
	}

	@Test
	void restarPrimerValorPositivo()
	{
		Calculadora c = new Calculadora();
		int resultado = c.restar(20, -10);
		assertEquals(30, resultado);
	}
	@Test
	void restarSegundoValorPositivo()
	{
		Calculadora c = new Calculadora();
		int resultado = c.restar(-20, 10);
		assertEquals(-30, resultado);
		
	}
	

	@Test
	void multiplicarNumerosPositivos()
	{		
		int resultado = calculadora.multiplicar(50, 9);
		assertNotEquals(45, resultado);
		
	}

	@Test
	void multiplicarPorCero()
	{		
		int resultado = calculadora.multiplicar(50, 0);
		assertNotEquals(10, resultado);		
	}
	
}
