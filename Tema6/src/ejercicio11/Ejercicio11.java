package ejercicio11;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tamano;
		
		do {
			System.out.print("Escribe un número entero positivo (tamaño del array): ");
			tamano = sc.nextInt();
		} while (tamano <= 0);
		
		
		int [] arrayAleatorio = new int[tamano];
		int [] arrayCopia = new int[tamano];
		
		llenarArrayAleatorio(arrayAleatorio);
		arrayCopia = arrayAleatorio;
		llenarArrayAleatorio(arrayCopia);
		
		int [] resultado = multiplicarArrays(arrayAleatorio, arrayCopia);
		
		System.out.println("Contenido del primer array:");
        mostrarArray(arrayAleatorio);

        System.out.println("\nContenido del segundo array:");
        mostrarArray(arrayCopia);

        System.out.println("\nResultado de la multiplicación de los dos arrays:");
        mostrarArray(resultado);

        sc.close();
		
	}
	
	public static void llenarArrayAleatorio(int[] array) {
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(101);
        }
    }
	
	public static int[] multiplicarArrays(int[] array1, int[] array2) {
        int[] resultado = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            resultado[i] = array1[i] * array2[i];
        }

        return resultado;
    }
	
	public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posición " + i + ": " + array[i]);
        }
    }

}
