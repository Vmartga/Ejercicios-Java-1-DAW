package PedirDatos;

import java.util.Scanner;

public class PedirDatosUsuario {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nombre;
		byte edad;
		float altura;
		
		System.out.println("Escriba su nombre: ");
		nombre=teclado.nextLine();
		
		System.out.println("Escriba su edad: ");
		edad=teclado.nextByte();
		
		System.out.println("Escriba su altura: ");
		altura=teclado.nextFloat();
		
		System.out.println("\n Su nombre :" + nombre + "\n Su edad: " + edad + "\n Su altura: " + altura);
	}

}
