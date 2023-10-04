package ejercicio9;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tamano;

		do {
			System.out.print("Escribe un número entero positivo (tamaño del array): ");
			tamano = sc.nextInt();
		} while (tamano <= 0);
		
		int[] numeros = new int[tamano];
		llenarArray(numeros, 0, 9);
		mostrarArrayYSuma(numeros);
		
		sc.close();
	}
	
	
	public static void llenarArray(int[] array, int min, int max) {
		Random rand = new Random();
		
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt((max-min) + 1) + min; 
		}
	}
	
	public static void mostrarArrayYSuma(int[] array) {
		int total = 0;
		System.out.println("Valores del array:");
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Posición " + i + ": " + array[i]);
			total += array[i];
		}
		
		System.out.println("Suma de todos los valores: " + total);
	}

}
