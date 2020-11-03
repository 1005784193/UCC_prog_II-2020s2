package miguel1;
import java.util.Scanner;

public class miguel13 {
public static void main(String[] args) {
	System.out.println("+|----------------------------------+");
	System.out.println("+ Autor:  Miguel Alberto Castro     +");
	System.out.println("+ Fecha:  01 / 11 / 2020            +");
	System.out.println("+-----------------------------------+");
	System.out.println();
	int num1 = 0;
	String imput = "";
	Scanner scan = new Scanner(System.in);
	System.out.println("Inserte la produccion total:");
	imput = scan.next();
	num1= Integer.parseInt(imput);
	int res1 = num1 * 2/3;
	int res2 = num1 - res1;
	System.out.println("La produccion de Hobbies es:"+res1);
	System.out.println("La produccion de Calvin es:"+res2);
	
}
}