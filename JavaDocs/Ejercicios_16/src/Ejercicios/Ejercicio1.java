package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print("Digame el primer número: ");
		num1 = teclado.nextInt();
		
		System.out.print("Digame el segundo número: ");
		num2 = teclado.nextInt();
		
		if (num1 > num2) {
			System.out.println("El número " + num1 + ", es mayor que el número " + num2 + "."); //CAMBIAR LOS IF 2 y 3 POR ELSE
		}
		
		if (num2 < num1) {
			System.out.println("El número " + num2 + ", es menor que el número " + num1 + ".");
		}
		
		if (num2 == num1) {
			System.out.println("Ambos números son iguales.");
		}

	}

}
