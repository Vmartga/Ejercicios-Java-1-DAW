package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nombre;
		String apellidos;
		byte edad;
		
		
		System.out.print("Escriba su edad: ");
		edad=teclado.nextByte();
		
		
		if (edad >= 18) {
			System.out.println("Usted será admitido, ahora diga los siguientes datos.");
			
			System.out.println("\n--- DATOS DEL ADMITIDO ---"); //Decoración para empezar los datos del admitido.
			
			System.out.print("Escriba su nombre: ");
			nombre=teclado.nextLine();
			
			teclado.nextLine();
			
			System.out.print("Escriba su apellido: ");
			apellidos=teclado.nextLine();
		
		} else {
			System.out.println("Usted no será admitido."); //else es lo que pasará si lo de if no se cumple.
			
		}
		
	  }

	}
