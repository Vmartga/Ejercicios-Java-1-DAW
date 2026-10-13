package Operaciones;

import java.util.Scanner;

public class MayorEdad {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime tu edad: ");
		byte edad = teclado.nextByte();
		
		String mensaje;
		mensaje = (edad >= 18) ? "Eres mayor de edad": "Eres menor de edad";
		
		System.out.println(mensaje);

	}

}
