package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nombre;
		String apellidos;
		byte edad;
		float altura;
		float peso;
		
		System.out.println("Escriba su nombre: ");
		nombre=teclado.nextLine();
		
		System.out.println("Escriba sus apellidos: ");
		apellidos=teclado.nextLine();
		
		System.out.println("Escriba su edad: ");
		edad=teclado.nextByte();
		
		System.out.println("Escriba su altura: ");
		altura=teclado.nextFloat();
		
		System.out.println("Escriba su peso: ");
		peso=teclado.nextFloat();
		
		System.out.println("\n Nombre: " + nombre + "\n Apellidos: " + apellidos + "\n Edad: " + edad + "\n Altura: " + altura + "\n Peso: " + peso + "Kg");
	}

}