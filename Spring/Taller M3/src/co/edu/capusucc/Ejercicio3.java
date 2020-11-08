package co.edu.capusucc;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		System.out.println("+|----------------------------------+");
		System.out.println("+ Autor:  Miguel Alberto Castro     +");
		System.out.println("+ Fecha:  07 / 11 / 2020            +");
		System.out.println("+-----------------------------------+");
		System.out.println();
		String nom = "";
		int cant = 0;
		int seme = 0;
		int val = 0;
		int nom1;
		int pre1 = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1. A");
		System.out.println("2. B");
		System.out.println("3. C");
		System.out.println("Ecoja un producto: ");
		nom1 = scan.nextInt();
		System.out.println("Digite la cantidad del producto: ");
		cant = scan.nextInt();
		switch (nom1) {
		case 1:
			if (cant < 501) {
				val = 500;
				System.out.println("El producto A se vende a cantidades menores a 501 unidades por : " + val);
			} else {
				if (cant > 500) {
					pre1 = 1000;
					System.out.println("El producto A se vende a cantidades mayores a 500 unidades por : " + pre1);
				}
			}	
			break;
		case 2:
			if (cant < 501) {
				val = 800;
				System.out.println("El producto A se vende a cantidades menores a 501 unidades por : " + val);
			} else {
				if (cant > 500) {
					pre1 = 1400;
					System.out.println("El producto A se vende a cantidades mayores a 500 unidades por : " + pre1);
				}
			}
			break;
		case 3:
			if (cant < 501) {
				val = 1000;
				System.out.println("El producto A se vende a cantidades menores a 501 unidades por : " + val);
			} else {
				if (cant > 500) {
					pre1 = 1600;
					System.out.println("El producto A se vende a cantidades mayores a 500 unidades por : " + pre1);
				}
			}	
			break;
		}
		
		

	}

}
