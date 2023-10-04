package ejercicio2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int min, max;
		int cantidad;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Escribe la cantidad de números aleatorios a generar: ");
			cantidad = sc.nextInt();			
		} while (cantidad <= 0);
        
        System.out.print("Escribe el valor mínimo: ");
        min = sc.nextInt();
        System.out.print("Escribe el valor máximo: ");
        max = sc.nextInt();
        
        for (int i = 0; i < cantidad; i++) {
        	int numeroAleatorio = generarNumeroRango(min, max);
        	System.out.println("Numero aleatorio " + (i + 1) + ": " + numeroAleatorio );
        }
        
        sc.close();
	}
	
	public static int generarNumeroRango(int min, int max) {
		Random ran = new Random();
		return ran.nextInt((max - min) + 1) + min;
	}

}
