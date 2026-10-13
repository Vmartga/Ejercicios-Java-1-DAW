package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Pedimos una cantidad en euros
        System.out.println("Introduce una cantidad en euros: ");
        double euros = teclado.nextDouble();

        // Convertimos los euros a pesetas
        double pesetas = euros * 166;

        System.out.println(euros + " € son " + pesetas + " pesetas.");

        // Pedimos una cantidad en pesetas
        System.out.print("Introduce una cantidad en pesetas: ");
        pesetas = teclado.nextDouble();

        // Convertimos las pesetas a euros
        euros = pesetas / 166.386;

        System.out.println(pesetas + " pesetas son " + euros + " €.");

        
    }
}