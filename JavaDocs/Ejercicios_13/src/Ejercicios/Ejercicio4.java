package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        
        Scanner teclado = new Scanner(System.in);

        // Pedimos un número decimal
        System.out.println("Introduce un número decimal: ");
        double numero = teclado.nextDouble();

        // Aplicamos las funciones de Math
        double ceil = Math.ceil(numero);
        double floor = Math.floor(numero);
        long round = Math.round(numero);

        // Mostramos los resultados
        System.out.println("\n--- RESULTADOS ---");

        // ceil redondea hacia arriba
        System.out.println("Ceil: " + ceil);

        // floor redondea hacia abajo
        System.out.println("Floor: " + floor);

        // round redondea al número entero más cercano
        System.out.println("Round: " + round);

        
    }
}