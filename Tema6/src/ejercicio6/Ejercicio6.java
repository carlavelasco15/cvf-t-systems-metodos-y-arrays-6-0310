package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroDecimal;
		
		do {
			System.out.print("Escribe un número entero positivo: ");
			numeroDecimal = sc.nextInt();
		} while (numeroDecimal <= 0);
		
		int contador = contarCifrasNumero(numeroDecimal);
		System.out.println(contador);
		
		sc.close();
	}
	
	public static int contarCifrasNumero (int numero) {
		int i = 0;
		
		while (numero > 0) {
			numero /= 10;
			i++;
		}
		return i;
	}

}
