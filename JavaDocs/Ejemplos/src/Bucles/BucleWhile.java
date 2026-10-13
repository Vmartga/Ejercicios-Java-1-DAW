/*
 * Objetivo: Pedir números y sumarlos hasta 0.
 * Autor: Víctor Martín Garrido.
 * Fecha: 0510/2026
 */



package Bucles;

import java.util.Scanner;

public class BucleWhile {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numero, suma; //Definimos las variables.
		
		suma = 0; //Se le colocará 0 para que empiece a sumar desde este, si ponemos otro valor comenzará a sumar desde ese número.
		
		//(ESTA ES LA SEGUNDA MANERA DE HACERLO, ASÍ QUEDA MÁS "ELEGANTE" Y NO "ENGAÑAS AL BUCLE PARA QUE COMIENCE")
		
		System.out.println("Dime un número: (0 para salir)");
		numero = teclado.nextInt();
				
		
		//ESTO ES LO QUE PEDIMOS QUE EL BUCLE HAGA
		while (numero != 0) {
		suma = suma + numero;
		System.out.println("Dime un número: (0 para salir)");
		numero = teclado.nextInt();
		}
		
		System.out.println("La suma es: " + suma);
		
		
	}

}
