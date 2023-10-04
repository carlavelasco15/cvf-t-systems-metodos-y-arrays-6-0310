package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroDecimal;
		
		do {
			System.out.print("Escribe un número decimal: ");
			numeroDecimal = sc.nextInt();
		} while (numeroDecimal < 0);
        
        	String numeroBinario = deDecimalABinario(numeroDecimal);
        	System.out.println("El numero binario es: " + numeroBinario);        	
        
        sc.close();
	}
	
	public static String deDecimalABinario(int numeroDecimal) {
		if (numeroDecimal == 0) {
			return "0";
		}
		
		String binario = "";
		
		while (numeroDecimal > 0) {
			int resto = numeroDecimal % 2;
			binario = resto + binario;
			numeroDecimal /= 2;
		}
		return binario; 
	}

}
