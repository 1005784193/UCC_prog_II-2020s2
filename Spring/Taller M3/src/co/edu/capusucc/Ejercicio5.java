package co.edu.capusucc;

import java.util.Scanner;

public class Ejercicio5 {
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
		float op = 0;
		float op2 = 0;
		float op3 = 0;
		String nom2 = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite su ruta (entre 1 - 4)");
		nom1 = scan.nextInt();
		switch (nom1) {
		case 1:
			nom = "1";
			System.out.println("Digite el tipo de servicio: (entre 1 - 2)");
			val = scan.nextInt();
			switch (val) {
			case 1:
				nom2 = "Corriente";
				seme = 200;
				op = (float) (200 * 0.3);
				op2 = (float) (op * 0.1);
				op3 = seme - op - op2;
				break;
			case 2:
				nom2 = "Ejecutivo";
				seme = 300;
				op = (float) (300 * 0.3);
				op2 = (float) (op * 0.1);
				op3 = seme - op - op2;

				break;
			}

			break;
		case 2:
			nom = "2";
			System.out.println("Digite el tipo de servicio: (entre 1 - 2)");
			val = scan.nextInt();
			switch (val) {
			case 1:
				nom2 = "Corriente";
				seme = 200;
				op = (float) (200 * 0.25);
				op2 = (float) (op * 0.15);
				op3 = seme - op - op2;
				break;
			case 2:
				nom2 = "Ejecutivo";
				seme = 300;
				op = (float) (300 * 0.25);
				op2 = (float) (op * 0.15);
				op3 = seme - op - op2;

				break;
			}
			break;
		case 3:
			nom = "3";
			System.out.println("Digite el tipo de servicio: (entre 1 - 2)");
			val = scan.nextInt();
			switch (val) {
			case 1:
				nom2 = "Corriente";
				seme = 200;
				op = (float) (200 * 0.2);
				op2 = (float) (op * 0.2);
				op3 = seme - op - op2;
				break;
			case 2:
				nom2 = "Ejecutivo";
				seme = 300;
				op = (float) (300 * 0.2);
				op2 = (float) (op * 0.2);
				op3 = seme - op - op2;

				break;
			}
			break;
		case 4:
			nom = "4";
			System.out.println("Digite el tipo de servicio: (entre 1 - 2)");
			val = scan.nextInt();
			switch (val) {
			case 1:
				nom2 = "Corriente";
				seme = 200;
				op = (float) (200 * 0.22);
				op2 = (float) (op * 0.2);
				op3 = seme - op - op2;
				break;
			case 2:
				nom2 = "Ejecutivo";
				seme = 300;
				op = (float) (300 * 0.22);
				op2 = (float) (op * 0.2);
				op3 = seme - op - op2;

				break;
			}
			break;
		default:
			nom1 = 0;
			System.out.println("Error");
		}
		System.out.println("La ruta escojida es la: "+ nom);
		System.out.println("El tipo de servicio es: "+nom2 );
		System.out.println("La utilidad es de: " + op3);

	}
}
