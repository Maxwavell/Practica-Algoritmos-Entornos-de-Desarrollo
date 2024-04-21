package app;
import util.Algoritmos;

public class Principal  {
	public static void main(String[] args) {
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 10) + 1;
        }

        int[] resultadoFibonacci = new int[5];
        int[] resultadoFactorial = new int[5];
        boolean[] resultadoPrimos = new boolean[5];

        for (int i = 0; i < numeros.length; i++) {
            resultadoFibonacci[i] = Algoritmos.fibonacci(numeros[i]);
            resultadoFactorial[i] =  Algoritmos.factorial(numeros[i]);
            resultadoPrimos[i] =  Algoritmos.esPrimo(numeros[i]);
        }
    }
}
