package co.edu.capusucc;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		System.out.println("+|----------------------------------+");
		System.out.println("+ Autor:  Miguel Alberto Castro     +");
		System.out.println("+ Fecha:  07 / 11 / 2020            +");
		System.out.println("+-----------------------------------+");
		System.out.println();
		String nom = "";
		int seme = 0;
		int val = 0;
		int nom1;
		String nom2 = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("1. Norte");
		System.out.println("2. Sur");
		System.out.println("3. Oriente grande");
		System.out.println("4. Occidente");
		System.out.println("Digite su ubicaciacion: ");
		nom1 = scan.nextInt();
		switch (nom1) {
		case 1:
			nom = "Norte";
			System.out.println("1. Pequeño");
			System.out.println("2. Mediano");
			System.out.println("3. Grande");
			System.out.println("Digite el tamaño: ");
			val = scan.nextInt();
			switch (val) {
			case 1: 
				nom2 = "Pequeño";
				seme = 500;
				break;
			case 2:
				nom2 = "Mediano";
				seme = 250;
				break;
			case 3:
				nom2 = "Grande";
				seme = 100;
				break;
			}

			break;
		case 2:
			nom = "Sur";
			System.out.println("1. Pequeño");
			System.out.println("2. Mediano");
			System.out.println("Digite el tamaño: ");
			val = scan.nextInt();
			switch (val) {
			case 1: 
				nom2 = "Pequeño";
				seme = 400;
				break;
			case 2:
				nom2 = "Mediano";
				seme = 200;
				break;
			}
			break;
		case 3:
			nom = "Oriente grande";
			nom2 = "Grande";
			seme = 100;
			break;
		case 4:
			nom = "Occidente";
			System.out.println("1. Pequeño");
			System.out.println("2. Grande");
			System.out.println("Digite el tamaño: ");
			val = scan.nextInt();
			switch (val) {
			case 1: 
				nom2 = "Pequeño";
				seme = 300;
				break;
			case 2:
				nom2 = "Grande";
				seme = 200;
				break;
			}
			break;
		default:
			nom1 = 0;
			System.out.println("Error");
		}
		System.out.println("Su ubicacion es " + nom);
		System.out.println("Es de tamaño: " + nom2);
		System.out.println("Tiene un costo por minuto de: " + seme);

	}
}