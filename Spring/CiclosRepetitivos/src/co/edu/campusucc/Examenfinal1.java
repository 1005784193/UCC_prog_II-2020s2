package co.edu.campusucc;
import java.util.Scanner;

public class Examenfinal1 {
	private static Scanner sc;
	public static void main(String[] args) {
		System.out.println("+|----------------------------------+");
		System.out.println("+ Autor:  Miguel Alberto Castro     +");
		System.out.println("+ Fecha:  16 / 11 / 2020            +");
		System.out.println("+-----------------------------------+");
		System.out.println();
		int num1 = 0;
		int entero = 1;
		int residuo = 1;
		int temp = 0;
		int suma = 0;
		String imput = "";
		String input = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserte un  numero con mas de un digito:");
		imput = scan.next();
		num1= Integer.parseInt(imput);
		System.out.println();
		while (num1>0) {
			residuo= num1 % 10;
			entero = num1 / 10;
			num1 = entero;
			suma = residuo + temp;
			temp = suma;
		}
		System.out.println("La suma de las cifras es de:"+ suma);
	}
}