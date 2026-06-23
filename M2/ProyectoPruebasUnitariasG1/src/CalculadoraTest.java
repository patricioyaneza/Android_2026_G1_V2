import static org.junit.jupiter.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSumarNumeroPositivos() {
		Calculadora c = new Calculadora();
		int resultado = c.sumar(10,20);
		assertEquals(30, resultado);
	}

}
