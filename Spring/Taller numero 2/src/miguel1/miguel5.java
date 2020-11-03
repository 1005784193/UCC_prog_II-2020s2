package miguel1;
import java.util.Scanner;

public class miguel5 {
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
	System.out.println("Inserte el costo del producto:");
	imput = scan.next();
	num1= Integer.parseInt(imput);
	System.out.println("Inserte con cuanto paga el clinete:");
	input = scan.next();
	num2= Integer.parseInt(input);
	int res = num1 - num2;
	int op = 0;
	if (res<0) {
		op= res*(-1);
	}
	System.out.println("El cambio es de:"+op);
	
}
}