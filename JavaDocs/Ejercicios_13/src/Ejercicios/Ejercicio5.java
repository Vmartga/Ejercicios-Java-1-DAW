package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        
        Scanner teclado = new Scanner(System.in);

        // Pedimos los dos números
        System.out.println("Introduce el primer número: ");
        double num1 = teclado.nextDouble();

        System.out.println("Introduce el segundo número: ");
        double num2 = teclado.nextDouble();

        // Calculamos cuál es el número menor
        double menor = Math.min(num1, num2);

        // Elevamos el primer número al segundo
        double potencia = Math.pow(num1, num2);

        // Calculamos la raíz cuadrada del primer número
        double raiz = Math.sqrt(num1);

        // Generamos un número aleatorio entre 0 y el segundo número
        double random = Math.random() * num2;

        // Mostramos los resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("El número menor es: " + menor);
        System.out.println(num1 + " elevado a " + num2 + " = " + potencia);
        System.out.println("La raíz cuadrada de " + num1 + " = " + raiz);
        System.out.println("Número random: " + random);

        
    }
}