package co.edu.campusucc;

import java.util.Scanner;

public class ProgramaInManual001 {
public static void main(String[] args) {
	System.out.println("+|----------------------------------+");
	System.out.println("+ Autor:  Miguel Alberto Castro     +");
	System.out.println("+ Fecha:  24 / 10 / 2020            +");
	System.out.println("+-----------------------------------+");
	System.out.println();
	String numero = "";
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Digite un numero: ");
	numero = scan.next();
	
	System.out.println("El numero digitado es:" + numero);
} 

}
