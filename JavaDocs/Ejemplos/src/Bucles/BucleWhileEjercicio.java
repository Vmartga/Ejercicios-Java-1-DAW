/*
 * Objetivo: Programa que se detanga cuando el usuario ponga un número NEGATIVO, y este SOLO va a sumar los números pares.
 * Autor: Víctor Martín Garrido.
 * Fecha: 0510/2026
 */

package Bucles;

import java.util.Scanner;

public class BucleWhileEjercicio {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numero, sumaPares; 
		
		sumaPares = 0; 
		
		System.out.println("Dime un número: (número negativo para salir)");
		numero = teclado.nextInt();
		
		while (numero > 0) {
			if (numero % 2 == 0) {
				sumaPares = sumaPares + numero;
			}
			
			System.out.println("Dime un número: (número negativo para salir)");
			numero = teclado.nextInt();
		}
		
		System.out.println("La suma es: " + sumaPares);
	}

}
