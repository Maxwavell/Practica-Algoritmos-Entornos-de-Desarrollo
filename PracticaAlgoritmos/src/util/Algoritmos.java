package util;

/**
 * Esta clase contiene varios algoritmos matemáticos.
 */
public abstract class Algoritmos {

	/**
	 * Calcula el valor de la posicion solicitada en el método siguiendo la sucesión
	 * de fibonacci
	 *
	 * @param posición de Fibonacci que se desea calcular.
	 * @return El valor de la posición de la secuencia de Fibonacci especificada.
	 */
	public static int fibonacci(int numero) {
		if (numero <= 1) {
			return numero;
		} else {
			return fibonacci(numero - 1) + fibonacci(numero - 2);
		}
	}

	/**
	 * Calcula el factorial de un número entero.
	 * 
	 * @param numero El número entero del cual se calculará el factorial.
	 * @return El factorial del número dado.
	 */
	public static int factorial(int numero) {
		int resultado = 1;
		for (int i = numero; i > 1; i--) {
			resultado *= i;
		}
		return resultado;
	}

	/**
	 * Verifica si un número entero dado es primo.
	 *
	 * @param numero El número entero que se desea verificar si es primo.
	 * @return true si el número dado es primo, false en caso contrario.
	 */
	public static boolean esPrimo(int numero) {
		if (numero <= 1) {
			return false;
		}
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}
}
