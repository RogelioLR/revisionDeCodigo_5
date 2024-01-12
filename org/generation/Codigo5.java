package org.generation;

import java.util.Scanner;

public class Codigo5 {

	// Se crea el método main para ejecutar el programa.
		public static void main(String[] args) {
			
			// Configuramos Scanner y una variable para 
			// el numero introducido por el usuario
			Scanner scanner = new Scanner(System.in);
			System.out.print("Introduzca un número: ");
			int numero = scanner.nextInt();
			scanner.close();
			
			int afortunado = 0;
			int numeroIntroducido = numero;
			
			// Separamos el bucle While del bloque condicional IF
			while (numeroIntroducido > 0) {
				int digit = numeroIntroducido % 10;
				// Se compara digit con alguno de los siguientes valores según la condición.
				if (digit == 3 || digit > 6) {
					afortunado++;
				} else {
					afortunado--;
				}
				numeroIntroducido /= 10;
			}

			// Se comparan las coincidencias de afortunado contra noAfortunado.
			if (afortunado > 0) {
				System.out.println("El " + numero + " es un número afortunado.");
			} else {
				System.out.println("El " + numero + " no es un número afortunado.");
			}
			
			
		}
    	
}
  