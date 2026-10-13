package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String nombre;
		String apellidos;
		double importe1;
		double importe2;
		double importe3;
		double importe4;
		
		
		System.out.print("Diganos su nombre: ");
		nombre=teclado.nextLine();
		
		System.out.print("Diganos sus apellidos: ");
		apellidos=teclado.nextLine();
		
		System.out.print("Cuál fue su importe de compra 1: ");
		importe1=teclado.nextDouble();
		
		System.out.print("Cuál fue su importe de compra 2: ");
		importe2=teclado.nextDouble();
		
		System.out.print("Cuál fue su importe de compra 3: ");
		importe3=teclado.nextDouble();
		
		System.out.print("Cuál fue su importe de compra 4: ");
		importe4=teclado.nextDouble();
		
		//Suma y calculo del total y la media de los 4 importes del cliente
		
		double totalimportes = importe1 + importe2 + importe3 + importe4;
		
		double mediaimportes = totalimportes / 4;
		
		// Datos del cliente
		
        System.out.println("\n----- FICHA DEL CLIENTE -----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Importe gastado 1: " + importe1 + " €");
        System.out.println("Importe gastado 2: " + importe2 + " €");
        System.out.println("Importe gastado 3: " + importe3 + " €");
        System.out.println("Importe gastado 4: " + importe4 + " €");
        System.out.println("Total gastado: " + totalimportes + " €");
        System.out.println("Media gastada: " + mediaimportes + " €");
        
        // Comprobamos si puede obtener el vale o no
        
        if (totalimportes >= 300) {
            System.out.println(nombre + " usted obtendrá el vale descuento de 50 €.");
        } else {
            System.out.println(nombre + " usted no obtendrá el vale de descuento.");
        }
		

	}

}