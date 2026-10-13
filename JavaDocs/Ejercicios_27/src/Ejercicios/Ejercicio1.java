package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String nombre;
		String apellido;
		String edad;
		int salario_des;
		
		System.out.println("Diganos los siguientes datos: ");
		
		System.out.print("Nombre: ");
		nombre=teclado.nextLine();
		
		System.out.print("Escriba su edad: ");
		edad=teclado.nextLine();
		
		System.out.print("Escriba su nota académica: ");
		salario_des=teclado.nextInt();
		

	}

}
