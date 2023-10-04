package ejercicio12;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tamano;
		do {
			System.out.print("Escribe un número entero positivo (tamaño del array): ");
			tamano = sc.nextInt();
		} while (tamano <= 0);
		
		int digito;
        do {
            System.out.print("Escribe el numero (0-9) para buscar números terminados en: ");
            digito = sc.nextInt();
        } while (digito < 0 || digito > 9);
	
		int [] numeros = new int [tamano];
		llenarArrayAleatorio(numeros);
		int[] numerosTerminadosEn = numerosTerimadosEn(numeros, digito);
		
		System.out.println("Números aleatorios generados:");
        mostrarArray(numeros);

        System.out.println("\nNúmeros que terminan en " + digito + ":");
        mostrarArray(numerosTerminadosEn);
        
        sc.close();
	}
	
	public static void llenarArrayAleatorio(int[] array) {
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(301);
        }
    }
	
	public static int[] numerosTerimadosEn(int[] array, int digito) {
		int contador = 0;
		
		for (int i = 0; i < array.length; i++) {
            if (array[i] % 10 == digito) {
                contador++;
            }
        }
		int[] numerosTerminadosEn = new int[contador];
		contador = 0;
		
		for (int i = 0; i < array.length; i++) {
				if (array[i] % 10 == digito) {
					numerosTerminadosEn[contador] = array[i];
					contador++;
				}
			}
		return numerosTerminadosEn;
	}
	
	public static void mostrarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}


