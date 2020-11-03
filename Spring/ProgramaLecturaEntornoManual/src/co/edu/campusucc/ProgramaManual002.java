package co.edu.campusucc;

import java.util.Scanner;

public class ProgramaManual002 {
	public static void main(String[] args) {
		System.out.println("+|----------------------------------+");
		System.out.println("+ Autor:  Miguel Alberto Castro     +");
		System.out.println("+ Fecha:  24 / 10 / 2020            +");
		System.out.println("+-----------------------------------+");
		System.out.println();
		Boolean l1 = null;
		int q = 0;
		Boolean l2 = null;
		int p = 0;
		String imput = "";
		String input = "";
		Boolean k = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("¿La tierra es redonda [0]..FALSO [1]..VERDAD?");
		imput = scan.next();
		q = Integer.parseInt(imput);
		if (q == 1) {
			l1 = Boolean.valueOf(imput);
			l1 = true;
		} else {
			l1 = Boolean.valueOf(imput);
			l1 = false;

		}
		Scanner scan1 = new Scanner(System.in);
		System.out.println("¿25 es un cuadrado perfecto [0]..FALSO [1]..VERDAD?");
		input = scan.next();
		p = Integer.parseInt(input);
		if (p == 1) {
			l2 = Boolean.valueOf(input);
			l2 = true;
		} else {
			l2 = Boolean.valueOf(input);
			l2 = false;

		}
		k = (l1 && l2);
		System.out.println(k);
	}
}