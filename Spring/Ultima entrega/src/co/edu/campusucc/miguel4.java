package co.edu.campusucc;
import java.util.Scanner;

public class miguel4 {
public static void main(String[] args) {
	System.out.println("+|----------------------------------+");
	System.out.println("+ Autor:  Miguel Alberto Castro     +");
	System.out.println("+ Fecha:  01 / 11 / 2020            +");
	System.out.println("+-----------------------------------+");
	System.out.println();
	int num1 = 0;
	int num2 = 0;
	String name="";
	String imput = "";
	String input = "";
	String imput1 = "";
	Scanner scan = new Scanner(System.in);
	System.out.println("Ingrese el nombre del empleado:");
	imput1 = scan.next();
	name = String.valueOf(imput1);
	System.out.println("Inserte el salario:");
	imput = scan.next();
	num1= Integer.parseInt(imput);
	System.out.println("Inserte el valor a descontar:");
	input = scan.next();
	num2= Integer.parseInt(input);
	int res2 = num1 - num2;
	System.out.println("Nombre del empleado: "+name);
	System.out.println("Su salario es: "+num1);
	System.out.println("Su descuento es: "+num2);
	System.out.println("Su valor a pagar es: "+res2);
}
}