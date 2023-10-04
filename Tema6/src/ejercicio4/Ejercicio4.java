package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		do {
			System.out.print("Escribe un número para calcular su factorial: ");
			num = sc.nextInt();			
		} while (num <= 0);
		
		double factorial = calcularFactiorial(num);
		
		System.out.println("El factorial de " + num + " es " + factorial);
	}
	
	public static double calcularFactiorial(int num) {
		double factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial *= i;
		}
		return factorial;
	}
	

}
