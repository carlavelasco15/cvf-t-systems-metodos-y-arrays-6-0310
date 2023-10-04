package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Que figura quieres calcular (circulo, cuadrado, triangulo): ");
		
		String name = sc.nextLine();
		
		switch(name) {
		  case "circulo":
			  double radio = pedirValor("radio", sc);
			  double areaCirculo = areaCirculo(radio);
			  System.out.println("El área del circulo es: " + areaCirculo);
			  break;
		  case "triangulo":
			  double base = pedirValor("base", sc);
			  double altura = pedirValor("altura", sc);
			  double areaTriangulo = areaTriangulo(base, altura);
			  System.out.println("El área del triangulo es: " + areaTriangulo);
			  break;
		  case "cuadrado":
			  double lado = pedirValor("lado", sc);
			  double areaCuadrado = areaCuadrado (lado);
			  System.out.println("El área del circulo es: " + areaCuadrado);
			  break;
		  default:
			  System.out.println("Opción no válida.");
		}
		
		sc.close();
	}
	
	public static double pedirValor(String figura, Scanner sc) {
		System.out.print("Escribe el valor de " + figura + ": ");
		return sc.nextDouble();
	}
	
	public static double areaCirculo(double radio) {
		final double PI = 3.14159;
		return Math.floor(Math.sqrt(radio) * PI);
	}
	
	public static double areaTriangulo(double base, double altura) {
		return (base * altura) / 2;
	}
	
	public static double areaCuadrado(double lado) {
		return Math.floor(lado * lado);
	}

}
