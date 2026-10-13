package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        
        Scanner teclado = new Scanner(System.in);

        // Pedimos los dos números
        System.out.println("Introduce el primer número: ");
        int num1 = teclado.nextInt();

        System.out.println("Introduce el segundo número: ");
        int num2 = teclado.nextInt();

        // Mostramos los valores originales
        System.out.println("\nAntes del intercambio:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Creamos una variable auxiliar para realizar el intercambio
        int auxiliar = num1;
        num1 = num2;
        num2 = auxiliar;

        // Mostramos los valores después del intercambio
        System.out.println("\nDespués del intercambio:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        
    }
}