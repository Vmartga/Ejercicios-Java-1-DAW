package Bucles;

import java.util.Scanner;

public class BucleDoWhileEjercicio {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numero, sumaPares; 
		
		sumaPares = 0; 
		
		do{
			System.out.println("Dime un número: (número negativo para salir)");
		numero = teclado.nextInt();
		if (numero % 2 == 0) {
			sumaPares = sumaPares + numero;
			}
		
		} while (numero > 0);
		System.out.println("La suma de los pares es: " + sumaPares);

	}

}
