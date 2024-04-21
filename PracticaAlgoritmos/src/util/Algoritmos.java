package util;

public abstract class Algoritmos {

	public static int fibonacci(int numero) {
	        if (numero <= 1) {
	            return numero;
	        } else {
	            return fibonacci(numero - 1) + fibonacci(numero - 2);
	        }
	    }
	
	public static int factorial(int numero) {
        if (numero < 0) {
            System.out.println("El número debe ser no negativo.");
            return -1; // O cualquier valor que desees para indicar un error
        }
        int resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

}
