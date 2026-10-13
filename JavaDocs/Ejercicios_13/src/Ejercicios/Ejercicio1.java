package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
     
		  Scanner teclado = new Scanner(System.in);

		     
		  System.out.println("Introduce tu nombre: ");
		  String nombre = teclado.nextLine();

		  System.out.println("Introduce tus apellidos: ");
		  String apellidos = teclado.nextLine();

		  System.out.println("Introduce tu fecha de nacimiento: ");
		  String fechaNacimiento = teclado.nextLine();

		  System.out.println("Introduce tu salario bruto: ");
		  double salarioBruto = teclado.nextDouble();

		  System.out.println("Introduce los años trabajando en la empresa: ");
		  int años = teclado.nextInt();

		  // Calculamos el 15% de IRPF
		  double irpf = salarioBruto * 0.15;

		  // Calculamos el salario neto
		  double salarioNeto = salarioBruto - irpf;

		  // Calculamos el aumento del 2% por cada año trabajado
		  double aumento = salarioBruto * 0.02 * años;

		  // Calculamos el salario total
		  double salarioTotal = salarioBruto + aumento;

		  // Mostramos los resultados
		  System.out.println("\n--- FICHA DEL EMPLEADO ---");
		  System.out.println("Nombre: " + nombre + " " + apellidos);
		  System.out.println("Fecha de nacimiento: " + fechaNacimiento);
		  System.out.println("Salario bruto: " + salarioBruto + " €");
		  System.out.println("Salario neto: " + salarioNeto + " €");
		  System.out.println("Aumento: " + aumento + " €");
		  System.out.println("Salario total: " + salarioTotal + " €");
		}

	}
