package miguel1;

import java.util.Scanner;

public class miguel1 {
	public static void main(String[] args) {
		System.out.println("+|----------------------------------+");
		System.out.println("+ Autor:  Miguel Alberto Castro     +");
		System.out.println("+ Fecha:  01 / 11 / 2020            +");
		System.out.println("+-----------------------------------+");
		System.out.println();
		double num1 = 0;
		double resultado = 0;
		String imput = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite un numero: ");
		imput = scan.next();
		num1 = Integer.parseInt(imput);
		resultado = Math.pow(num1, 3);
		System.out.println("El resultado es= " + resultado);
		
	}
}