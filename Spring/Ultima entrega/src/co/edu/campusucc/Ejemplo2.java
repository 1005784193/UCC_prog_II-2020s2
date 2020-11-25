package co.edu.campusucc;

import java.util.Scanner;

public class Ejemplo2 {
	public static void main(String[] args) {
		System.out.println("+|----------------------------------+");
		System.out.println("+ Autor:  Miguel Alberto Castro     +");
		System.out.println("+ Fecha:  07 / 11 / 2020            +");
		System.out.println("+-----------------------------------+");
		System.out.println();
		String nom = "";
		double sueldo = 0;
		int cate = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite el nombre del empleado");
		nom = scan.next();
		scan.reset ();
		System.out.println("Digite la categoria por favor (entre 1 - 4)");
		cate = scan.nextInt();
		System.out.println("Digite el sueldo por favor");
		sueldo = scan.nextDouble();

		switch (cate) {
		case 1:
			sueldo = sueldo * 1.15;
			break;
		case 2:
			sueldo = sueldo * 1.10;
			break;
		case 3:
			sueldo = sueldo * 1.18;
			break;
		case 4:
			sueldo = sueldo * 1.17;
			break;
		default:
			sueldo = 0;
			System.out.println("Error");
		}
		System.out.println("El empleado: "+ nom);
		System.out.println("Tiene de sueldo: "+ sueldo);
		
	}
}