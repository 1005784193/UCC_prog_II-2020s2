package miguel1;
import java.util.Scanner;

public class miguel11 {
public static void main(String[] args) {
	System.out.println("+|----------------------------------+");
	System.out.println("+ Autor:  Miguel Alberto Castro     +");
	System.out.println("+ Fecha:  01 / 11 / 2020            +");
	System.out.println("+-----------------------------------+");
	System.out.println();
	int num1 = 0;
	String imput = "";
	Scanner scan = new Scanner(System.in);
	System.out.println("Inserte un numero:");
	imput = scan.next();
	num1= Integer.parseInt(imput);
	int op = 0;
	if (num1<0) {
		op= num1*(-1);
		System.out.println("El valor absoluto es:"+op);
	}else {
		System.out.println("El valor absoluto es:"+num1);
	}
	
	
}
}