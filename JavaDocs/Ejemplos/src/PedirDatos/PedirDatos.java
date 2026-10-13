package PedirDatos;

import java.util.Scanner;

public class PedirDatos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int unNumero;
		System.out.println("Dame un número: ");
		unNumero = teclado.nextInt(); //dependiendo de si queremos decimal, entero, etc; cambiaremos .nextInt, .nextDouble, etc
		System.out.println("El número es:" + unNumero);
		teclado.close();

	}

}
