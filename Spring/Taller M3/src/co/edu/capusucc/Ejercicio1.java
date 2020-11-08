package co.edu.capusucc;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		System.out.println("+|----------------------------------+");
		System.out.println("+ Autor:  Miguel Alberto Castro     +");
		System.out.println("+ Fecha:  07 / 11 / 2020            +");
		System.out.println("+-----------------------------------+");
		System.out.println();
		String nom = "";
		int carre1 = 0;
		int seme = 0;
		int val = 0;
		String nom1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite su nombre");
		nom1 = scan.next();
		System.out.println("Digite una carrera donde 1. es economia, 2. es administracion y 3. ciencias");
		carre1 = scan.nextInt();
		System.out.println("Digite el semestre en el que se encuentra (entre 1 - 10)");
		seme = scan.nextInt();
		switch (carre1) {
		case 1:
			nom = "Econimia";
			switch (seme) {
			case 1:
			case 2:
			case 3:
				val = 1500;
				break;
			case 4:
			case 5:
			case 6:
			case 7:
				val = 2220;
				break;
			case 8:
			case 9:
			case 10:
				val = 3000;
				break;
			}
			break;
		case 2:
			nom = "Administracion";
			switch (seme) {
			case 1:
			case 2:
			case 3:
				val = 2000;
				break;
			case 4:
			case 5:
			case 6:
			case 7:
				val = 4000;
				break;
			case 8:
			case 9:
			case 10:
				val = 6000;
				break;
			}
			break;
		case 3:
			nom = "Ciencias";
			switch (seme) {
			case 1:
			case 2:
			case 3:
				val = 1800;
				break;
			case 4:
			case 5:
			case 6:
			case 7:
				val = 5000;
				break;
			case 8:
			case 9:
			case 10:
				val = 7000;
				break;
			}
			break;
		default:
			carre1 = 0;
			System.out.println("Error");
		}
		System.out.println("Nombre del alumno: "+nom1);
		System.out.println("Su plan es: "+nom);
		System.out.println("El valo a pagar es de: " + val);

	}
}