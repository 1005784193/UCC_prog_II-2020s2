package ExplicacionCiclos;

import java.util.Scanner;

public class Examenfinal3 {
	private static Scanner sc;

	public static void main(String[] args) {
		System.out.println("+|----------------------------------+");
		System.out.println("+ Autor:  Miguel Alberto Castro     +");
		System.out.println("+ Fecha:  16 / 11 / 2020            +");
		System.out.println("+-----------------------------------+");
		System.out.println();
		int numero, numero1;
		long falta, numeroInvertido, resto;
		String imput = "";
		String input = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserte un  numero con mas de un digito:");
		imput = scan.next();
		System.out.println("Inserte un digito:");
		input = scan.next();
		numero1 = Integer.parseInt(input);

		char[] digits1 = imput.toCharArray();
		for (int i = 0; i < digits1.length; i++) {
			if (digits1[i] == numero1) {
				System.out.println("El digito esta");
				
				break;
			} else {
				System.out.println("El digito no esta");
				break;
			}
		}

	}
}