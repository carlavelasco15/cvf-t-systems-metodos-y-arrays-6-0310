package ejercicio8;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		int[] numeros = new int [10];
		
		llenarArray(numeros);
		mostrarArray(numeros);
	}
	
	public static void llenarArray(int[] array) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe 10 números: ");
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Número " + (i + 1) + ": ");
			array[i] = sc.nextInt(); 
		}
		
		sc.close();
	}
	
	public static void mostrarArray(int[] array) {
		System.out.println("Indice\tValor");
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(i + "\t" + array[i]);
		}
	}

}
