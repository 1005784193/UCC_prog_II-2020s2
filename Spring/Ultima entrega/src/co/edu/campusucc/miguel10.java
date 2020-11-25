package co.edu.campusucc;
import java.util.Scanner;

public class miguel10 {
	public static void main(String[] args) {
		System.out.println("+|----------------------------------+");
		System.out.println("+ Autor:  Miguel Alberto Castro     +");
		System.out.println("+ Fecha:  01 / 11 / 2020            +");
		System.out.println("+-----------------------------------+");
		System.out.println();
		int num1 = 0;
		int num2 = 0;
		int hours = 48;
		int code = 0;
		String name = "";
		String imput = "";
		String input = "";
		String imput1 = "";
		String imput2 = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese el nombre del empleado:");
		imput1 = scan.next();
		name = String.valueOf(imput1);
		System.out.println("Inserte el codigo:");
		imput2 = scan.next();
		code = Integer.parseInt(imput2);
		System.out.println("Inserte el valor de hora:");
		imput = scan.next();
		num1 = Integer.parseInt(imput);
		System.out.println("Inserte las horas trabajadas:");
		input = scan.next();
		num2 = Integer.parseInt(input);
		int res2 = num1 * num2;
		int op2 = 0;
		int op3 = 0;
		int salde = 0;
		if (num2 > hours) {
			op2 = (num1 * 20) / 100;
			op3 = (num1 + op2);
			salde = op3 * num2;
			System.out.println("Nombre del empleado: "+name);
			System.out.println("Codigo : "+code);
			System.out.println("Valor de hora: "+op3);
			System.out.println("Horas trabajadas: "+num2);
			System.out.println("Salario: "+salde);
		} else {
			System.out.println("Nombre del empleado: " + name);
			System.out.println("Codigo : "+code);
			System.out.println("Valor de hora: " + num1);
			System.out.println("Horas trabajadas: " + num2);
			System.out.println("Salario: "+res2 );
		}

	}
}