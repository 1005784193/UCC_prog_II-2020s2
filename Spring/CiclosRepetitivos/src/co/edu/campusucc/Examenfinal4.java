package co.edu.campusucc;

import java.util.Scanner;

public class Examenfinal4 {
	public static void main(String[] args) {
		System.out.println("+|----------------------------------+");
		System.out.println("+ Autor:  Miguel Alberto Castro     +");
		System.out.println("+ Fecha:  16 / 11 / 2020            +");
		System.out.println("+-----------------------------------+");
		System.out.println();
		Scanner leer = new Scanner(System.in); 
		int maximo;
		int num;
		int mayor;
		int cont, valor = 0, suma = 0;

		System.out.println("Inserte el m�ximo de n�meros: ");
		maximo = leer.nextInt();

		for (cont = 0; cont < maximo; cont++) {
			System.out.println("Inserte un n�mero: ");
			num = leer.nextInt();
			valor = valor + num;

		}

		System.out.println("numero " + valor);

	}
}