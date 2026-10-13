package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nombre;
		byte edad;
		float nota;
		
		System.out.print("Escriba su nombre: ");
		nombre=teclado.nextLine();
		
		System.out.print("Escriba su edad: ");
		edad=teclado.nextByte();
		
		System.out.print("Escriba su nota académica: ");
		nota=teclado.nextFloat();
		
		
		if (edad >= 18 && nota >= 7) {
			System.out.println(nombre + " usted ha sido admitido."); //si la edad es mayor o igual a 18 y su nota es mayor o igual a 7 será admitido
		
		} else {
			System.out.println(nombre + " usted no ha sido admitido."); //si no cumple alguno de los requisitos anteriores será rechazado
			
		}
		
	  }

	}
