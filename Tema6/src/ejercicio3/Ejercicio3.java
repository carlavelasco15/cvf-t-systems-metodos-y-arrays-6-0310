package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe un numero: ");
		int num = sc.nextInt();
		
		boolean esPrimo = esPrimo(num);

		if (esPrimo)
			System.out.println(num + " es un numero primo.");
		else
			System.out.println(num + " NO es un numero primo.");

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

}
