package miguel1;
import java.util.Scanner;

public class miguel6 {
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
	System.out.println("Inserte el valor de hora:");
	imput = scan.next();
	num1= Integer.parseInt(imput);
	System.out.println("Inserte las horas trabajadas:");
	input = scan.next();
	num2= Integer.parseInt(input);
	int res2 = num1 * num2;
	System.out.println("Nombre del empleado: "+name);
	System.out.println("Valor de hora: "+num1);
	System.out.println("Horas trabajadas: "+num2);
	System.out.println("Salario: "+res2);
}
}