package Operaciones;

import java.util.Scanner;

public class OperacionDoble {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numero, resultado;
		System.out.println("Escriba un número para saber su doble: ");
		numero=teclado.nextInt();
		
		resultado=numero*2;
		System.out.println("El doble de su número es: " + numero*2);
		
		int multiplicacion;
		System.out.println("El doble del doble de su número es: " + resultado*2);
		
		int num1;
		double num2;
		System.out.println("Escriba el primer número de la división: ");
		num1 = teclado.nextInt();
		
		System.out.println("Escriba el segundo número de la división: ");
		num2 =teclado.nextDouble();
		
		double resultdiv = num1 / num2;
		System.out.println("El resultado de su division es: " + resultdiv);
	}

}
