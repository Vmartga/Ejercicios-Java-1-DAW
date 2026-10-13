package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String NomClub;
		int AñoFund;
		String Estadio;
		String NomCapit;
		
		System.out.println("Nombre del equipo: ");
		NomClub=teclado.nextLine();
		
		System.out.println("Año de fundación: ");
		AñoFund=teclado.nextInt();
		teclado.nextLine();
		
		System.out.println("Nombre del estadio del club: ");
		Estadio=teclado.nextLine();
		
		System.out.println("Nombre del capitán del equipo: ");
		NomCapit=teclado.nextLine();
		
		System.out.println("\n Nombre de club: " + NomClub + "\n Año de fundación: " + AñoFund + "\n Nombre del estadio del Club: " + Estadio + "\n Nombre del capitán del equipo: " + NomCapit);
		

	}

}