package co.edu.campusucc;
import java.util.Scanner;

public class Examenfinal {
	private static Scanner sc;
	public static void main(String[] args) {
		System.out.println("+|----------------------------------+");
		System.out.println("+ Autor:  Miguel Alberto Castro     +");
		System.out.println("+ Fecha:  16 / 11 / 2020            +");
		System.out.println("+-----------------------------------+");
		System.out.println();
		int num;
        sc = new Scanner(System.in);
        System.out.print("Introduce un n�mero para invertir: ");
        num = sc.nextInt();
        sc.close();
        System.out.printf("%nEl n�mero %d invertido es el %d", num, invertirNumero(num) );
    }
     
    private static int invertirNumero(int numero){
        int cifra, inverso = 0;
        while(numero!=0){
            cifra = numero%10;
            inverso = (inverso * 10) + cifra;
            numero/=10;
        }
        return inverso;

	}
}