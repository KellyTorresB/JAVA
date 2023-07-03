package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CalculadoraTestCase {

	@Test
	void testSuma() {
		int resultado = Calculadora.suma(2,3);
		Assert.assertEquals(5,resultado); //lo que espero y lo que obtengo 
	
		//Para esta prueba que la suma me de 5 de 3+2 
	}//Test multiplicar
	
	@Test
	void testMultiplicar() {
		int resultado = Calculadora.multiplicar(2, 3);
		Assert.assertEquals(6, resultado);//Lo que espero, lo que tengo
		
	}//Test multiplicar
	@Test
	void testDividir() {
		int resultado = Calculadora.dividir(6, 2);
		Assert.assertEquals(3, resultado);//Lo que espero, lo que tengo 
	}//Test dividir

}
