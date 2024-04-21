package tests;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import util.Algoritmos;

class TestAlgoritmos {
@Test
void testfactorial() {
	int resultadoesperado = 720;
	int prueba = Algoritmos.factorial(6);
	assertEquals(resultadoesperado,prueba);
}
@Test
void testsPrimo() {
	boolean resultadoesperado = true;
	boolean prueba = Algoritmos.esPrimo(7);
	assertEquals(resultadoesperado,prueba);
}
@Test
void testsPrimo1() {
	boolean resultadoesperado = false;
	boolean prueba = Algoritmos.esPrimo(8);
	assertEquals(resultadoesperado,prueba);
}
@Test
void testfibonacci() {
	int resultadoesperado = 8;
	int prueba = Algoritmos.fibonacci(6);
	assertEquals(resultadoesperado,prueba);
}
}
