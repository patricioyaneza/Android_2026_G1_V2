
public class Calculadora {

	public int sumar(int numero1, int numero2)
	{
		return numero1 + numero2;
	}

	public int restar(int numero1, int numero2)
	{
		return numero1 - numero2;
	}

	public int multiplicar(int numero1, int numero2)
	{
		return numero1 * numero2;
	}
	public double division(int numero1, int numero2)
	{
		if(numero2 == 0)
			return 0;
		return numero1 / numero2;
	}
	
}
