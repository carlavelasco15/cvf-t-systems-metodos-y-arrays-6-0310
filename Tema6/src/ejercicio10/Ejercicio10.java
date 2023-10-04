package ejercicio10;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tamano;

		do {
			System.out.print("Escribe un número entero positivo (tamaño del array): ");
			tamano = sc.nextInt();
		} while (tamano <= 0);
		
        System.out.print("Escribe el valor mínimo: ");
        int min = sc.nextInt();
        
        System.out.print("Escribe el valor máximo: ");
        int max = sc.nextInt();
        
        int[] numerosPrimos = generarNumerosPrimosAleatorios(tamano, min, max);
        int mayorPrimo = encontrarMayorPrimo(numerosPrimos);
        
        System.out.println("Numeros primos generados:");
        mostrarArray(numerosPrimos);
        System.out.println("El numero primo mas grande es: " + mayorPrimo);
        
        sc.close();
	}
	
	public static boolean esPrimo(int num) {
		if (num <= 1)
			return false;
		
		if (num <= 3)
			return true;
		
		if (num % 2 == 0 || num % 3 == 0)
			return false;
		
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0)
				return false;
		}
		
		return true;
	}
	
	public static int[] generarNumerosPrimosAleatorios(int tamano, int min, int max) {
		int [] primosAleatorios = new int[tamano];
		Random rand = new Random();
		int i = 0;
		
		while (i < tamano) {
			int numeroAleatorio = rand.nextInt((max-min) + 1) + min;
			if (esPrimo(numeroAleatorio)) {
				primosAleatorios[i] = numeroAleatorio;
				i++;
			}
		}
		return primosAleatorios;
	}
	
	public static int encontrarMayorPrimo(int[] array) {
		int mayorPrimo = 0;
		
		for (int numero: array) {
			if (numero > mayorPrimo) {
				mayorPrimo = numero;
			}
		}
		return mayorPrimo;
	}
	
	public static void mostrarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Posicion " + i + ": " + array[i]);
		}
	}

}
