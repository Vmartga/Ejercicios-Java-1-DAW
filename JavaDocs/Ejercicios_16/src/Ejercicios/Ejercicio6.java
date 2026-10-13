package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String nombre;
		String apellidos;
		String ciclo;
		byte nota;
		
		System.out.print("Su nombre es: ");
		nombre=teclado.nextLine();
		
		System.out.print("Sus apellidos son: ");
		apellidos=teclado.nextLine();
		
		System.out.print("Su ciclo de formación profesional es: ");
		ciclo=teclado.nextLine();
		
		System.out.print("Escriba su nota académica: ");
        nota = teclado.nextByte();
        
        //Ponemos como vamos a ver dependiendo de la nota que tengamos si es insuficiente, aprobado, bien, notable o sobresaliente
        
        String notapalabra;
		
        if (nota < 0 || nota > 10) {
            notapalabra = "LA NOTA INTRODUCIDA ES INCORRECTA, 1 a 10";
        }
        else if (nota < 5) {
            notapalabra = "Insuficiente";
        }
        else if (nota < 6) {
            notapalabra = "Aprobado";
        }
        else if (nota < 7) {
            notapalabra = "Bien";
        }
        else if (nota < 9) {
            notapalabra = "Notable";
        }
        else if (nota < 10) {
            notapalabra = "Sobresaliente";
        }
        else {
            notapalabra = "Matrícula de Honor";
        }
		
     // Ficha del alumno
        System.out.println("\n----- FICHA DEL ALUMNO -----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Ciclo Formativo: " + ciclo);
        System.out.println("Nota: " + nota + " " + "(" + notapalabra + ")");

	}

}
