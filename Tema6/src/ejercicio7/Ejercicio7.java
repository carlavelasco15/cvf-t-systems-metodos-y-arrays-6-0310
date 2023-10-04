package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroDecimal;
		String moneda;

		do {
			System.out.print("Escribe un número entero positivo: ");
			numeroDecimal = sc.nextInt();
		} while (numeroDecimal <= 0);
		
		do {
			 System.out.print("Ingrese la moneda a la que desea convertir (dolar/yen/libra): ");
			 moneda = sc.nextLine();
		} while (!moneda.equals("dolar") && !moneda.equals("yen") && !moneda.equals("libra"));
		
		convertirDivisa(numeroDecimal, moneda);
		
		sc.close();
	}
	
	public static void convertirDivisa(double cantidadEuros, String moneda) {
		double convertido = 0;
		
		switch (moneda) {
			case "yen":
				convertido = cantidadEuros * 129.852;
				break;
			case "dolar":
				convertido = cantidadEuros * 1.28611;
				break;
			case "libra":
				convertido = cantidadEuros * 0.86;
				break;
			default:
				System.out.println("Valor no válido");
				break;
		}
		
		System.out.println(cantidadEuros + " euros equivalen a " + convertido + " " + moneda + ".");
    }
}


