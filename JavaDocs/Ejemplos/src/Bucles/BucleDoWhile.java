package Bucles;

import java.util.Scanner;

public class BucleDoWhile {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int numero, suma = 0;
		suma = 0;
		
		do {
			System.out.println("Dime un número:");
			numero = teclado.nextInt();
			
			suma = suma + numero;
			} while (numero != 0); //hasta que no pongamos un 0 no parará de añadir números a la suma
		
		System.out.println("La suma es: " + suma);
	}

}
