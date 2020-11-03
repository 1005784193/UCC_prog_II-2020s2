package miguel1;

import java.util.Scanner;

public class miguel2 {
public static void main(String[] args) {
	System.out.println("+|----------------------------------+");
	System.out.println("+ Autor:  Miguel Alberto Castro     +");
	System.out.println("+ Fecha:  01 / 11 / 2020            +");
	System.out.println("+-----------------------------------+");
	System.out.println();
	int num1 = 0;
	int num2 = 0;
	String imput = "";
	String input = "";
	Scanner scan = new Scanner(System.in);
	System.out.println("Inserte un primer numero:");
	imput = scan.next();
	num1= Integer.parseInt(imput);
	System.out.println("Inserte un segundo numero:");
	input = scan.next();
	num2= Integer.parseInt(input);
	int res1 = num1 + num2;
	int res2 = num1 - num2;
	int res3 = num1 * num2;
	int res4 = (num1 + num2)/2;
	System.out.println("La suma de: "+num1+" + "+num2+" es igual a: "+res1);
	System.out.println("La resta de: "+num1+" - "+num2+" es igual a : "+res2);
	System.out.println("La multiplicacion de: "+num1+" * "+num2+" es igual a: "+res3);
	System.out.println("El promedio de: "+num1+" entre "+num2+" es igual a : "+res4);
}
}